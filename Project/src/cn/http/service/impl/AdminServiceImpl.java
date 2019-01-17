package cn.http.service.impl;

import java.util.List;

import cn.http.dao.AdminDao;
import cn.http.entity.Admin;
import cn.http.service.AdminService;

public class AdminServiceImpl implements AdminService {

	
	private AdminDao adminDao;
	
	
	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	@Override
	public List<Admin> alladmin(Admin admin, String column) {
		return adminDao.allbasic(admin, column);
	}


	@Override
	public void del(Admin admin) {
		adminDao.del(admin);

	}

	@Override
	public Admin querybyid(Admin admin, String column, Object obj) {
		return adminDao.querybyid(admin, column, obj);
	}

	@Override
	public void editadmin(Admin admin) {
		adminDao.edit(admin);
		
	}

	@Override
	public List<Admin> getbyname(Admin admin, String column, String name) {
		// TODO Auto-generated method stub
		return adminDao.getbyname(admin, column, name);
	}

}
