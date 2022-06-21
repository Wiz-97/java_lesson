package koreait.day04;

public class C19_MethodTest {
	public static void main(String[] args) {
		
		System.out.println("메소드를 직접 정의해서 사용해봅니다.");
		System.out.println("프로그램은 main 메소드의 명령문을 순서대로 실행하고 중간에 메소드 호출을 만나면 메소드가 정의된");
		System.out.println("제어를 이동합니다. 메소드 실행이 종료되면 다시 main 메소드로 제어가 돌아옵니다.");
		System.out.println("1.");
		methodA();//메소드 호출(실행). 필요할 때 호출
		
		System.out.println("2.");
		methodB(11,33);
		
		System.out.println("3.");
		methodC(1557,3.14);
		
		System.out.println("4.");
		methodD();		//반환값이 있는 메소드이지만 main 메소드에서 반환값 저장X
		System.out.println("return = " + methodD());
		
		int temp = methodD();		//반환값을 받아서 변수에 저장하는 예시
		System.out.println("return = " + temp);
		
		System.out.println("5.");
		methodE(3,5);
		System.out.println("return = " + methodE(3,5));
		
		double temp2 = methodE(3,5);
		System.out.println("return = " + temp2);
		
		System.out.println("6.");
		System.out.println((char)methodF('i',4));//methodF 정의하기
		
		
		char ch = 'a';
		int val = 3;
		ch = methodF(ch,val);	//메소드 인자로 변수에 저장된 값 전달
		
		
	}
	/*
	 * String 클래스의 메소드를 이해.
	 * ㄴ메소드의 구조 연습
	 * 
	 * 메소드의 주요 요소: 반환값, 인자(argument) 또는 매개변수(parameter), 메소드 이름, public 또는 static 등의 설정
	 * ㄴ반환값: 메소드 실행이 완료되면 얻어지는 결과값
	 * ㄴ인자: 메소드 실행을 위해 필요한 데이터
	 * ㄴ메소드 이름: 식별자
	 * ㄴpublic: 접근한정자, static: 정적 요소
	 */
	
	
	//static인 main에서 실행할 메소드는 동일하게 static이어야 함
	public static void methodA() {
		System.out.println("##첫번째 메소드 정의 연습입니다.##");
	}
	
	public static void methodB(int a, int b) {
		System.out.println("##두번째 메소드 정의 연습입니다.##");
		System.out.println("전달받은 값 a=" + a + ", b=" + b);
	}
	
	public static void methodC(int a, double b) {
		System.out.println("##세번째 메소드 정의 연습입니다.##");
		System.out.println("전달받은 값 a=" + a + ", b=" + b);
	}
	
	public static int methodD() {		//반환값이 있는 형식: 반환값은 int 데이터, 반드시 return이 필요
		System.out.println("##네번째 메소드 정의 연습입니다.##");
		return 999;
	}
	
	public static int methodE(int a, int b) {
		System.out.println("##다섯번째 메소드 정의 연습입니다.##");
		return a+b;
	}
	
	public static char methodF(char a, int b) {
		System.out.println("##여섯번째 메소드 정의 연습입니다.##");
		return (char)(a+b);
	}
}
