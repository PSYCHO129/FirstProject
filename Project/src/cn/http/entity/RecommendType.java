package cn.http.entity;

import java.io.Serializable;

public class RecommendType implements Serializable {

	private static final long serialVersionUID = -4697814915680896175L;

	private Integer rtid;
	
	private String tname;
	
	private Integer rtsum;

	public RecommendType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecommendType(Integer rtid, String tname, Integer rtsum) {
		super();
		this.rtid = rtid;
		this.tname = tname;
		this.rtsum = rtsum;
	}

	public Integer getRtid() {
		return rtid;
	}

	public void setRtid(Integer rtid) {
		this.rtid = rtid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Integer getRtsum() {
		return rtsum;
	}

	public void setRtsum(Integer rtsum) {
		this.rtsum = rtsum;
	}

	
}
