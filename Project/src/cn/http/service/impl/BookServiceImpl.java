package cn.http.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.apache.struts2.ServletActionContext;

import cn.http.dao.BookDao;
import cn.http.entity.Book;
import cn.http.entity.Destroy;
import cn.http.service.BookService;

public class BookServiceImpl implements BookService {

	private BookDao bookDao;
	
	
	public BookDao getBookDao() {
		return bookDao;
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public List<Book> allbook(Book book, String column) {
		return bookDao.allbasic(book, column);
	}

	@Override
	public void edit(Book book) {
		bookDao.edit(book);
		
	}

	@Override
	public void del(Book book) {
		bookDao.del(book);
		//每删除一条数据就在特定的数据库里面添加一条数据
		HttpSession session = ServletActionContext.getRequest().getSession();
		String admin = (String) session.getAttribute("admin");
		Destroy destroy = new Destroy();
		destroy.setDname(book.getBname());
		destroy.setDnote(book.getType().getTname());
		destroy.setDealname(admin);
		bookDao.addtodestroy(destroy);
	}

	@Override
	public Book querybyid(Book book, String column, Object obj) {
		return bookDao.querybyid(book, column, obj);
	}

}
