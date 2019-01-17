package cn.http.dao;

import java.util.List;

import cn.http.entity.Return;

public interface ReturnDao extends BasicDao<Return> {

	public void addreturn(Return returninfo);

	public List<Return> querybyname(Return return1, String uname);
	
}
