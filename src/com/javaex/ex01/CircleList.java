package com.javaex.ex01;

public class CircleList {

	//필드
	private Circle[] cArray;
	private int crtPos;
			
	//생성자
	public CircleList() {
		cArray new Circle[3];
		crtPos = 0;
	}
	
	//메소드 gs
	public void add(Circle c) {
		this.cArray[crtPos] = c;
		this.crtPos++;
	}
	
	public Circle get(int i) {
		return cArray[i];
	}
	
	//메소드 일반
	public int size() {
		
	}
	
}
