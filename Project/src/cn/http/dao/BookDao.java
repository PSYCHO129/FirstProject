package cn.http.dao;

import cn.http.entity.Book;
import cn.http.entity.Destroy;

public interface BookDao extends BasicDao<Book> {

	public void addtodestroy(Destroy destroy);

}
