package cn.http.entity;

import java.io.Serializable;

public class Type implements Serializable {

	private static final long serialVersionUID = 219597314649026850L;

	private Integer tid;
	
	private String tname;

	
	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Type(Integer tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}
	
	
	
}
