package cn.http.dao.impl;

import java.util.List;

import org.hibernate.criterion.Restrictions;

import cn.http.dao.BorrowDao;
import cn.http.entity.Borrow;

public class BorrowDaoImpl extends BasicDaoImpl<Borrow> implements BorrowDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Borrow> querybyname(Borrow borrow, String uname) {
		// TODO Auto-generated method stub
		return getSessionFactory().getCurrentSession().createCriteria(borrow.getClass())
				.add(Restrictions.eq("uname", uname)).list();
	}

}
