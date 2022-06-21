package koreait.day03;

import java.util.Scanner;

public class C08_KeyInputTest {

	public static void main(String[] args) {
		//작성자 이훈복
		Scanner sc = new Scanner(System.in);
		
		//사각형 도형의 넓이 구하기
		int width;
		int height;
		
		System.out.print("가로 너비를 입력하세요(cm단위) >>> ");
		width = sc.nextInt();
		
		System.out.print("세로 높이를 입력하세요(cm단위) >>> ");
		height = sc.nextInt();
		
		int squareArea = width*height;
		System.out.printf("가로 = %dcm, 세로 = %dcm 인 직사각형의 넓이 = " + squareArea + "㎠ \n",width,height);
		
		System.out.println("==============================================");
		
		//원 도형의 넓이와 둘레 구하기
		final double PI = 3.14;
		double radius;
		
		System.out.print("원의 반지름 크기를 입력하세요(cm단위) >>> ");
		radius = sc.nextDouble();
		
		double circleArea = PI*radius*radius;//radius 값을 입력 받은 후에 circleArea 계산 가능
		
		System.out.printf("반지름이 %.3fcm인 원의 둘레 = " + (2*PI*radius) + "cm \n",radius);
		System.out.printf("반지름이 %.3fcm인 원의 넓이 = " + circleArea + "㎠ \n",radius);
		
		sc.close();
		
		//final 테스트
		//		변수선언 앞에 final 키워드를 붙이면 값 변경 불가능
		final int test = 123;
		System.out.println("test = " + test);
//		test = 456; => final 때문에 값 변경이 불가하므로 오류 발생
	}

}
