package cn.http.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import cn.http.dao.BasicDao;

public class BasicDaoImpl<T> implements BasicDao<T> {

	private SessionFactory sessionFactory;
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> allbasic(T t, String column) {
		return sessionFactory.getCurrentSession().createCriteria(t.getClass()).addOrder(Order.asc(column)).list();
	}

	@Override
	public void edit(T t) {
		sessionFactory.getCurrentSession().saveOrUpdate(t);
		
	}

	@Override
	public void del(T t) {
		sessionFactory.getCurrentSession().delete(t);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public T querybyid(T t, String column, Object obj) {
		return (T) sessionFactory.getCurrentSession().createCriteria(t.getClass()).add(Restrictions.eq(column, obj)).uniqueResult();
	}

	@Override
	public long count(T t) {
		// TODO Auto-generated method stub
		return (long) sessionFactory.getCurrentSession().createCriteria(t.getClass()).setProjection(Projections.rowCount()).uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getpage(T t, int page, int rows, String column) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createCriteria(t.getClass()).setFirstResult((page-1)*rows).setMaxResults(rows).list();
	}

}
