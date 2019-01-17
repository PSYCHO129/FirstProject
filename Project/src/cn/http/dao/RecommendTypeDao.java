package cn.http.dao;

import java.util.List;

import cn.http.entity.RecommendType;

public interface RecommendTypeDao extends BasicDao<RecommendType> {

	public List<RecommendType> allRecommendType(RecommendType recommendType,String column);
	
}
