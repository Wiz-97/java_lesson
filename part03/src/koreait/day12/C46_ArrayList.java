package koreait.day12;

import java.util.ArrayList;
import java.util.Arrays;

public class C46_ArrayList {

	public static void main(String[] args) {
		int[] datas = { 45, 23, 7, 21, 19, 11, 44 }; // 배열은 선언할 때 배열의 크기를 정함
		// 배열은 기본형 데이터타입(int, double, long, ...). 또는 참조형 타입
		ArrayList<Integer> list = new ArrayList<>();
		// ArrayList는 크기가 동적
		// 데이터 타입은 참조형 타입만. 기본형은 래퍼(Wrapper)클래스 사용
		// <E>는 제너릭 타입이라고 함(Generic = 포괄적인)
		// 리스트에 저장하는 데이터를 요소(Element)라고 한다
		// 주요 메소드: add, get, size, remove

		String[] names = { "윤환", "경민", "성균", "윤중", "성현" };
		ArrayList<String> name_list = new ArrayList<>();

		// ArrayList에 데이터 추가는 add() 메소드 사용
		list.add(45);
		list.add(9);
		list.add(21);
		list.add(19);
		list.add(11);
		list.add(44);

		System.out.println("첫번째 ArrayList<Integer> 출력");
		System.out.println(list);
		System.out.println("참고(배열): " + Arrays.toString(datas) + ", 배열크기: " + datas.length);

		name_list.add("윤환");
		name_list.add("경민");
		name_list.add("제동");
		name_list.add("찬기");
		System.out.println("\n두번째 ArrayList<String> 출력");
		System.out.println(name_list); // null 아님
		System.out.println("리스트의 크기: " + name_list.size()); // 데이터가 없을 때 size = 0

		System.out.println("3. 특정 위치에 데이터 추가");
		list.add(1, 23); // (인덱스위치, 추가될 값) 단, 인덱스 위치는 리스트 크기보다 작은 값
		System.out.println("add(1,23) 결과: " + list);
		name_list.add(2, "성대");
		System.out.println("add(2, \"성대\" 결과: " + name_list);

		System.out.println("4. 배열처럼 index 값으로 데이터 가져오기");
		System.out.println("get(3): " + list.get(3));
		System.out.println("get(3): " + name_list.get(3));

		System.out.println("\n5. 특정 위치의 데이터(요소) 제거");
		list.remove(4);
		System.out.println("remove(4) 결과: " + list);
		name_list.remove(4);
		System.out.println("remove(4) 결과: " + name_list);

		System.out.println("]n6. 특정 값 위치를 알아내기('윤환'은 몇번 인덱스?)");
		System.out.println("배열: " + Arrays.binarySearch(names, "윤환"));
		System.out.println("리스트: " + name_list.indexOf("윤환"));

		System.out.println("\n7. 6번의 실행내용을 for문으로 한다면?");
		System.out.println("배열");
		int i;
		for (i = 0; i < names.length; i++) {
			if (names[i].equals("윤환")) {
				break;
			}
		}
		System.out.println("'윤환'은 인덱스: " + i);

		System.out.println("리스트");
		for (i = 0; i < name_list.size(); i++) {
			if (name_list.get(i).equals("윤환")) {
				break;
			}
		}
		System.out.println("'윤환'은 인덱스: " + i);
		
		//만약 찾는 요소가 여러 개 중복되어 존재한다면??
		//lastInexOf 메소드로 마지막 위치의 요소 특정 가능
		
		
		System.out.println("\n8. contains 메소드 - return 타입 boolean");
		System.out.println("'제동'이 리스트에 있는가? " + name_list.contains("제동"));
		System.out.println("'찬기'가 리스트에 있는가? " + name_list.contains("찬기"));
		
		
		
		
		

	}
}

/*
 * 배열: 많은 양의 데이터를 저장하는 방법
 * 
 * 컬렉션(Collections): 자료구조. 많은 양의 데이터를 저장하는 것, 데이터 특징에 따라 관리방법이 차이가 있음 데이터 삽입/삭제
 * 등의 알고리즘이 메소드로 구현되어 있음 ㄴArrayList 클래스 ㄴHashMap 클래스
 * 
 */
