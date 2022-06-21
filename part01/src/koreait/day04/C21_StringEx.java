package koreait.day04;

import java.util.Scanner;

public class C21_StringEx {
	public static void main(String[] args) {
		// 작성자 이훈복
		Scanner sc = new Scanner(System.in);
		boolean isValid = true;

		System.out.print("이메일 계정을 입력하세요>>>");
		String email = sc.nextLine();

		if (email.indexOf("@") != -1 && email.indexOf("@") == email.lastIndexOf("@")) {
			int check1 = email.indexOf("@") + 1;
			String domain = email.substring(check1, (email.length()));
			
			if (domain.equals("gmail.com")) {
				String account = email.substring(0, email.indexOf("@"));//앞부분 추출
				System.out.println("@ 앞부분: " + account);
				if (account.length() >= 6) {
					System.out.println("6글자 이상의 계정입니다.");
					
					if((account.indexOf("$") == -1) && (account.indexOf("%") == -1)){
						System.out.println("구글계정이 확인되었습니다.");
					}else {
						System.out.println("계정이름에 $ 혹은 %가 포함되면 안됩니다.");
						isValid = false;
					}
				} else {
					System.out.println("계정이름의 글자수가 부족합니다.(6글자 이상 필요)");
					isValid = false;
				}
			} else {
				System.out.println("도메인 형식이 틀립니다.");
				isValid = false;
			}
		} else {
			System.out.println("이메일 형식이 아닙니다.");
			isValid = false;
		}
		
		sc.close();


		/*
		 * 구글 이메일 계정을 체크하는 기능 구현
		 * 1. @ 기호가 1개 포함
		 * 2. 1이 참일때 @ 뒤에는 gmail.com
		 * 3. 2가 참일때 @ 앞까지의 문자열 추출
		 * 4. 3의 계정이름은 6글자 이상
		 * 5. 계정 이름에는 특수기호($,%)가 포함되면 안됨
		 * 
		 */

	}
}
