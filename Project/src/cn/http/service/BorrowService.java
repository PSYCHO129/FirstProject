package cn.http.service;

import java.util.List;

import cn.http.entity.Borrow;

public interface BorrowService {

	public List<Borrow> allborrow(Borrow borrow,String column);
	
	public void del(Borrow borrow);
	
	public Borrow querybyid(Borrow borrow,String column,Object obj);

	public void editborrow(Borrow borrow);

	public List<Borrow> querybyname(Borrow borrow, String uname);
}
