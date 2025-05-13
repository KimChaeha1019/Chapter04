package com.javaex.ex03;

public class MyList<T> {

	//필드
	private T[] oArray;	//상상 추가하면 늘어나면 삭제하면 줄어든다.
	private int crtPos;			//현재위치 -->화살표
	
	//생성자
	public MyList() {
		oArray = (T[])new Object[3];	//상상 추가하면 늘어나면 삭제하면 줄어든다.
		crtPos = 0;
	}
	
	//메소드 gs
	
	//메소드 일반
	public void add(T p) {
		this.oArray[crtPos] = p;	//업캐스팅 자동 - 섞어쓰기
		this.crtPos++;
	}
	
	public T get(int i) {
		return oArray[i];
	}
	
	public int size() {
		return crtPos;
	}
	
}
