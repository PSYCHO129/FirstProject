package cn.http.dao;

import cn.http.entity.Admin;

public interface LoginAdminDao extends BasicDao<Admin> {

	public Admin login(String username,String password);
	
}
