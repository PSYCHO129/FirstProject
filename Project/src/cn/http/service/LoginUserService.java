package cn.http.service;

import cn.http.entity.User;

public interface LoginUserService {

	public User login(String username,String password);
	
}
