package cn.http.service;

import java.util.List;

import cn.http.entity.Admin;

public interface AdminService {

	public List<Admin> alladmin(Admin admin,String column);
	
	public void del(Admin admin);
	
	public Admin querybyid(Admin admin,String column,Object obj);

	public void editadmin(Admin admin);
	
	public List<Admin> getbyname(Admin admin,String column,String name);
}
