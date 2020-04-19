package com.db.mapper;

import java.util.List;

import com.db.pojo.Picture;

public interface PictureMapper {
	int inspic(Picture pic);
	List<Picture> selall();
	int delbyid(Picture pic);
}
