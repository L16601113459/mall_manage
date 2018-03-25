package com.atguigu.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.bean.T_MALL_PRODUCT;
import com.atguigu.mapper.SpuMapper;

@Service
public class SpuServiceImpl implements SpuServiceInf {

	@Autowired
	SpuMapper spuMapper;

	@Override
	public void save_spu(T_MALL_PRODUCT spu, List<String> list_image) {
		// 插入spu信息，返回生成主键
		spu.setShp_tp(list_image.get(0));
		spuMapper.insert_spu(spu);
		// 根据spu主键，批量插入spu图片
		Map<Object, Object> map = new HashMap<>();
		map.put("list_image",list_image);
		map.put("shp_id",spu.getId());
		spuMapper.insert_images(map);
//		spuMapper.insert_images(spu.getId(), list_image);
	}

}
