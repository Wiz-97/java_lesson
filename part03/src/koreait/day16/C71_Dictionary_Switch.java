package koreait.day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C71_Dictionary_Switch {
	public static void main(String[] args) {
		// 작성자 이훈복
		Scanner sc = new Scanner(System.in);
		Scanner ssc = new Scanner(System.in);
		List<Word> myWord = new ArrayList<>(); // myWord는 Word 타입의 객체를 Index에 담고있는 배열(ArrayList)
		try {
			System.out.print("파일에서 읽어 올까요? (y or n) >>>");
			if (ssc.nextLine().equals("y")) {
				read(myWord, "C:\\iclass05\\나의영한사전.txt");
			} else {
				System.out.println("파일을 새로 만듭니다.");
			}
		} catch (FileNotFoundException e1) {
			System.out.println("파일 읽는 중에 오류 발생" + e1.getMessage());
		} // 파일에서 기존 내용 읽어오고 그 내용을 myWord리스트에 저장
			// TreepMap을 List로 바꿔서 구현해보기
		boolean c = true;
		String choice, english, korean;
		int lvl;
		while (c) {
			System.out.println("--------------선택 기능-------------");
			System.out.println("1.단어저장 2. 단어검색 3. 단어장보기 4. 레벨로검색 5. 프로그램 끝내기");
			System.out.print("선택>>");
			choice = sc.nextLine();
			switch (choice) {
			case "1":
				System.out.println("대응되는 단어를 입력해주세요");
				System.out.print("English -> ");
				english = sc.nextLine();
				System.out.print("Korean  -> ");
				korean = sc.nextLine();
				System.out.print("Level  -> ");
				lvl = Integer.parseInt(sc.nextLine());
				myWord.add(new Word(english, korean, lvl));
				break;
			case "2":
				System.out.println("찾으려는 영단어를 입력하세요.");
				System.out.print("English -> ");
				english = sc.nextLine();
				for (Word w : myWord) {
					if (w.getEnglish().equals(english)) {
						System.out.println("검색 결과: " + w);
					}
				}
				break;
			case "3":
//				System.out.println("단어장 전체보기: " + myWord);
				all(myWord);
				break;
			case "4":
				System.out.print("검색할 레벨 입력(1~3)>>>");
				int no = Integer.parseInt(sc.nextLine());
				level(myWord, no);
				break;
			case "5":
				c = false;
				break;
			default:
				System.out.println("유효한 번호를 입력하세요.");
				break;
			}
		} // while end

		try {
			save(myWord, "C:\\iclass05\\나의영한사전.txt");
		} catch (FileNotFoundException e) {
			System.out.println("파일 저장 중 오류 발생: " + e.getMessage());
		} // myWord리스트 내용을 파일에 저장

		System.out.println(":::::단어장 종료:::::");
		sc.close();
	}

	private static void read(List<Word> myWord, String filename) throws FileNotFoundException {
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		StringTokenizer stk = null;
		while (sc.hasNext()) {
			String temp = sc.nextLine(); // 파일에서 1줄 읽어온 것 저장
			System.out.println(temp.substring(0, temp.indexOf("("))); // 객체 만들 때 필요한 값만 가져오기
			// 위의 결과를 참고로 StringTokenizer로 Word 객체 만들고 myWord 리스트에 추가하기
			stk = new StringTokenizer(temp.substring(0, temp.indexOf("(")));
			myWord.add(new Word(stk.nextToken(), // english 필드값
					stk.nextToken(), // korean 필드값
					Integer.parseInt(stk.nextToken()))); // level 필드값
		}
		sc.close();
		System.out.println("파일 읽어오기 완료");
	}

	private static void save(List<Word> myWord, String filename) throws FileNotFoundException {
		File file = new File(filename);
		PrintWriter pw = new PrintWriter(file);
		for (Word w : myWord) {
			pw.println(w);
		}

		pw.close();
		System.out.println("파일 저장 완료");
	}

	private static void level(List<Word> myWord, int no) {
		for (Word w : myWord) {
			if (w.getLevel() == no) {
				System.out.println(w);
			}
		}
	}

	private static void all(List<Word> myWord) { // myWord의 참조값 전달받아 동일한 객체 가리킴
		myWord.sort(new Comparator<Word>() {

			@Override
			public int compare(Word o1, Word o2) {
				return o1.getEnglish().compareTo(o2.getEnglish());
			}
		});

		System.out.println(String.format("%-20s %-20s %10s", "english", "korean", "level"));
		System.out.println("=====================================================");
		for (Word w : myWord) {
			System.out.println(String.format("%-20s %-20s %10s", w.getEnglish(), w.getKorean(), w.getLevel()));
		}

	}
}
