package koreait.ext;

import java.util.UUID;

public class UUIDTest {
	public static void main(String[] args) {
		String uuid;
		// 16진수 32자리 + 하이픈 기호 4개로 만들어지는 랜덤문자열
		for (int i = 0; i < 10; i++) {
			uuid = UUID.randomUUID().toString();
			System.out.println(uuid);
		}
		for (int i = 0; i < 10; i++) {
			uuid = UUID.randomUUID().toString();
			System.out.println((uuid.replace("-", "")));
		}

		for (int i = 0; i < 10; i++) {
			uuid = UUID.randomUUID().toString();
			System.out.println(uuid.replace("-", "").substring(0, 12));
		}
		
		/* git 토큰값: 토큰인증
		 * 웹사이트에서 회원가입시 비밀번호를 설정함.(패스워드 인증) 비밀번호는 어떻게 관리하는가?
		 * -> 해싱함수(복호화가 안되는 함수)를 이용해서 문자열에 대한 식별값 저장
		 * -> 비밀번호 1234에 대한 해싱함수 값 저장. 로그인 1234
		 * -> 대표적인 해시함수 sha256 알고리즘(자바에서 직접구현 MessageDigest 클래스 사용)
		 * 
		 * 
		 * 암호화: 평문 -> 암호문, 복호화: 암호문 -> 평문		(공개키와 개인키를 이용)
		 * 
		 * 
		 */
	}
}
