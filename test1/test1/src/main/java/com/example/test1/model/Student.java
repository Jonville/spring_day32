package com.example.test1.model;

public class Student {
	
	private String StuNo;
	private String StuName;
	private String StuDept;
	private String StuGrade;
	private String StuHeight;
	private String StuWeight;	// 모두 카멜표기법으로
	private String stuAvg;
	
	public String getStuNo() {
		return StuNo;
	}
	public void setStuNo(String stuNo) {
		StuNo = stuNo;
	}
	public String getStuName() {
		return StuName;
	}
	public void setStuName(String stuName) {
		StuName = stuName;
	}
	public String getStuDept() {
		return StuDept;
	}
	public void setStuDept(String stuDept) {
		StuDept = stuDept;
	}
	public String getStuGrade() {
		return StuGrade;
	}
	public void setStuGrade(String stuGrade) {
		StuGrade = stuGrade;
	}
	public String getStuHeight() {
		return StuHeight;
	}
	public void setStuHeight(String stuHeight) {
		StuHeight = stuHeight;
	}
	public String getStuWeight() {
		return StuWeight;
	}
	public void setStuWeight(String stuWeight) {
		StuWeight = stuWeight;
	}
	public String getStuAvg() {
		return stuAvg;
	}
	public void setStuAvg(String stuAvg) {
		this.stuAvg = stuAvg;
	}
	

}
