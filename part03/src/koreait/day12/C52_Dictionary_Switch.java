package koreait.day12;

import java.util.HashMap;
import java.util.Scanner;

public class C52_Dictionary_Switch {
	public static void main(String[] args) {
		//작성자 이훈복
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> dictionary = new HashMap<String, String>();
		boolean c = true;
		while (c) {
			System.out.println("--------------선택 기능-------------");
			System.out.println("1.단어저장 2. 단어검색 3. 단어장보기 4. 프로그램 끝내기");
			System.out.print("선택>>");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("대응되는 단어를 입력해주세요");
				System.out.print("English -> ");
				sc.nextLine();
				String english = sc.nextLine();
				System.out.print("Korean  -> ");
				String korean = sc.nextLine();
				dictionary.put(english, korean);
				break;
			case 2:
				System.out.println("찾으려는 영단어를 입력하세요.");
				System.out.print("English -> ");
				sc.nextLine();
				String find = sc.nextLine();
				System.out.println("검색 결과: " + dictionary.get(find));
				break;
			case 3:
				System.out.println("단어장 전체보기: " + dictionary);
				break;
			case 4:
				c=false;
				break;
			default:
				System.out.println("유효한 번호를 입력하세요.");
				break;
			}
		}
	}

}
