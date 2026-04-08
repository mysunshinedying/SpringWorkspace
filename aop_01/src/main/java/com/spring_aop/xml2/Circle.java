package com.spring_aop.xml2;

public class Circle {
	private double diameter;

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	
	public void showResult() {
		System.out.println("원의 면적 : " + (diameter / 2) * (diameter / 2) * 3.14);
		System.out.println("원의 지름 : " + diameter * 3.14);
	}
}
