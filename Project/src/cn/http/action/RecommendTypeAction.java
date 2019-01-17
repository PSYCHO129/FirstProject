package cn.http.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cn.http.entity.RecommendType;
import cn.http.service.RecommendTypeService;

public class RecommendTypeAction extends ActionSupport {

	private static final long serialVersionUID = 7257156592761716118L;
	
	private RecommendTypeService recommendTypeService;
	
	private List<RecommendType> list;
	
	public String allrecommendType() throws Exception {
		System.out.println("来到了recommendType");
		list = recommendTypeService.allRecommendType(new RecommendType(), "rtsum");
		return "allrecommendtype";
	}

	public RecommendTypeService getRecommendTypeService() {
		return recommendTypeService;
	}

	public void setRecommendTypeService(RecommendTypeService recommendTypeService) {
		this.recommendTypeService = recommendTypeService;
	}

	public List<RecommendType> getList() {
		return list;
	}

	public void setList(List<RecommendType> list) {
		this.list = list;
	}

}
