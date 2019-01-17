package cn.http.service.impl;

import java.util.List;

import cn.http.dao.BorrowDao;
import cn.http.dao.ReturnDao;
import cn.http.entity.Borrow;
import cn.http.entity.Return;
import cn.http.service.BorrowService;
import cn.http.service.ReturnService;

public class ReturnServiceImpl implements ReturnService {

	
	private ReturnDao returnDao;

	public ReturnDao getReturnDao() {
		return returnDao;
	}

	public void setReturnDao(ReturnDao returnDao) {
		this.returnDao = returnDao;
	}

	@Override
	public List<Return> allreturn(Return returninfo, String column) {
		return returnDao.allbasic(returninfo, column);
	}

	@Override
	public void del(Return returninfo) {
		returnDao.del(returninfo);
		
	}

	@Override
	public Return querybyid(Return returninfo, String column, Object obj) {
		// TODO Auto-generated method stub
		return returnDao.querybyid(returninfo, column, obj);
	}

	@Override
	public void editreturn(Return returninfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Return> querybyname(Return return1, String uname) {
		// TODO Auto-generated method stub
		return returnDao.querybyname(return1, uname);
	}
	
	
}
