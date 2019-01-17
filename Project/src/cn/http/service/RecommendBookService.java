package cn.http.service;

import java.util.List;

import cn.http.entity.RecommendBook;

public interface RecommendBookService {

	public List<RecommendBook> allRecommendBook(RecommendBook recommend,String column);
	
}
