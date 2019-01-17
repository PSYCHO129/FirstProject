package cn.http.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cn.http.entity.User;
import cn.http.service.AdminSeeUserService;

public class AdminSeeUserAction extends ActionSupport {

	private static final long serialVersionUID = 7500026590801356134L;
	
	private AdminSeeUserService adminSeeUserService;
	
	private List<User> list;
	
	private User user;
	
	/**
	 * 查看所有用户信息
	 * @return
	 * @throws Exception
	 */
	public String allUser() throws Exception {
		list = adminSeeUserService.allUser(new User(), "uid");
		return "alluser";
	}

	/**
	 * 添加修改操作
	 * @throws Exception
	 */
	public void editUser() throws Exception {
		adminSeeUserService.editUser(user);
	}
	
	/**
	 * 删除
	 * @throws Exception
	 */
	public void del() throws Exception {
		adminSeeUserService.del(adminSeeUserService.querybyid(new User(), "uid", user.getUid()));
	}
	
	public String querybyname() throws Exception {
		list = adminSeeUserService.myUser(new User(), "uid",user.getUname());
		return "alluser";
	}
	
	public String querybyid() throws Exception {
		user = adminSeeUserService.querybyid(new User(), "uid", user.getUid());
		return "getuser";
	}
	
	public AdminSeeUserService getAdminSeeUserService() {
		return adminSeeUserService;
	}

	public void setAdminSeeUserService(AdminSeeUserService adminSeeUserService) {
		this.adminSeeUserService = adminSeeUserService;
	}

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
