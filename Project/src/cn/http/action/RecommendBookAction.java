package cn.http.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cn.http.entity.RecommendBook;
import cn.http.service.RecommendBookService;

public class RecommendBookAction extends ActionSupport {

	private static final long serialVersionUID = 7257156592761716118L;
	
	private RecommendBookService recommendBookService;
	
	private List<RecommendBook> list;
	
	public String allrecommendbook() throws Exception {
		list = recommendBookService.allRecommendBook(new RecommendBook(), "rbsum");
		return "allrecommendbook";
	}

	public RecommendBookService getRecommendBookService() {
		return recommendBookService;
	}

	public void setRecommendBookService(RecommendBookService recommendBookService) {
		this.recommendBookService = recommendBookService;
	}

	public List<RecommendBook> getList() {
		return list;
	}

	public void setList(List<RecommendBook> list) {
		this.list = list;
	}
	
	
	
}
