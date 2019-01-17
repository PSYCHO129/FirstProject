package cn.http.service.impl;

import cn.http.dao.LoginAdminDao;
import cn.http.entity.Admin;
import cn.http.service.LoginAdminService;

public class LoginAdminServiceImpl implements LoginAdminService {

	private LoginAdminDao loginAdminDao;

	public LoginAdminDao getLoginAdminDao() {
		return loginAdminDao;
	}

	public void setLoginAdminDao(LoginAdminDao loginAdminDao) {
		this.loginAdminDao = loginAdminDao;
	}

	public Admin login(String username, String password) {
		System.out.println("我是LoginAdminServiceImpl");
		return loginAdminDao.login(username, password);
	}

}
