package koreait.day16;

import java.util.Scanner;

public class C70_MyExceptionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력>>>");
		try {
			int age = Integer.parseInt(sc.nextLine());
			if (age < 0 || age > 100)
				throw new AgeException("나이의 범위는 0에서 100입니다.");
			// throw new Exception("나이의 범위는 0~100입니다."); //메시지만 바꿀때
			// throw는 지정된 Exception을 발생시킴

			if (age == 0)
				throw new NullPointerException();

			System.out.println("당신의 나이는 " + age + "세 맞습니까?");

		} catch (NumberFormatException e) {
			System.out.println("나이 입력은 숫자로만 하세요");
		} catch (Exception e) {
			System.out.println("사용자 실행 오류: " + e.getMessage());
		} finally {
			sc.close();
		}
	}
}

//사용자 Exception을 만든다: Exception 상속
class AgeException extends Exception {
	// Serializable 인터페이스와 관련된 값
	private static final long serialVersionUID = 1L;

	// 사용자가 임의로 메시지 지정 가능
	public AgeException(String message) {
		super(message); // Exception 클래스의 message 필드 설정
	}
}