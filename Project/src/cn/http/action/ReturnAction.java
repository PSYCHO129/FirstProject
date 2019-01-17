package cn.http.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cn.http.entity.Return;
import cn.http.service.ReturnService;

public class ReturnAction extends ActionSupport {

	private static final long serialVersionUID = 5203605211248513733L;

	private ReturnService returnService;

	private List<Return> list;

	private Return returninfo;

	/**
	 * 所有还书申请
	 * 
	 * @return
	 * @throws Exception
	 */
	public String allreturn() throws Exception {
		list = returnService.allreturn(new Return(), "riid");
		return "allreturn";
	}

	/**
	 * 删除
	 * 
	 * @throws Exception
	 */
	public void del() throws Exception {
		System.out.println("来到return");
		System.out.println(returninfo.getRiid());
		returnService.del(returnService.querybyid(new Return(), "riid", returninfo.getRiid()));
	}

	
	public String querybyname() throws Exception {
		list = returnService.querybyname(new Return(),returninfo.getUname());
		return "allreturn";
	}
	
	
	public ReturnService getReturnService() {
		return returnService;
	}

	public void setReturnService(ReturnService returnService) {
		this.returnService = returnService;
	}

	public List<Return> getList() {
		return list;
	}

	public void setList(List<Return> list) {
		this.list = list;
	}

	public Return getReturninfo() {
		return returninfo;
	}

	public void setReturninfo(Return returninfo) {
		this.returninfo = returninfo;
	}

}
