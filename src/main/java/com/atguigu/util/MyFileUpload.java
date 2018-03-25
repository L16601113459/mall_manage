package com.atguigu.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class MyFileUpload {

	public static List<String> upload_image(MultipartFile[] files) {

		String path = MyPropertyUtil.getProperty("myUpload.properties", "windows_path");

		List<String> list_image = new ArrayList<String>();

		for (int i = 0; i < files.length; i++) {

			if (!files[i].isEmpty()) {
				String originalFilename = files[i].getOriginalFilename();

				// UUID randomUUID = UUID.randomUUID();
				String name = System.currentTimeMillis() + originalFilename;
				String upload_name = path + "/" + name;

				try {
					files[i].transferTo(new File(upload_name));
					list_image.add(name);
				} catch (IllegalStateException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

		return list_image;
	}

	
/*	public static List<String> upload_image(MultipartFile[] files) {
		// 获取文件保存路径
		String path = MyPropertyUtil.getProperties("myUpload.properties", "windows_path");

		// 图片名集合
		List<String> list_image = new ArrayList<>();

		// 获取所有文件名并添加到 list_image 集合中
		for (int i = 0; i < files.length; i++) {
			// 获取原始文件名
			String originalFilename = files[i].getOriginalFilename();

			// 下载后的名称
			String name = System.currentTimeMillis() + originalFilename;
			String upload_name = path + "/" + name;

			try {
				files[i].transferTo(new File(upload_name));
				list_image.add(upload_name);
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return list_image;
	}
*/
}
