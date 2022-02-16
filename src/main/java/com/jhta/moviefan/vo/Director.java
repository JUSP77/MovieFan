package com.jhta.moviefan.vo;

public class Director extends MoviePerson {

	private int no;
	private String name;
	private String nameEn;
	
	public Director() {}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameEn() {
		return nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	@Override
	public String toString() {
		return "Director [no=" + no + ", name=" + name + ", nameEn=" + nameEn + "]";
	}

	
	
}
