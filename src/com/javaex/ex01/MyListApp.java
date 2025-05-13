package com.javaex.ex01;

public class MyListApp {
	
	public static void main(String[] args) {
		
		//배열
		//미리갯수를 결정해야한다(낭비, 수정)
		//
		Point[] pArray = new Point[3];
		
		//포인트
		/*
		Point p01 = new Point(2, 2);
		Point p02 = new Point(3, 3);
		Point p03 = new Point(4, 4);
		Point p04 = new Point(5, 5);
		
		//배열에 포인트 담기
		pArray[0] = p01;
		pArray[1] = p02;
		pArray[2] = p03;
		
		for(int i=0; i<pArray.length; i++) {
			System.out.println(pArray[i]);
		}
		
		// System.out.println(pArray.toString());
		 //System.out.println(pArray.toStirng(pArray));
		*/
		
		//리스트
		PointList pList = new PointList();
		
		//포인트
		Point p01 = new Point(2,2);
		Point p02 = new Point(3,3);
		Point p03 = new Point(4,4);
		
		//리스트에 포인트 주소 추가
		pList.add(p01);
		pList.add(p02);
		
		//출력
		Point p = pList.get(0);
		System.out.println(p.getX());
		
		
		//리스트(원)
		CircleList cList = new CircleList();
		
		//원
		Circle c01 = new Circle(3);
		Circle c02 = new Circle(4);
		Circle c03 = new Circle(5);
		
		cList.add(c01);
		cList.add(c02);
		cList.add(c03);
		
		//출력
		for(int i=0; i<cList.size(); i++) {
			System.out.println(cList.get(i).toString());
		}
		
		
				
	}

}
