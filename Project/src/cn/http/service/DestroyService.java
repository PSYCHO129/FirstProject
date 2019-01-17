package cn.http.service;

import java.util.List;

import cn.http.entity.Destroy;

public interface DestroyService {

	public List<Destroy> alldestroy(Destroy destroy,String column);
	
}
