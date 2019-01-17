package cn.http.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cn.http.entity.Borrow;
import cn.http.service.BorrowService;

public class BorrowAction extends ActionSupport {

	private static final long serialVersionUID = 7086820746227526378L;

	private BorrowService borrowService;
	
	private List<Borrow> list;
	
	private Borrow borrow;
	/**
	 * 查询所有
	 * @return
	 * @throws Exception
	 */
	public String allborrow() throws Exception {
		list = borrowService.allborrow(new Borrow(), "biid");
		return "allborrow";
	}

	/**
	 * 添加和修改
	 * @return
	 * @throws Exception
	 */
	public void edit() throws Exception {
		borrowService.editborrow(borrow);
	}
	/**
	 * 获取单挑数据
	 * @return
	 * @throws Exception
	 */
	public String querybyid() throws Exception {
		borrow = borrowService.querybyid(new Borrow(), "biid", borrow.getBiid());
		return "getborrow";
	}
	
	/**
	 * 删除数据
	 * @throws Exception
	 */
	public void del() throws Exception {
		System.out.println("来到borrowAction");
		borrowService.del(borrowService.querybyid(new Borrow(), "biid", borrow.getBiid()));
	}
	
	
	/**
	 * 用户借阅
	 * @return
	 * @throws Exception
	 */
	public void ensure() throws Exception {
		System.out.println(borrow.getBname());
		borrowService.editborrow(borrow);
	}
	
	
	public String querybyname() throws Exception {
		list = borrowService.querybyname(new Borrow(),borrow.getUname());
		return "allborrow";
	}
	
	
	public BorrowService getBorrowService() {
		return borrowService;
	}

	public void setBorrowService(BorrowService borrowService) {
		this.borrowService = borrowService;
	}

	public List<Borrow> getList() {
		return list;
	}

	public void setList(List<Borrow> list) {
		this.list = list;
	}

	public Borrow getBorrow() {
		return borrow;
	}

	public void setBorrow(Borrow borrow) {
		this.borrow = borrow;
	}
	
	
	
	
}
