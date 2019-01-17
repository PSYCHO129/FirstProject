package cn.http.service;

import java.util.List;

import cn.http.entity.RecommendType;

public interface RecommendTypeService {

	public List<RecommendType> allRecommendType(RecommendType recommendType,String column);
	
}
