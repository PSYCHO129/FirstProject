package cn.http.dao;

import java.util.List;

import cn.http.entity.RecommendBook;

public interface RecommendBookDao extends BasicDao<RecommendBook> {

	public List<RecommendBook> allRecommendBook(RecommendBook recommendBook,String column);
	
}
