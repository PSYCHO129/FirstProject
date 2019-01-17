package cn.http.dao.impl;

import java.util.List;

import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import cn.http.dao.AdminDao;
import cn.http.entity.Admin;

public class AdminDaoImpl extends BasicDaoImpl<Admin> implements AdminDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Admin> getbyname(Admin admin, String column,String name) {
		// TODO Auto-generated method stub
		return getSessionFactory().getCurrentSession()
				.createCriteria(admin.getClass()).add(Restrictions.eq("ausername", name))
				.addOrder(Order.asc(column)).list();
	}

}
