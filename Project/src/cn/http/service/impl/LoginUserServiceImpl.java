package cn.http.service.impl;

import cn.http.dao.LoginUserDao;
import cn.http.entity.User;
import cn.http.service.LoginUserService;

public class LoginUserServiceImpl implements LoginUserService {

	private LoginUserDao loginUserDao;
	
	
	public LoginUserDao getLoginUserDao() {
		return loginUserDao;
	}


	public void setLoginUserDao(LoginUserDao loginUserDao) {
		this.loginUserDao = loginUserDao;
	}


	@Override
	public User login(String username, String password) {
		System.out.println("我是LoginUserServiceImpl");
		return loginUserDao.login(username, password);
	}

}
