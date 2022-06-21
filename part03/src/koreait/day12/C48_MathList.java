package koreait.day12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//C43번 예제 리스트로 변경하기
public class C48_MathList {
	public static void main(String[] args) {
		// 작성자 이훈복
		Scanner sc = new Scanner(System.in);
		int size = 5; // 문제 갯수
		int max_size = MathProblem.max_size; // size 변수값이 max_size 초과하는지 검사 추가

		ArrayList<MathProblem> problemList = new ArrayList<>();
		// 모든 문제 저장하는 배열

		// 배열의 타입은 MathProblem 객체참조형: n1, n2, op, isCorrect

		int ans;
		int cnt = 0;
		System.out.println("----------------------------------");
		System.out.println("빨간펜 수학 두자릿수 덧셈 문제 풀기");
		System.out.println("----------------------------------");
		System.out.println("시작합니다.");
		for (int i = 0; i < size; i++) {
			MathProblem temp = new MathProblem('+');
			temp.makeProb(); // n1, n2 값이 객체의 필드로 생성

			System.out.print("문제" + (i + 1) + ". " + temp.getN1() + " + " + temp.getN2() + "= 답 입력 >>>");
			ans = sc.nextInt();
			if (ans == temp.showAnswer()) { // 정답과 비교, 맞은 갯수 count
				cnt++; // 틀린 문제 카운트
				temp.setCorrect(true);
			}
//			problems[i] = temp;<<<어떻게 변환?
			problemList.add(temp);
		}
		System.out.println("----------------------------------");
		System.out.println("채점 합니다. 맞은 갯수 " + cnt + " (" + (cnt * 100 / size) + "점)");
		System.out.println(":::::틀린 문제 정답 보기:::::");

		for (int i = 0; i < problemList.size(); i++) {
			if (!problemList.get(i).isCorrect()) { // 거짓이면 !연산으로 참으로 바뀜
				System.out.println(
						"문제 " + (i + 1) + ". " + problemList.get(i).problem() + problemList.get(i).showAnswer());
			}
		}

		sc.close();

	}
}
