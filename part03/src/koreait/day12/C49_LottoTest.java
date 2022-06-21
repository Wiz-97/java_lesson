package koreait.day12;

import java.util.ArrayList;
import java.util.Random;

public class C49_LottoTest {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		Random r = new Random();
		
		for (int i = 0; i < 45; i++) { 	
			numbers.add(i+1);		//i위치에 i+1 대입 			
		}
		System.out.println("numbers");
		System.out.println(numbers);	//toString이 재정의
		
		ArrayList<Integer> lottery = new ArrayList<Integer>();
		
		int k; //난수로 뽑힐 값 인덱스
		
		for(int cnt=0; cnt<6; cnt++) {
			k=r.nextInt(45-cnt);
			System.out.println("선택된 난수 = " + k + ", 뽑은 숫자 = " + numbers.get(k));
			lottery.add(numbers.get(k));
			numbers.remove(k);		//뽑힌 값 리스트에서 삭제
			System.out.println("남은 공");
			System.out.println(numbers);
		}
		
		
		System.out.println("최종 선택 숫자");
		System.out.println(lottery);
	}
	
	//배열은 저장된 값의 위치 변경(삽입/삭제) 메소드가 없다. 배열은 정적이다.
	//-->> 이런 부분을 ArrayList가 해결하고 웹프로그래밍할 때 ArrayList가 필수
}
