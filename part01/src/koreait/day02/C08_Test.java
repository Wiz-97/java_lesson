package koreait.day02;

public class C08_Test {

	public static void main(String[] args) {
		//작성자 이훈복
		
		//사각형 도형의 넓이 구하기
		int width = 23;
		int height = 19;
		double squareArea = width*height;
		System.out.printf("가로 = %dcm, 세로 = %dcm 인 직사각형의 넓이 = " + squareArea + "㎠ \n",width,height);
		
		System.out.println("==============================================");
		
		//원 도형의 넓이와 둘레 구하기
		final double PI = 3.14;
		double radius = 23.230;
		double circleArea = PI*radius*radius;
		System.out.printf("반지름이 %.3fcm인 원의 둘레 = " + (2*PI*radius) + "cm \n",radius);
		System.out.printf("반지름이 %.3fcm인 원의 넓이 = " + circleArea + "㎠ \n",radius);
		
		//final 테스트
		//		변수선언 앞에 final 키워드를 붙이면 값 변경 불가능
		final int test = 123;
		System.out.println("test = " + test);
//		test = 456; => final 때문에 값 변경이 불가하므로 오류 발생
	}

}
