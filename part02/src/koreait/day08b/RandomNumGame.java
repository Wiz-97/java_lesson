package koreait.day08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumGame {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int max = 5;
		int[] triallst = new int[max];

		System.out.println("숫자 맞추기 게임 시작합니다. 나 컴퓨터는 숫자를 결정했습니다.");
		System.out.println("너, 휴먼은 맞춰보세요. (101~299)");
		int numComputer = r.nextInt(199) + 101;
		int numHuman;
		int i = 0;
		do {
			System.out.print("생각한 숫자 입력(기회: " + (max - i) + ") -> ");
			numHuman = sc.nextInt();
			if (numComputer > numHuman) {
				triallst[i] = numHuman;		//i번째 입력한 숫자가 정답과 동일하지 않으면 배열의 i번째 칸에 저장
				i++;						//trial 횟수 1 추가(카운팅)
				System.out.println("아닙니다. 더 큰 값입니다.");
			} else if (numComputer < numHuman) {
				triallst[i] = numHuman;		//i번째 입력한 숫자가 정답과 동일하지 않으면 배열의 i번째 칸에 저장
				i++;						//trial 횟수 1 추가(카운팅)
				System.out.println("아닙니다. 더 작은 값입니다.");
			}

			if (i == max) {	//i가 초기값 0부터 시작해서 10회 도전 후 i가 10이 되면 반복문 종료
				break;
			}

		} while (numComputer != numHuman);	//숫자가 동일하지 않은 동안에는 do 문법 반복
		if(i==max) {
			System.out.println("너 휴먼 입력 내용: " + Arrays.toString(triallst));
			System.out.println("주어진 기회를 다 쓰셨습니다. 게임을 다시 시 작하세요.!!");
		}else {
			System.out.println("정답입니다! 성공까지 시도횟수: " + (i+1));
			
		}
	}

}
