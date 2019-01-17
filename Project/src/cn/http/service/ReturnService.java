package cn.http.service;

import java.util.List;

import cn.http.entity.Return;

public interface ReturnService {

	public List<Return> allreturn(Return returninfo,String column);
	
	public void del(Return returninfo);
	
	public Return querybyid(Return returninfo,String column,Object obj);

	public void editreturn(Return returninfo);

	public List<Return> querybyname(Return return1, String uname);
}
