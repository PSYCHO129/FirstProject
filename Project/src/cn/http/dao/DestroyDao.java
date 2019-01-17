package cn.http.dao;

import java.util.List;


import cn.http.entity.Destroy;

public interface DestroyDao extends BasicDao<Destroy> {

	public List<Destroy> alldestroy(Destroy destroy, String column);
	
}
