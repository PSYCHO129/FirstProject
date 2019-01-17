package cn.http.dao.impl;

import org.hibernate.criterion.Restrictions;

import cn.http.dao.LoginAdminDao;
import cn.http.entity.Admin;

public class LoginAdminDaoImpl extends BasicDaoImpl<Admin> implements LoginAdminDao {

	@Override
	public Admin login(String username, String password) {
		System.out.println("我是LoginAdminDaoImpl");
		return (Admin) getSessionFactory().getCurrentSession().createCriteria(new Admin().getClass())
				.add(Restrictions.eq("ausername", username)).add(Restrictions.eq("apwd",password)).uniqueResult();
	}

}
