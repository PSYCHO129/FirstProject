package cn.http.dao.impl;

import java.util.List;

import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import cn.http.dao.AdminSeeUserDao;
import cn.http.entity.User;

public class AdminSeeUserDaoImpl extends BasicDaoImpl<User> implements AdminSeeUserDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<User> myUser(User user, String string, String uname) {
		// TODO Auto-generated method stub
		return getSessionFactory().getCurrentSession().createCriteria(user.getClass())
				.add(Restrictions.eq("uname", uname)).addOrder(Order.asc(string)).list();
	}

}
