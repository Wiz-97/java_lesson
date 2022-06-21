package koreait.day03;

import java.util.Scanner;

public class C14_IfElseIf {
	public static void main(String[] args) {
		// if(조건식){명령문}else if(또 다른 조건식){명령} ...
		/*
		 * 나의 쇼핑몰 마컷컬리 이벤트
		 * 오늘 구입한 금액이 10만원 이상이면 적립금 구매금액의 10%
		 * 7만원 이상 9%
		 * 4만원 이상 7%
		 * 그 미만 3%
		 */
		Scanner sc = new Scanner(System.in);
		int totPrice;//총 구매금액
		double rate;//적립율
		int payback;//적립금액
		
		System.out.print("총 구매 금액 >>>");
		totPrice = sc.nextInt();
		
		if(totPrice>=100000) {
			rate = 0.1;
		}else if(totPrice>=70000) {
			rate = 0.09;
		}else if(totPrice>=40000) {
			rate = 0.07;
		}else {			 
			rate = 0.03;
		}
		
		payback = (int)(totPrice*rate);
		
		System.out.printf("적립율은 %d%%입니다.\n",(int)(rate*100));
		System.out.printf("적립금액은 %d원 입니다.",payback);
		sc.close();
	}
}
