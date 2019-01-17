package cn.http.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cn.http.entity.Destroy;
import cn.http.service.DestroyService;

public class DestroyAction extends ActionSupport {

	private static final long serialVersionUID = 7936828404791772685L;

	private DestroyService destroyService;

	List<Destroy> list;

	/**
	 * 全查询
	 * 
	 * @return
	 * @throws Exception
	 */
	public String alldestroy() throws Exception {
		System.out.println("destroyAction");
		list = destroyService.alldestroy(new Destroy(), "did");
		return "alldestroy";
	}

	public DestroyService getDestroyService() {
		return destroyService;
	}

	public void setDestroyService(DestroyService destroyService) {
		this.destroyService = destroyService;
	}

	public List<Destroy> getList() {
		return list;
	}

	public void setList(List<Destroy> list) {
		this.list = list;
	}

}
