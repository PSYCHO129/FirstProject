package cn.http.dao;

import java.util.List;

import cn.http.entity.Borrow;

public interface BorrowDao extends BasicDao<Borrow> {

	public List<Borrow> querybyname(Borrow borrow, String uname);

}
