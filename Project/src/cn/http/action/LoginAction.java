package cn.http.action;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.http.service.LoginAdminService;
import cn.http.service.LoginUserService;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = -6197681022140440976L;

	private LoginUserService loginUserService;
	
	private LoginAdminService loginAdminService;
	
	private String username;
	
	private String password;
	
	private HttpSession session = ServletActionContext.getRequest().getSession();
	
	public String login() throws Exception {
		if (loginUserService.login(username, password) != null) {
			session.setAttribute("user", username);
			return "login_user";
		} else if (loginAdminService.login(username, password) != null) {
			session.setAttribute("admin", username);
			return "login_admin";
		}
		return null;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LoginUserService getLoginUserService() {
		return loginUserService;
	}

	public void setLoginUserService(LoginUserService loginUserService) {
		this.loginUserService = loginUserService;
	}

	public LoginAdminService getLoginAdminService() {
		return loginAdminService;
	}

	public void setLoginAdminService(LoginAdminService loginAdminService) {
		this.loginAdminService = loginAdminService;
	}
	
	
}
