package cn.http.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cn.http.entity.Book;
import cn.http.service.BookService;

public class BookAction extends ActionSupport {

	private static final long serialVersionUID = 4449576195090585099L;

	private BookService bookService;

	private List<Book> books;

	private Book book;

	/**
	 * 查询所有
	 * 
	 * @return
	 * @throws Exception
	 */
	public String allbook() throws Exception {
		books = bookService.allbook(new Book(), "bid");
		return "allbook";
	}

	/**
	 * 添加和修改操作
	 * 
	 * @throws Exception
	 */
	public void editbook() throws Exception {
		System.out.println("1111");
		System.out.println(book.getBdate());
		bookService.edit(book);
	}

	/**
	 * 查询单条
	 * 
	 * @return
	 * @throws Exception
	 */
	public String querybyid() throws Exception {
		book = bookService.querybyid(new Book(), "bid", book.getBid());
		return "getbook";
	}

	/**
	 * 删除数据
	 * 
	 * @throws Exception
	 */
	public void del() throws Exception {
		System.out.println(book.getBid());
		bookService.del(bookService.querybyid(new Book(), "bid", book.getBid()));
	}

	public BookService getBookService() {
		return bookService;
	}

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

}
