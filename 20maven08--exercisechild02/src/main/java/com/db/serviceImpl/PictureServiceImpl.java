package com.db.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.db.mapper.PictureMapper;
import com.db.pojo.Picture;
import com.db.service.PictureService;
@Service
public class PictureServiceImpl implements PictureService {
	@Resource
	private PictureMapper pictureMapper;
	
	@Override
	public List<Picture> selall() {
		// TODO Auto-generated method stub
		return pictureMapper.selall();
	}
	

}
