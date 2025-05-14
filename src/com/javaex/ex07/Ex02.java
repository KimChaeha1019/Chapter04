package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {
	
	public static void main(String[] args) {
		
		//번호 계속 생성
		//번호가 6개가 되면 끝-->set의 갯수가 6개면 끝
		
		//로또 번호 프로그램 작성
		//Set
		/*
		int[] random = new int[6];
				
		for(Integer i : random) {
			
			random[i] = (int)(Math.random()*45)+1;
			
			int a;
			for( a=0; a<i; a++) {
				if(random[i] == random[a]) {
					break;
				}
			}
			if(i != a) {
				i--;
			} else {
				System.out.println(random[i]);
			}
				}
			*/
		
		Set<Integer> iSet = new HashSet<Integer>();
		
		while(true) {
			if(iSet.size() == 6) {//iSet에 숫자가 6개면 끝
				break;
			}
			
			int no = (int)(Math.random()*45+1);
			iSet.add(no);	//중복이면 안 들어간다
			
		} 
		
		System.out.println("------------------------------");
		//출력
		for(int no : iSet) {
			System.out.println(no);
		}
		
	}

}
