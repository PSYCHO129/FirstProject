package cn.http.service.impl;

import java.util.List;

import cn.http.dao.AdminSeeUserDao;
import cn.http.entity.User;
import cn.http.service.AdminSeeUserService;

public class AdminSeeUserServiceImpl implements AdminSeeUserService {

	
	private AdminSeeUserDao adminSeeUserDao;

	public AdminSeeUserDao getAdminSeeUserDao() {
		return adminSeeUserDao;
	}

	public void setAdminSeeUserDao(AdminSeeUserDao adminSeeUserDao) {
		this.adminSeeUserDao = adminSeeUserDao;
	}

	@Override
	public List<User> allUser(User user, String column) {
		// TODO Auto-generated method stub
		return adminSeeUserDao.allbasic(user, column);
	}

	@Override
	public void del(User user) {
		adminSeeUserDao.del(user);
		
	}

	@Override
	public User querybyid(User user, String column, Object obj) {
		// TODO Auto-generated method stub
		return adminSeeUserDao.querybyid(user, column, obj);
	}

	@Override
	public void editUser(User user) {
		adminSeeUserDao.edit(user);
		
	}

	@Override
	public List<User> myUser(User user, String string, String uname) {
		return adminSeeUserDao.myUser(user,string,uname);
		
	}
}
