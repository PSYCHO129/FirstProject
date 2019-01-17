package cn.http.service.impl;

import java.util.List;

import cn.http.dao.RecommendBookDao;
import cn.http.entity.RecommendBook;
import cn.http.service.RecommendBookService;

public class RecommendBookServiceImpl implements RecommendBookService {

	private RecommendBookDao recommendBookDao;
	
	public RecommendBookDao getRecommendBookDao() {
		return recommendBookDao;
	}
	public void setRecommendBookDao(RecommendBookDao recommendBookDao) {
		this.recommendBookDao = recommendBookDao;
	}


	@Override
	public List<RecommendBook> allRecommendBook(RecommendBook recommend, String column) {
		return recommendBookDao.allRecommendBook(recommend, column);
	}

}
