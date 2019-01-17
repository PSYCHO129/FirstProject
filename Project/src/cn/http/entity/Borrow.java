package cn.http.entity;

import java.io.Serializable;
import java.util.Date;

public class Borrow implements Serializable {


	private static final long serialVersionUID = 6907219780647852983L;

	private Integer biid;
	
	private String uname;
	
	private String bname;
	
	private Date borrowdate;
	
	private Date returndate;

	
	public Borrow() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Borrow(Integer biid, String uname, String bname, Date borrowdate) {
		super();
		this.biid = biid;
		this.uname = uname;
		this.bname = bname;
		this.borrowdate = borrowdate;
	}


	public Borrow(Integer biid, String uname, String bname, Date borrowdate, Date returndate) {
		super();
		this.biid = biid;
		this.uname = uname;
		this.bname = bname;
		this.borrowdate = borrowdate;
		this.returndate = returndate;
	}


	public Integer getBiid() {
		return biid;
	}


	public void setBiid(Integer biid) {
		this.biid = biid;
	}


	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public String getBname() {
		return bname;
	}


	public void setBname(String bname) {
		this.bname = bname;
	}


	public Date getBorrowdate() {
		return borrowdate;
	}


	public void setBorrowdate(Date borrowdate) {
		this.borrowdate = borrowdate;
	}


	public Date getReturndate() {
		return returndate;
	}


	public void setReturndate(Date returndate) {
		this.returndate = returndate;
	}

	
	
	
}
