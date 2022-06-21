package koreait.day06;

public class C32_ArrayManipulation {
	public static void main(String[] args) {
		// 배열 요소의 삽입/삭제
		int[] test = { 11, 22, 33, 44, 55, 66, 77 };

		//인덱스 k에 삽입할 때 - 오른쪽 인덱스 증가 방향으로 이동
		int k = 2;
		for (int i = test.length - 2; i >= k; i--) {
//		for (int i = 2; i<test.length - 1; i++) {
			test[i + 1] = test[i];
		}
		test[k] = 23;
		
		for (int i = 0; i < test.length; i++) {
			System.out.print(test[i] + "\t");
		}

		int[] test2 = { 11, 22, 33, 44, 55, 66, 77 };
		System.out.println();
		System.out.println("==============================================================");
		
		// 인덱스2를 삭제할 때 - 왼쪽 인덱스 감소방향으로 이동
		for (int i = 1; i < test2.length-1; i++) {
			test2[i] = test2[i+1];
		}

		for (int i = 0; i < test2.length-1; i++) {
			System.out.print(test2[i] + "\t");
		}

		//인덱스 k를 삭제할 때 - 왼쪽 인덱스 감소방향으로 이동
		System.out.println();
		System.out.println("==============================================================");
		for(int i=k+1;i<test2.length;i++) {
			test2[i-1]=test2[i];
		}
		for(int i=0; i<test2.length;i++) {
			System.out.print(test2[i] + "\t");
		}//앞서 인덱스 2(22)를 삭제하고 한번 더 인덱스 2(44)를 삭제해서 총 2개 삭제한 결과
		
	}
}
