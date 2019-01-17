package cn.http.entity;

import java.io.Serializable;

public class RecommendBook implements Serializable {

	private static final long serialVersionUID = -4697814915680896175L;

	private Integer rbid;
	
	private String bname;
	
	private Integer rbsum;

	public RecommendBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecommendBook(Integer rbid, String bname, Integer rbsum) {
		super();
		this.rbid = rbid;
		this.bname = bname;
		this.rbsum = rbsum;
	}

	public Integer getRbid() {
		return rbid;
	}

	public void setRbid(Integer rbid) {
		this.rbid = rbid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public Integer getRbsum() {
		return rbsum;
	}

	public void setRbsum(Integer rbsum) {
		this.rbsum = rbsum;
	}
	
	
	
}
