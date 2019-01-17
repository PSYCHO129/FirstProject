package cn.http.dao.impl;

import java.util.List;

import org.hibernate.criterion.Restrictions;

import cn.http.dao.ReturnDao;
import cn.http.entity.Return;

public class ReturnDaoImpl extends BasicDaoImpl<Return> implements ReturnDao {

	public void addreturn(Return returninfo){
		getSessionFactory().getCurrentSession().save(returninfo);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Return> querybyname(Return return1, String uname) {
		// TODO Auto-generated method stub
		return getSessionFactory().getCurrentSession().createCriteria(return1.getClass())
				.add(Restrictions.eq("uname", uname)).list();
	}
	
}
