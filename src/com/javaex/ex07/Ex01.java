package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {
	
	
	public static void main(String[] args) {
		
		//MashSet<Integer> iSet = new MashSet<Integer>();
		Set<Integer> iSet = new HashSet<Integer>();
		
		Integer i01 = new Integer(3);	//줄이 있는 건 없어질 수도 있다는 것 -> 안 쓰는 것이 좋다
		
		iSet.add(i01);
		iSet.add(6);	//자동박싱
		iSet.add(9);	//자동박싱
		
		iSet.add(9);	//중복으로 안들어감
		
		System.out.println("----------------------------------");
		System.out.println(iSet.size());
		System.out.println("----------------------------------");
		
		//방번호(순서) 개념이 없다 -> 일반적인 for문을 사용할 수 없다.
		//향상된 for문
		for(Integer i : iSet) {
			System.out.println(i.toString());
		}
		
	}
	
}
