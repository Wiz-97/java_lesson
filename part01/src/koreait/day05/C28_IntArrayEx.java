package koreait.day05;

import java.util.Scanner;

public class C28_IntArrayEx {
	//작성자: 이훈복
	/*
	 * 1. int 배열 크기 5를 선언하세요. 이름은 nums
	 * 2. 배열 요소의 값은 사용자 입력으로 저장합니다.
	 * 3. 입력된 값의 합계,평균을 구합니다.
	 * 4. 입력된 값의 최대값, 최소값을 구하는 메소드를 만듭니다.
	 * 		ㄴ인자는 int 배열, 반환값 형식 int
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		int sum = 0;
		double avg = 0;

		for (int i = 0; i < nums.length; i++) {
			System.out.print("정수 입력>>>");
			nums[i] = sc.nextInt();
			sum += nums[i];
		}
		System.out.printf("배열 요소의 합은 %d입니다.\n", sum);
		avg = (double)sum / nums.length;
		System.out.printf("배열 요소의 평균값은 %.2f입니다.\n", avg);
		System.out.printf("최대값은 %d입니다.",maxOfArray(nums));
		System.out.printf("최소값은 %d입니다.",minOfArray(nums));
		
		sc.close();
	}

//	max,min 변수를 각각 배열의 0번 요소값으로 초기화
//	배열요소 1번부터 마지막 요소까지 max, min과 순서대로 비교해서
//	max가 그 값보다 작으면(or min이 그 값보다 크면) max(min) 값을 배열요소값으로 변경
//	->비교가 끝나면 최종 max,min 결정

	public static int maxOfArray(int[] array) {
		int max = array[0];
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max = array[i];
			}
		}
		return max;
	}

	public static int minOfArray(int [] array) {
		int min = array[0];
		for (int i=0; i<array.length;i++){
			if(min>array[i]) {
				min = array[i];
			}
		}
		return min;
	}
}
