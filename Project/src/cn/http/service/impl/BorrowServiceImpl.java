package cn.http.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import cn.http.dao.BorrowDao;
import cn.http.dao.ReturnDao;
import cn.http.entity.Borrow;
import cn.http.entity.Return;
import cn.http.service.BorrowService;

public class BorrowServiceImpl implements BorrowService {

	
	private BorrowDao borrowDao;
	
	private ReturnDao returnDao;
	
	public BorrowDao getBorrowDao() {
		return borrowDao;
	}

	public void setBorrowDao(BorrowDao borrowDao) {
		this.borrowDao = borrowDao;
	}

	public ReturnDao getReturnDao() {
		return returnDao;
	}

	public void setReturnDao(ReturnDao returnDao) {
		this.returnDao = returnDao;
	}

	@Override
	public List<Borrow> allborrow(Borrow borrow, String column) {
		// TODO Auto-generated method stub
		return borrowDao.allbasic(borrow, column);
	}

	@Override
	public void del(Borrow borrow) {
		borrowDao.del(borrow);
		System.out.println(borrow.getBname());
		//删除的同时添加一条信息
		Return returninfo = new Return();
		returninfo.setUname(borrow.getUname());
		returninfo.setBname(borrow.getBname());
		System.out.println("222222");
		Date time=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String format = sdf.format(time);
		returninfo.setApplydate(format);
		System.out.println("3333");
		System.out.println(returninfo.getBname());
		System.out.println(returninfo.getUname());
		System.out.println(returninfo.getApplydate());
		//returnDao.edit(returninfo);
		
		
	}

	@Override
	public Borrow querybyid(Borrow borrow, String column, Object obj) {
		// TODO Auto-generated method stub
		return borrowDao.querybyid(borrow, column, obj);
	}

	@Override
	public void editborrow(Borrow borrow) {
		borrowDao.edit(borrow);
		
	}

	@Override
	public List<Borrow> querybyname(Borrow borrow, String uname) {
		// TODO Auto-generated method stub
		return borrowDao.querybyname(borrow,uname);
	}
	
	
}
