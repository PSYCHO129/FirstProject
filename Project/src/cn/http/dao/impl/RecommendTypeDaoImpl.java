package cn.http.dao.impl;

import java.util.List;

import org.hibernate.criterion.Order;

import cn.http.dao.RecommendTypeDao;
import cn.http.entity.RecommendType;

public class RecommendTypeDaoImpl extends BasicDaoImpl<RecommendType> implements RecommendTypeDao {

	@SuppressWarnings("unchecked")
	public List<RecommendType> allRecommendType(RecommendType recommendType, String column) {
		return getSessionFactory().getCurrentSession().createCriteria(recommendType.getClass()).addOrder(Order.desc(column)).list();
	}
}
