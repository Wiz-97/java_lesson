package koreait.day04;

public class C20_StringMethod {
	public static void main(String[] args) {
		
		String message = "Hello World";		//java.lang.String(기본패키지 클래스)
		
		//String 클래스의 메소드는 매우 많음
		//다 외우고 사용하는 것이 아니고 메소드의 이름, 인자, 리턴형식을 참조해서 사용
		//메소드 오버로딩(overloading): 메소드 이름과 리턴형식은 같고 인자값의 갯수와 형식이 다르게 정의된 것
		
		int len = message.length();
		char temp = message.charAt(3);
		boolean isState = message.equals("Hello World");
		
		System.out.println("length() = " + len);
		System.out.println("charAt(3) = " + temp);
		System.out.println("equals(\"Hello World\") = " + isState);
		System.out.println("indexOf('e') = " + message.indexOf('e'));
		System.out.println("indexOf(\"lo\") = " + message.indexOf("lo"));
		System.out.println("indexOf(\"lo\") = " + message.indexOf("ol"));		//찾는 문자열이 없을 때 -1출력
		
		String test = "hi hi";
		System.out.println("test.indexOf(\"lo\") = " + test.indexOf("hi"));
		System.out.println("test.indexOf(\"lo\") = " + test.lastIndexOf("hi"));
		
		System.out.println("substring(2) = " + message.substring(2));
		System.out.println("substring(2,4) = " + message.substring(2,4));
		System.out.println("message.replace(\"ll\", \"*@\") = " + message.replace("ll", "*@"));//치환, 문자열 갯수 맞춰 변환 필수X
		System.out.println("message.startsWith(\"H\") = " + message.startsWith("H"));
		System.out.println("message.endsWith(\"d\") = " + message.endsWith("d"));
		
		//   "를 출력하고 싶을때는 \" 입력 -> 기호는 문자열시작으로 해석되기 때문
		
	}
}
//		message.length();				//public int length()
//		message.charAt(0);				//public char charAt(int index)
//		
//		message.equals("Hello World");	//public boolean equals(Object anObject), Object는 모든 타입
//										//message가 String 타입이므로 Object는 String으로 해석

//		message.indexOf('e');		//return 타입 형식 int
//		message.indexOf("lo");		//return 타입 형식 int
//		message.substring(2);		//return 타입 형식 String
//		message.substring(2,4);		//return 타입 형식 String
//		message.replace("ll", "*@");//return 타입 형식 String

