package com.db.service;

import java.util.List;

import com.db.pojo.Picture;

public interface PictureService {
	int inspic(Picture pic);
	List<Picture> selall();
	int delbyid(Picture pic);
}
