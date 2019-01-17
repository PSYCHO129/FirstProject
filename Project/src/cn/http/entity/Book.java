package cn.http.entity;

import java.io.Serializable;
import java.util.Date;

public class Book implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer bid;
	
	private String bname;
	
	private String bauthor;
	
	private String bpublish;
	
	private Date bdate;
	
	private Integer bsum;
	
	private Integer bnum;
	
	private Type type = new Type();

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBauthor() {
		return bauthor;
	}

	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}

	public String getBpublish() {
		return bpublish;
	}

	public void setBpublish(String bpublish) {
		this.bpublish = bpublish;
	}

	public Date getBdate() {
		return bdate;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	public Integer getBsum() {
		return bsum;
	}

	public void setBsum(Integer bsum) {
		this.bsum = bsum;
	}

	public Integer getBnum() {
		return bnum;
	}

	public void setBnum(Integer bnum) {
		this.bnum = bnum;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	
	
}
