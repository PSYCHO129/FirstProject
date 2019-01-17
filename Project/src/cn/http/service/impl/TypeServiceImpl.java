package cn.http.service.impl;

import java.util.List;

import cn.http.dao.TypeDao;
import cn.http.entity.Type;
import cn.http.service.TypeService;

public class TypeServiceImpl implements TypeService {

	private TypeDao typeDao;
	
	public TypeDao getTypeDao() {
		return typeDao;
	}

	public void setTypeDao(TypeDao typeDao) {
		this.typeDao = typeDao;
	}

	@Override
	public List<Type> alltype(Type type, String column) {
		return typeDao.allbasic(type, column);
	}

	@Override
	public void edit(Type type) {
		typeDao.edit(type);
		
	}

	@Override
	public void del(Type type) {
		typeDao.del(type);
		
	}

	@Override
	public Type querybyid(Type type, String column, Object obj) {
		return typeDao.querybyid(type, column, obj);
	}

}
