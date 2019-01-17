package cn.http.dao;

import java.util.List;

import cn.http.entity.User;

public interface AdminSeeUserDao extends BasicDao<User> {

	public List<User> myUser(User user, String string, String uname);

}
