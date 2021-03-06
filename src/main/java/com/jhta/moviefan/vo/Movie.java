package com.jhta.moviefan.vo;

import java.util.Date;


public class Movie {
	
	private int no;
	private String title;
	private String titleEn;
	private String rate;
	private int runtime;
	private Date openDate;
	private Date productionYear;
	private Double customerRating;
	private int totalAudience;
	private String summary;
	private String producer;
	private String poster;
	private Date createdDate;
	private Date updatedDate;
	
	public Movie() {}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitleEn() {
		return titleEn;
	}

	public void setTitleEn(String titleEn) {
		this.titleEn = titleEn;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public Date getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(Date productionYear) {
		this.productionYear = productionYear;
	}

	public Double getCustomerRating() {
		return customerRating;
	}

	public void setCustomerRating(Double customerRating) {
		this.customerRating = customerRating;
	}

	public int getTotalAudience() {
		return totalAudience;
	}

	public void setTotalAudience(int totalAudience) {
		this.totalAudience = totalAudience;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "Movie [no=" + no + ", title=" + title + ", titleEn=" + titleEn + ", rate=" + rate + ", runtime="
				+ runtime + ", openDate=" + openDate + ", productionYear=" + productionYear + ", customerRating="
				+ customerRating + ", totalAudience=" + totalAudience + ", summary=" + summary + ", producer="
				+ producer + ", poster=" + poster + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate
				+ "]";
	}

	
	

	
}
