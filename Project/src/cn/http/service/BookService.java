package cn.http.service;

import java.util.List;

import cn.http.entity.Book;

public interface BookService {

	public List<Book> allbook(Book book,String column);
	
	public void edit(Book book);
	
	public void del(Book book);
	
	public Book querybyid(Book book,String column,Object obj);
	
}
