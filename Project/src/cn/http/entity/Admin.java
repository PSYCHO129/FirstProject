package cn.http.entity;

import java.io.Serializable;

public class Admin implements Serializable {

	private static final long serialVersionUID = 3086505282252058046L;

	private Integer aid;
	
	private String ausername;
	
	private String apwd;

	public Admin() {
		super();
	}

	public Admin(Integer aid, String ausername, String apwd) {
		super();
		this.aid = aid;
		this.ausername = ausername;
		this.apwd = apwd;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getAusername() {
		return ausername;
	}

	public void setAusername(String ausername) {
		this.ausername = ausername;
	}

	public String getApwd() {
		return apwd;
	}

	public void setApwd(String apwd) {
		this.apwd = apwd;
	}
	
	
	
}
