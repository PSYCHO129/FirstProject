package cn.http.service.impl;

import java.util.List;

import cn.http.dao.DestroyDao;
import cn.http.entity.Destroy;
import cn.http.service.DestroyService;

public class DestroyServiceImpl implements DestroyService {

	private DestroyDao destroyDao;
	
	public DestroyDao getDestroyDao() {
		return destroyDao;
	}

	public void setDestroyDao(DestroyDao destroyDao) {
		this.destroyDao = destroyDao;
	}



	@Override
	public List<Destroy> alldestroy(Destroy destroy, String column) {
		// TODO Auto-generated method stub
		return destroyDao.alldestroy(destroy, column);
	}

}
