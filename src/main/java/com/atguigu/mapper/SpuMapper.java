package com.atguigu.mapper;

import java.util.Map;

import com.atguigu.bean.T_MALL_PRODUCT;

public interface SpuMapper {
	
	void insert_spu(T_MALL_PRODUCT spu);

	void insert_images(Map<Object, Object> map);

}
