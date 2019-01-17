package cn.http.entity;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 5793936908289975099L;

	private Integer uid;
	
	private String uname;
	
	private String upwd;
	
	private String uclass;
	
	private Integer utel;
	
	private Integer borrownum;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer uid, String uname, String upwd, String uclass, Integer utel, Integer borrownum) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
		this.uclass = uclass;
		this.utel = utel;
		this.borrownum = borrownum;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public String getUclass() {
		return uclass;
	}

	public void setUclass(String uclass) {
		this.uclass = uclass;
	}

	public Integer getUtel() {
		return utel;
	}

	public void setUtel(Integer utel) {
		this.utel = utel;
	}

	public Integer getBorrownum() {
		return borrownum;
	}

	public void setBorrownum(Integer borrownum) {
		this.borrownum = borrownum;
	}
	
	
	
}
