package koreait.day03;

import java.util.Scanner;

public class C16_SwitchTest {
	public static void main(String[] args) {
		// switch문읜 if ~ else if를 대신하는 명령문
		Scanner sc = new Scanner(System.in);
		int item_no;
		int price;

		System.out.println("상품목록:\n1. 2200원\n2. 1900원\n3. 3600원\n4. 2870원\n");
		System.out.print("구매할 상품을 선택하세요(번호)>>>");
		item_no = sc.nextInt();

		switch (item_no) { // if문에서 조건식 작성했을 때와 같이 비교할 변수
		case 1: // 검사할 값
			price = 2200;
			break; // 아래의 명령문들을 실행하지 않고 switch문 종료
		case 2:
			price = 1900;
			break;
		case 3:
			price = 3600;
			break;
		case 4:
			price = 2870;
			break;
		default: // case문에서 해당되지 않는 값
			System.out.println("잘못 선택했습니다.");
			price = 0;
			break;
		}
		System.out.println("결제금액은 " + price + "원 입니다.");

		// 위의 switch문을 if~elseif로 바꿔서 실행해보기

		if (item_no == 1) {
			price = 2200;
		} else if (item_no == 2) {
			price = 1900;
		} else if (item_no == 3) {
			price = 3600;
		} else if (item_no == 4) {
			price = 2870;
		} else {
			price = 0;
			System.out.println("잘못 선택했습니다.");
		}
		System.out.printf("결제금액은 %d원 입니다.", price);
	}
}
