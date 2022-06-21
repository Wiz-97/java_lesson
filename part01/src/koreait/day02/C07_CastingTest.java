package koreait.day02;

public class C07_CastingTest {
	
	public static void main(String[] args) {
		
		//대입문: 오른쪽 값/수식/변수가 왼쪽 변수로 대입. 수식에 사용되는 연산자는 아래와 같다.
		//산술연산자: +, -, *, /(나누기), %(나머지 계산), ...
		//관계연산자: ==(동등, 같다), !=(부정, 같지 않다), >, <, >=, <=, ...
		//논리연산자: &&(AND), ||(OR), !(NOT)
		
		//참고: ++, --, +=, -=, /=, ... 등 과 같은 축약연산자는 후에 따로
		//정수형식의 연산은 int
		
		int a = 123, b = 13;//같은 타입의 변수는 한 줄에서 선언 가능
		double c = 10.34;
		
		//연산에 사용되는 피연산자가 모두 정수이면 결과는 정수
		//연산에 사용되는 피연산자에 정수와 실수가 섞여있으면 결과는 실수
		//즉, 연산결과를 변수에 저장할 때 반드시 연산결과의 데이터 형식을 확인해야함
		
		int asum;
		double bsum;
		
		asum = a + b;
		bsum = a + c;
		
		System.out.println("a + b = " + asum);
		System.out.println("a + c = " + bsum);
		
		//형변환(casting): 정수 + 실수 결과를 꼭 정수 변수에 저장해야 한다면 실수를 정수로 변환해서 계산
		
		asum = a + (int)c;//c변수의 실수값을 정수로 변환
		
		System.out.println(asum);
		
		System.out.println("a/b = " + (a/b));//정수끼리 나누면 결과 정수
		System.out.println("a%b = " + (a%b));//정수끼리 나누기의 나머지
		
		System.out.printf("%d %% %d = %d\n",a,b,a%b);
		System.out.printf("%d / %d = %d\n",a,b,a/b);
		
		System.out.println("정수/정수 = 실수 형식 값으로 출력하기");
		System.out.printf("%d / %d = %.2f\n",a,b,(double)a/b);//실수 형식문자 %f, 기본 소수점 이하 6자리
		
		double test = 12.34569489811461;
		System.out.println("test = " + test);
		System.out.printf("test = %.8f\n",test);
		System.out.printf("test = %f\n",test);//기본값 소수 6번째까지임을 확인 가능
		
	}
	
}
