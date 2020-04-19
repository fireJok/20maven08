package com.db.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.db.pojo.Picture;
import com.db.service.PictureService;

@Controller
public class PictureController {
	@Resource
	private PictureService pictureServiceImpl;
	@RequestMapping("insert")
	public String insert(MultipartFile file,HttpServletRequest req){
		System.out.println("insert");
		try {
			FileUtils.copyInputStreamToFile(file.getInputStream(), new File(req.getServletContext().getRealPath("files"),file.getOriginalFilename()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Picture pic=new Picture();
		pic.setPath(file.getOriginalFilename());
		int a=pictureServiceImpl.inspic(pic);
		if(a>0){
			return "show";
		}else{
			return "add.jsp";
		}
	}
	@RequestMapping("show")
	public String show(Model model){
		System.out.println("show");
		model.addAttribute("list", pictureServiceImpl.selall());
		return "main.jsp";
		
		
	}
	@RequestMapping("delete")
	public String delete(Picture pic,Model model){
		System.out.println("del");
		int b=pictureServiceImpl.delbyid(pic);
		
		return "redirect:show";
		
		
	}
}
