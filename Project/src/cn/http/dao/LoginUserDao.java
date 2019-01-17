package cn.http.dao;

import cn.http.entity.User;

public interface LoginUserDao extends BasicDao<User> {

	public User login(String username,String password);
	
}
