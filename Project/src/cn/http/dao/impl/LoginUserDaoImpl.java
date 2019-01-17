package cn.http.dao.impl;

import org.hibernate.criterion.Restrictions;

import cn.http.dao.LoginUserDao;
import cn.http.entity.User;

public class LoginUserDaoImpl extends BasicDaoImpl<User> implements LoginUserDao {

	@Override
	public User login(String username, String password) {
		System.out.println("我是LoginUserDaoImpl");
		System.out.println(getSessionFactory());
		User user = (User) getSessionFactory().getCurrentSession().createCriteria(new User().getClass()).add(Restrictions.eq("uname", username)).add(Restrictions.eq("upwd",password)).uniqueResult();
		System.out.println("执行LoginUserDaoImpl");
		System.out.println(user);
		return user;
	}

}
