package cn.http.entity;

import java.io.Serializable;
import java.util.Date;

public class Return implements Serializable {

	private static final long serialVersionUID = -5549192975822454898L;

	private Integer riid;
	
	private String uname;
	
	private String bname;
	
	private String applydate;

	public Return() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Return(Integer riid, String uname, String bname, String applydate) {
		super();
		this.riid = riid;
		this.uname = uname;
		this.bname = bname;
		this.applydate = applydate;
	}

	public Integer getRiid() {
		return riid;
	}

	public void setRiid(Integer riid) {
		this.riid = riid;
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

	public String getApplydate() {
		return applydate;
	}

	public void setApplydate(String applydate) {
		this.applydate = applydate;
	}

	
}
