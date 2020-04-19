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
	
	@RequestMapping("sp")
	public String show(Model model){
		System.out.println("show");
		model.addAttribute("list", pictureServiceImpl.selall());
		return "index.jsp";
		
		
	}
	
}
