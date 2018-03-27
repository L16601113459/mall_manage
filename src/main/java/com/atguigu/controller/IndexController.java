package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("goto_sku")
	public String goto_sku() {
		return "sku";
	}

	// 商品属性跳转
	@RequestMapping("goto_attr")
	public String goto_attr() {
		return "attr";
	}
	
	// spu 商品信息跳转
	@RequestMapping("goto_spu")
	public String goto_spu() {
		return "spu";
	}
	
	// 商品首页跳转
	@RequestMapping("index")
	public String index(String url, String title, ModelMap map) {
		
		map.put("url", url);
		map.put("title", title);
		return "main";
	}
	
}
