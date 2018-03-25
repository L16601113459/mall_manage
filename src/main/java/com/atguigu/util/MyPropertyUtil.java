package com.atguigu.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MyPropertyUtil {

	public static String getProperty(String prop, String key) {
		
		Properties properties = new Properties();
		
		// 获取properties的流对象
		InputStream resourceAsStream = MyPropertyUtil.class.getClassLoader().getResourceAsStream(prop);
		
		try {
			// 加载流对象
			properties.load(resourceAsStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 获取路径值
		String property = properties.getProperty(key);
		
		return property;
	}

}
