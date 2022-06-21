package koreait.day12;

import java.util.ArrayList;

public class C47_MemberTest {
	public static void main(String[] args) {
		//Member[] members = new Member[10];
		ArrayList<Member> list = new ArrayList<>();	//리스트에 저장되는 것은 객체의 참조값
		
		list.add(new Member("윤환", 34));				//새로운 객체 생성하고 참조값을 리스트에 추가
		Member member = new Member("제동", 33);
		list.add(member);
		list.add(new Member("경민", 31));
		list.add(new Member("학수", 25));
		System.out.println("현재 list의 요소 개수: " + list.size());
		System.out.println("리스트 출력");
		System.out.println(list);
		
		//list.get(i)  -> Member 객체의 참조값
		System.out.println("2. list의 요소 중 age 필드값이 30 이하인 것만 출력해보기");// for문
		
		for(int i=0; i<list.size();i++) {
			if(list.get(i).getAge()<=30) {
				System.out.println("i=" + i + ", " + list.get(i));
			}
		}
		
		
		System.out.println("3. '경민'은 몇번 인덱스에서 참조하고 있는 객체인가?");
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals("경민")) {
				System.out.println("i=" + i + ", " + list.get(i));
			}
		}
		//리스트 요소가 여러개의 필드를 갖는 객체면 필드값 비교하는 equals 예제
		//							indexOf는 String, 기본형 래퍼 클래스만 추가 기능 구현 없이 사용
		
		System.out.println("Member 객체로 indexOf 실행: " + list.indexOf(new Member("제동", 33)));
		//-1, 못찾음(이유: 찹조갓ㅂ이 같은 것을 찾는 것인데 이것을 필드값 비교해서 찾도록 바꿔주는 기능 필요
		System.out.println("Member 객체로 indexOf 실행: " + list.indexOf(member));	// 1
		for(int i=0; i<list.size();i++) {
			if(list.get(i).getName().equals("경민")&&list.get(i).getAge()==31) {
				System.out.println("i=" + i + ", " + list.get(i));
			}
		}
		
		
		
		
	}
}
