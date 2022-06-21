package koreait.day02;

public class C04_DoubleData {
	public static void main(String[] args) {
		System.out.println("float 실수데이터---------------");
		System.out.println("메모리 크기: " + Float.BYTES);//BYTES는 이미 정해져 있는 값
		System.out.println("float 실수의 최소값: " + Float.MIN_VALUE);
//		1.4E-45는 1.4 x 10의 -45승, 3.4028235E38는 10의 38승
		System.out.println("float 실수의 최대값: " + Float.MAX_VALUE);
		
		System.out.println("Double 실수데이터---------------");
		System.out.println("메모리 크기: " + Double.BYTES);//BYTES는 이미 정해져 있는 값
		System.out.println("Double 실수의 최소값: " + Double.MIN_VALUE);
		System.out.println("Double 실수의 최대값: " + Double.MAX_VALUE);
	}
}
/*	실수 데이터 기본형식: float, double(변수 선언 시 사용되는 키워드)
 *  Wrapper 클래스는 Float, Double
 *  1.234 리터럴 = double 형식
 *  실수데이터는 컴퓨터 구조에서 부동소수점 형식으로 다룸
 *  예를 들면 1.23 x 10^23 에서 1.23(가수)와 23(지수)를 각각 어떤 크기만큼 할당하느냐에 따라
 *  값의 표현범위와 정밀도가 결정됨
 *  
 */ 