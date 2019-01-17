package cn.http.dao.impl;

import java.util.List;

import org.hibernate.criterion.Order;

import cn.http.dao.DestroyDao;
import cn.http.entity.Destroy;

public class DestroyDaoImpl extends BasicDaoImpl<Destroy> implements DestroyDao {

	@SuppressWarnings("unchecked")
	public List<Destroy> alldestroy(Destroy destroy, String column) {
		return getSessionFactory().getCurrentSession().createCriteria(destroy.getClass()).addOrder(Order.desc(column)).list();
	}
	
}
