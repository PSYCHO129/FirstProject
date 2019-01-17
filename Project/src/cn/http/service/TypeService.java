package cn.http.service;

import java.util.List;

import cn.http.entity.Type;

public interface TypeService {

	public List<Type> alltype(Type type,String column);
	
	public void edit(Type type);
	
	public void del(Type type);
	
	public Type querybyid(Type type,String column,Object obj);
	
}
