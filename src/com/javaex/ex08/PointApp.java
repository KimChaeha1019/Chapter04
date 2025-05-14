package com.javaex.ex08;

import java.util.HashSet;
import java.util.Set;

public class PointApp {
	
	public static void main(String[] args) {
		
		Set<Point> pSet = new HashSet<Point>();
		
		//주소 x+y --> 주소만드는 공식을 잘만들면 횟수를 줄일수 있다
		Point p01 = new Point(1, 2);	//0x1111--> 3으로 주소를 조작
		Point p02 = new Point(10, 20);	//0x2222--> 30으로 주소를 조작
		Point p03 = new Point(2, 1);	//0x3333--> 3으로 주소를 조작
		Point p04 = new Point(1, 2);	//0x4444--> 3으로 주소를 조작
		
		Point p05 = new Point(0, 3);	//0x5555--> x*y
		
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		pSet.add(p04);
		
		System.out.println("-------------------------");
		System.out.println(pSet.toString());
		
		System.out.println("-------------------------");
		for(Point p : pSet) {
			//System.out.println(p.toString());
			//System.out.println(p.getX());
			System.out.println(p.hashCode());
			System.out.println(p.toString());
		}
		
		
		
	}

}
