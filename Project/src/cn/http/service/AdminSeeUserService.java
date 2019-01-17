package cn.http.service;

import java.util.List;

import cn.http.entity.User;

public interface AdminSeeUserService {

	public List<User> allUser(User user,String column);
	
	public void del(User user);
	
	public User querybyid(User user,String column,Object obj);

	public void editUser(User user);

	public List<User> myUser(User user, String string, String uname);
}
