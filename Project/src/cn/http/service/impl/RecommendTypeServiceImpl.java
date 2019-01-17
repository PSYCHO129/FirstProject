package cn.http.service.impl;

import java.util.List;

import cn.http.dao.RecommendBookDao;
import cn.http.dao.RecommendTypeDao;
import cn.http.entity.RecommendBook;
import cn.http.entity.RecommendType;
import cn.http.service.RecommendBookService;
import cn.http.service.RecommendTypeService;

public class RecommendTypeServiceImpl implements RecommendTypeService {

	private RecommendTypeDao recommendTypeDao;
	
	public RecommendTypeDao getRecommendTypeDao() {
		return recommendTypeDao;
	}

	public void setRecommendTypeDao(RecommendTypeDao recommendTypeDao) {
		this.recommendTypeDao = recommendTypeDao;
	}

	@Override
	public List<RecommendType> allRecommendType(RecommendType recommendType, String column) {
		// TODO Auto-generated method stub
		return recommendTypeDao.allRecommendType(recommendType, column);
	}


}
