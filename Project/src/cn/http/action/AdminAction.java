package cn.http.action;

import java.util.List;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;

import cn.http.entity.Admin;
import cn.http.service.AdminService;

public class AdminAction extends ActionSupport {

	private static final long serialVersionUID = -3606867870662931889L;

	private AdminService adminService;

	private List<Admin> list;

	private Admin admin;

	/**
	 * 查询所有管理员用户
	 * 
	 * @return
	 * @throws Exception
	 */
	public String alladmin() throws Exception {
		list = adminService.alladmin(new Admin(), "aid");
		return "alladmin";
	}

	/**
	 * 添加和修改管理员信息
	 * 
	 * @throws Exception
	 */
	public void editadmin() throws Exception {
		System.out.println(admin.getAusername());
		adminService.editadmin(admin);
	}

	/**
	 * 删除
	 * @throws Exception
	 */
	public void del() throws Exception {
		adminService.del(adminService.querybyid(new Admin(),"aid",admin.getAid()));
	}

	public String querybyid() throws Exception {
		admin = adminService.querybyid(new Admin(),"aid",admin.getAid());
		return "getadmin";
	}
	
	
	public String querybyname() throws Exception {
		list = adminService.getbyname(new Admin(),"ausername",admin.getAusername());
		return "alladmin";
	}

	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	public List<Admin> getList() {
		return list;
	}

	public void setList(List<Admin> list) {
		this.list = list;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

}
