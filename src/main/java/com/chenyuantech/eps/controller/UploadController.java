package com.chenyuantech.eps.controller;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.chenyuantech.eps.bean.Msg;

@Controller
public class UploadController {

	@RequestMapping(value = "/uploadimg")
	@ResponseBody
	public Msg upload(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request,
			ModelMap model) {

//		System.out.println("开始");
		
		if(file.getContentType() == null){
			return Msg.fail().add("msg", "文件上传为空");	
		}
		
		String contentType = file.getContentType();
		
		
		
		
		
		// 获得文件后缀名称
		String imageName = contentType.substring(contentType.indexOf("/") + 1);
/*		if ((imageName.equalsIgnoreCase("png") || imageName.equalsIgnoreCase("gif") || imageName.equalsIgnoreCase("bmp")
				|| imageName.equalsIgnoreCase("jpeg")) != true) {
			return Msg.fail().add("msg", "请选择图片类型");

		}*/

//		System.out.println("imageName=" + imageName);
		String path = request.getSession().getServletContext().getRealPath("upload");
		String fileName = UUID.randomUUID().toString().replaceAll("-", "") + "." + imageName;
		// String fileName = new Date().getTime()+".jpg";
//		System.out.println("--------->path:" + path);
//		System.out.println("--------->filename:" + fileName);
		File targetFile = new File(path, fileName);
		if (!targetFile.exists()) {
			targetFile.mkdirs();
		}

		// 保存
		try {
			file.transferTo(targetFile);
			model.addAttribute("fileUrl", request.getContextPath() + "/upload/" + fileName);
//			System.out.println(model.get("fileUrl"));

			return Msg.success().add("url", model.get("fileUrl"));
		} catch (Exception e) {

			e.printStackTrace();
			return Msg.fail().add("msg", "上传失败");

		}

	}

	public static void main(String[] args) {
		System.out.println(UUID.randomUUID().toString());
		System.out.println(UUID.randomUUID().toString());
	}

}