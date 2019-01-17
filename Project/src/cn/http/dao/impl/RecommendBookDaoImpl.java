package cn.http.dao.impl;

import java.util.List;

import org.hibernate.criterion.Order;

import cn.http.dao.RecommendBookDao;
import cn.http.entity.RecommendBook;

public class RecommendBookDaoImpl extends BasicDaoImpl<RecommendBook> implements RecommendBookDao {

	@SuppressWarnings("unchecked")
	public List<RecommendBook> allRecommendBook(RecommendBook recommendBook, String column) {
		return getSessionFactory().getCurrentSession().createCriteria(recommendBook.getClass()).addOrder(Order.desc(column)).list();
	}
}
