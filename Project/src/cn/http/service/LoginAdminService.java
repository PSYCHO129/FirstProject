package cn.http.service;

import cn.http.entity.Admin;

public interface LoginAdminService {

	public Admin login(String username,String password);
	
}
