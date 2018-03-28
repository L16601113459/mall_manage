package com.atguigu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.atguigu.bean.T_MALL_PRODUCT;
import com.atguigu.service.SpuServiceInf;
import com.atguigu.util.MyFileUpload;

@Controller
public class SpuController {
	
	@Autowired
	SpuServiceInf spuServiceInf;
	
	@ResponseBody
	@RequestMapping("get_spu_list")
	public List<T_MALL_PRODUCT> get_spu_list(int pp_id, int flbh2){
		List<T_MALL_PRODUCT> list_spu = spuServiceInf.get_spu_list(pp_id,flbh2);
		return list_spu;
		
	}
	
	@RequestMapping("goto_spu_add")
	public String goto_spu_add(ModelMap map, T_MALL_PRODUCT spu) {
		
		map.put("spu", spu);
		return "spuAdd";
	}
	
	@RequestMapping("spu_add")
	public ModelAndView spu_add(@RequestParam("files") MultipartFile[] files, T_MALL_PRODUCT spu) {
		
		// 通过工具类上传图片，保存到集合
		List<String> list_image = MyFileUpload.upload_image(files);
		
		// 保存商品信息
		spuServiceInf.save_spu(spu,list_image);
		//goto_spu_add
		ModelAndView mv = new ModelAndView("redirect:/index.do");
		int class_1_id = spu.getFlbh1();
		int class_2_id = spu.getFlbh2();
		int tm_id = spu.getPp_id();
//		mv.addObject("flbh1", spu.getFlbh1());
//		mv.addObject("flbh2", spu.getFlbh2());
//		mv.addObject("pp_id", spu.getPp_id());
		mv.addObject("url", "goto_spu_add.do?flbh1="+class_1_id+"&flbh2="+class_2_id+"&pp_id="+tm_id);
		mv.addObject("title", "添加属性");
		
		return mv;
	}
	
}
