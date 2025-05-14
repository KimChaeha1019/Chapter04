package com.javaex.ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {
	
	public static void main(String[] args) {
		//HashMap 준비 -->키(스트링), 벨류 를 2가지 정해줘야 한다.
		Map<String, Point> pMap = new HashMap<String, Point>();
		
		Point p01 = new Point(2, 4);
		Point p02 = new Point(2, 4);
		Point p03 = new Point(43, 78);
		
		//Map에 포인트(주소) 넣기 --> 키를 중복되지 않게 정해준다
		pMap.put("정우성", p01);
		pMap.put("이효리", p02);
		pMap.put("박명수", p03);
		
		//갯수
		System.out.println(pMap.size());
		//pMap.toString()
		System.out.println("---------------------------");
		System.out.println(pMap.toString());
		
		System.out.println("---------------------------");
		//박명수의 toString()
		System.out.println(pMap.get("박명수").toString());
		System.out.println(pMap.get("박명수").getX());
		
		System.out.println("---------------------------");
		//박명수를 삭제
		pMap.remove("박명수");	//박명수 포인트 삭제
		System.out.println(pMap.toString());
		
		System.out.println("---------------------------");
		Point p04 = new Point(100, 150);	//서장훈 포인트(주소) 추가
		pMap.put("서장훈", p04);
		System.out.println(pMap.toString());
		
		System.out.println("---------------------------");
		//같은 키값을 사용했을때
		Point p05 = new Point(90, 80);
		pMap.put("이효리", p05);	//"이효리"를 넣었을때(이미 있음)
		System.out.println(pMap.toString());	//나중에 넣은 주소값으로 변경됨
		
		System.out.println("---------------------------");
		//전체출력
		
		//1.키 세트를 달라고한다
		Set<String> keys = pMap.keySet();
		
		for(String name : keys) {
			System.out.println(pMap.get(name).toString());
		}
		
		System.out.println("---------------------------");
		
		Map<String, String> boardMap = new HashMap<String, String>();
		
		boardMap.put("title", "게시판 제목 입니다.");
		boardMap.put("date", "2025-05-14");
		boardMap.put("id", "jus");
		boardMap.put("content", "게시판 글 내용입니다.");
		
		System.out.println(boardMap.get("title"));
		System.out.println(boardMap.get("date"));
		
	}

}
