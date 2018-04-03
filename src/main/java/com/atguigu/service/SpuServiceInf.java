package com.atguigu.service;

import java.util.List;

import com.atguigu.bean.T_MALL_PRODUCT;
import com.atguigu.bean.T_MALL_PRODUCT_COLOR;

public interface SpuServiceInf {

//	public void save_spu(List<String> list_image, T_MALL_PRODUCT spu);
	public void save_spu(T_MALL_PRODUCT spu, List<String> list_image);

	public List<T_MALL_PRODUCT> get_spu_list(int pp_id, int flbh2);

	public void save_color(T_MALL_PRODUCT_COLOR spu_color, String[] colors);

}
