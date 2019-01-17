package cn.http.dao;

import java.util.List;

import cn.http.entity.Admin;

public interface AdminDao extends BasicDao<Admin> {

	public List<Admin> getbyname(Admin admin,String column,String name);
	
}
