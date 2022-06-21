package koreait.day12;

import java.util.HashMap;

public class C50_HashMap {
	public static void main(String[] args) {
		
		//식당이 메뉴판(메뉴이름, 가격) 데이터를 저장하려고 함
		String[] title = {"물냉면","비빔냉면","제육"};
		int[] price = {12000,12000,10000};
		
		//key는 메뉴이름, values는 가격으로 하는 hashmap 선언
		//key는 값이 중복되면 안됨
		HashMap<String,Integer> menus = new HashMap<>();
		
		//데이터 저장: put() 메소드
		menus.put("물냉면", 12000);
		menus.put("비빔냉면", 12000);
		menus.put("제육", 10000);
		
		System.out.println("1. 저장된 데이터 출력");
		System.out.println(menus);
		
		//데이터 접근(읽기): get() 메소드
		System.out.println("2. 특정한 key 값의 value 출력");
		System.out.println("'물냉면의 가격?' " + menus.get("물냉면") + "원");
		System.out.println("'비빔냉면의 가격?' " + menus.get("비빔냉면") + "원");
		System.out.println("'제육의 가격?' " + menus.get("제육") + "원");
		
		//key 값 중복되면?
		menus.put("제육", 14000);		//실행결과? 덮어쓰기(value가 변경)
		System.out.println(menus);
		
		
		//데이터 삭제: remove() 메소드
		System.out.println("3. 특정 요소 삭제");
		menus.remove("비빔냉면");	//인자가 key
		System.out.println("삭제 결과 확인: " + menus);
//		menus.remove("제육",10000);	//인자 key, value: key와 value가 모두 일치해야 삭제
		menus.remove("제육",14000);
		System.out.println("삭제 결과 확인: " + menus);
		
		
		
		
		
		
	}
}
/*	ArrayList : 순차적(인덱스로 접근) 으로 데이터를 관리하는 자료구조입니다.배열과 유사한 구조입니다.
	HashMap : 순차적인 구조가 아닙니다. 인덱스를 사용하지 앖고 Key 값을 이용하여 데이터접근하여 저장/읽기 합니다.
				*검색*이 많은 알고리즘에 유용합니다. 
  				제너릭 타입은 K:Key , V:Value 한쌍입니다.
  				Key와 Value는 모든 타입 가능
  				(hashmap 에서는 key, value 한쌍으로 요소가 된다. value를 검색하기 위해 key 사용
 	ArrayList 와 마찬가지로 int,long,double 기본형 타입 대신에 래퍼(wrapper)클래스로 표기합니다.
*/
