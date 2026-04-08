package com.spring_aop.xml2;

public class Evaluation {
	private int kor;
	private int eng;
	private int math;
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public void showResult() {
		System.out.println("국어/영어/수학 평균 : " + (double)(kor + eng + math) / 3);
	}
}
