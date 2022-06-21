package koreait.day03;

import java.util.Scanner;

public class C13_MaxMinEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1, n2, n3, max, min;
		// 3개의 정수를 입력받아 가장 큰 값을 출력하기
		// 작성자 이훈복
		System.out.print("첫번째 정수를 입력하세요>>> ");
		n1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요>>> ");
		n2 = sc.nextInt();
		System.out.print("세번째 정수를 입력하세요>>> ");
		n3 = sc.nextInt();

		if (n1 >= n2) {
			max = n1;
			min = n2;
			if (max < n3) {
				max = n3;
			}
		} else {
			max = n2;
			min = n1;
			if (max < n3) {
				max = n3;
			} else if (min > n3) {
				min = n3;
			}
		}

		System.out.printf("가장 큰 정수는 %d입니다.\n", max);
		System.out.printf("가장 작은 정수는 %d입니다.", min);
		sc.close();
	}
}
