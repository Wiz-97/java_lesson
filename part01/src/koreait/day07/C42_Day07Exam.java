package koreait.day07;

import java.util.Random;
import java.util.Scanner;

public class C42_Day07Exam {
	public static void main(String[] args) {
		// 작성자 이훈복
		System.out.println("-------------------------------------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("-------------------------------------------------------");

		System.out.println("시작합니다.");
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int[] random = new int[90];

		for (int i = 0; i < 90; i++) {
			random[i] = i + 10;// random 배열 10~99
		}

		int k;//난수
		int[] operand1 = new int[10];
		int[] operand2 = new int[10];
		int correctNum=0;//맞은 갯수
		int[] answer = new int[10];
		
		for (int i = 0; i < operand1.length; i++) {
			k = r.nextInt(90 - i);
			operand1[i] = random[k];
			
			for (int j = k; j < random.length - 1; j++) {
				random[j] = random[j + 1]; // 뽑은 수 삭제하고 배열 한칸씩 당김
			}
		}

		for (int i = 0; i < operand2.length; i++) {
			k = r.nextInt(90 - i);
			operand2[i] = random[k];
			for (int j = k; j < random.length - 1; j++) {
				random[j] = random[j + 1]; // 뽑은 수 삭제하고 배열 한칸씩 당김
			}
		}
		
		for(int i = 0; i<10; i++) {
			System.out.printf("문제%d. %d + %d = 답 입력 >>>",i+1,operand1[i],operand2[i]);
			int ans = sc.nextInt();
			answer[i]=ans;
			if(ans == operand1[i]+operand2[i]) {
				correctNum++;
			}
		}
		System.out.println("-------------------------------------------------------");
		System.out.printf("채점합니다. 맞은 갯수 %d (%d점)\n",correctNum,correctNum*10);
		System.out.println(":::::오답노트:::::");
		for(int i=0; i<answer.length; i++) {
			if(answer[i] != operand1[i] + operand2[i]) {
				System.out.printf("문제%d. %d + %d = %d\n", i+1,operand1[i],operand2[i],operand1[i]+operand2[i]);
			}
		}
	}
}
