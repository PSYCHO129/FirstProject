package cn.http.dao;

import java.util.List;

public interface BasicDao<T> {

	public List<T> allbasic(T t,String column);
	
	public void edit(T t);
	
	public void del(T t);
	
	public T querybyid(T t,String column,Object obj);
	
	public long count(T t);
	
	public List<T> getpage(T t,int page,int rows,String column);
	
}
