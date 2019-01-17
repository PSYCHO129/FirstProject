package cn.http.entity;

import java.io.Serializable;

public class Destroy implements Serializable {

	private static final long serialVersionUID = 5746341512133444795L;

	private Integer did;
	
	private String dname;
	
	private String dnote;
	
	private String dealname;

	public Destroy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Destroy(Integer did, String dname, String dnote) {
		super();
		this.did = did;
		this.dname = dname;
		this.dnote = dnote;
	}

	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDnote() {
		return dnote;
	}

	public void setDnote(String dnote) {
		this.dnote = dnote;
	}

	public String getDealname() {
		return dealname;
	}

	public void setDealname(String dealname) {
		this.dealname = dealname;
	}
	
	
	
}
