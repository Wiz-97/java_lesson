package koreait.day05;

import java.util.Scanner;

public class C24_StartPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;

		System.out.println("[[영화감상 후기]]");
		System.out.print("평점을 몇 점 주시겠습니까?(1~5)>>>");
		score = sc.nextInt();

		System.out.println("방법1");
		for (int i = 0; i < score; i++) {
			System.out.print("★");
		}

		System.out.println("\n\n방법2_1");
		for (int i = 0; i < score; i++) {
			System.out.print("★");
		}
		for (int i = 0; i < 5 - score; i++) {
			System.out.print("☆");
		}

		System.out.println("\n\n방법2_2");
		for (int i = 0; i < 5; i++) {
			if (i < score) {
				System.out.print("★");
			} else {
				System.out.print("☆");
			}
		}

		System.out.println("\n\n방법2_3");
		int k;			//loop score 변수가 main 메소드의 지역변수
		for (k = 0; k < score; k++) {//score=?
			System.out.print("★");
		}
		
//		System.out.println("k=" + k);//k=?	위의 for문이 종료가 되는 k 값
		for (; k < 5; k++) {//k는 score부터 시작
			System.out.print("☆");
		}
		
		sc.close();
	}
}
