package cn.http.dao.impl;

import cn.http.dao.BookDao;
import cn.http.entity.Book;
import cn.http.entity.Destroy;

public class BookDaoImpl extends BasicDaoImpl<Book> implements BookDao {

	@Override
	public void addtodestroy(Destroy destroy) {
		getSessionFactory().getCurrentSession().save(destroy);
		
	}
	
}
