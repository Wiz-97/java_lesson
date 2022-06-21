package koreait.day05;

import java.util.Scanner;

/*
 * GUI: Graphic User Interface(사용자 명령을 아이콘, 메뉴 방식으로 처리)
 * CLI: Command Line Interface(사용자 명령을 텍스트로만 처리하는 방식)
 */




public class C26_WhileTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;// 반복을 제어할 변수
		int sel;// 선택 사항 저장
		int balance = 0;// 잔고(잔액)

		while (run) { // 초기값은 참
			int money; // while문 지역변수. 입금액과 출금액 저장
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고확인 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("메뉴 선택>>>");
			sel = sc.nextInt();

			switch (sel) {
			case 1:// 예금 처리
				System.out.print("예금액>>>");
				money = sc.nextInt();
				balance += money;
				System.out.printf("%d원 입금했습니다.", money);
				System.out.printf("고객님의 현재 잔액은 %d원입니다.\n", balance);
				break;
			case 2:// 출금 처리
				System.out.print("출금액>>>");
				money = sc.nextInt();
				if (balance >= money) {
					balance -= money;
					System.out.printf("%d원 출금했습니다.", money);
					System.out.printf("고객님의 현재 잔액은 %d원입니다.\n", balance);
				} else {
					System.out.println("잔액이 부족합니다.");
				}
				break;
			case 3:// 잔고 출력
				System.out.printf("현재 잔고: %d원", balance);
				System.out.println();
				break;
			case 4:// 반복 종료
				System.out.println("프로그램을 종료합니다.");
				run=false;
				break;
			default:
				System.out.println("잘못된 선택입니다. 1~4까지의 값 중 입력해주세요.");
			}
		}
	}
}
