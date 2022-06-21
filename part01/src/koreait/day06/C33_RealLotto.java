package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C33_RealLotto {

	public static void main(String[] args) {
		// 작성자 이훈복
		int[] num = new int[45];
		Random r = new Random();

		for (int i = 0; i < 45; i++) { 	// 인덱스 범위 0~44 지정
			num[i] = i + 1; 			// 값 범위 1~45 지정
		}

		int[] lottery = new int[6];			//뽑은 숫자 집어넣을 배열 설정
		int k;								//난수 넣을 변수
		for (int i = 0; i < 6; i++) {		// 뽑는 횟수 6번
			k = r.nextInt(45 - i);			// 0~44까지의 난수 중 하나 뽑음, 난수의 bound값을 뽑기 진행에 따라 줄여나감
			System.out.println("선택된 난수 = " + k + ", 뽑은 숫자 = " + num[k]);
			lottery[i] = num[k];			// i번째 뽑은 숫자는 난수 k번째 num 배열

			for (int j = k; j < num.length - 1; j++) {
				num[j] = num[j + 1];		// 뽑은 수 삭제하고 배열 한칸씩 당김
			}
//			System.out.println(Arrays.toString(num)); //삭제되고 당겨졌는지 확인
		}
		System.out.print("최종 선택 숫자: ");
		System.out.println(Arrays.toString(lottery));

		Arrays.sort(lottery);				// 오름차순 정렬
		System.out.print("오름차순 결과: ");
		System.out.println(Arrays.toString(lottery));
	}
}
