package cn.http.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cn.http.entity.Type;
import cn.http.service.TypeService;

public class TypeAction extends ActionSupport {

	private static final long serialVersionUID = -3360751115339446591L;

	private TypeService typeService;

	private List<Type> list;

	private Type type;

	/**
	 * 查询所有的类别信息
	 * 
	 * @return
	 * @throws Exception
	 */
	public String alltype() throws Exception {
		list = typeService.alltype(new Type(), "tid");
		return "alltype";
	}

	/**
	 * 添加或者修改操作
	 * 
	 * @throws Exception
	 */
	public void edit() throws Exception {
		System.out.println(type.getTname());
		typeService.edit(type);
	}

	/**
	 * 查询一条数据
	 * 
	 * @return
	 * @throws Exception
	 */
	public String querybyid() throws Exception {
		type = typeService.querybyid(type, "tid", type.getTid());
		return "gettype";
	}

	public void del() throws Exception {
		typeService.del(typeService.querybyid(type, "tid", type.getTid()));
	}
	
	public TypeService getTypeService() {
		return typeService;
	}

	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}

	public List<Type> getList() {
		return list;
	}

	public void setList(List<Type> list) {
		this.list = list;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
