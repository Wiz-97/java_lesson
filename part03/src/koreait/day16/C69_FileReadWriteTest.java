package koreait.day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//Exception 처리 명령이 별도 메소드에서 정의될 때 다른 방법: 
public class C69_FileReadWriteTest {
	//main 메소드가 throws Exception 한다면? ==>> jvm에게 넘김. 처리내용은 printStackTrace 결과와 동일
	public static void main(String[] args) {
		String filename = "C:\\iclass05\\자바테스트0617.txt";
		try {
			fileWrite2(filename);
//			filename = "C:\\iclass05\\자바테스트0617_2.txt";		//없는 파일 테스트용
			fileRead(filename);
		} catch (FileNotFoundException e) {
			System.out.println("사용자 실행 오류: " + e.getMessage());
			System.out.println("파일이 존재하는지 확인하세요");
		}
	}

	// 방법1: Exception을 try~catch로 직접 처리
	public static void fileWrite(String filename) {
		File file = new File(filename);
		
		PrintWriter pw = null;
		try {
		pw = new PrintWriter(file);	//file로 지정된 위치에 출력을 위한 객체
		pw.println("모모 90 89 92");
		pw.println("다현 89 90 82");
		pw.println("나연 82 89 90");
		System.out.println("파일 출력 완료");
		}catch(FileNotFoundException e) {
			System.out.println("사용자 오류 발생: " + e.getMessage());
		}finally {
			pw.close();
		}
	}

//방법2: throws 키워드는 해당 Exception 처리를 호출한 곳으로 넘긴다.(떠넘긴다)
//		throws 뒤에 ,로 구분해서 여러개를 지정 가능
	public static void fileWrite2(String filename) throws FileNotFoundException {
		File file = new File(filename);
		
		PrintWriter pw = null;
		pw = new PrintWriter(file);	//file로 지정된 위치에 출력을 위한 객체
		pw.println("윤환 90 89 92");
		pw.println("경민 89 90 82");
		pw.println("성균 82 89 90");
		System.out.println("파일 출력 완료.");
		pw.close();
	}

	
	
	public static void fileRead(String filename) throws FileNotFoundException{
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
}
/*
 * AutoClosable Interface try-with-resources 방식을 사용하려면 사용하는 객체가 AutoClosable
 * 인터페이스를 Implement해서 사용 가능해야 함 ==>> AutoClosable을 구현한 객체라면 try문이 종료될 때 close()
 * 구문을 호출해줌
 */
