package koreait.day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C68_FileReadTest {
	public static void main(String[] args) {
		String filename = "C:\\iclass05\\text.txt";
		File file = new File(filename);
		
		try(Scanner sc = new Scanner(file)){
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			System.out.println("파일 읽기 완료");
		}catch(FileNotFoundException e){
			e.printStackTrace();
			System.out.println("사용자 오류 발생: " + e.getMessage());
		}
	}
}
/*
 * AutoClosable Interface
 * try-with-resources 방식을 사용하려면 사용하는 객체가 AutoClosable 인터페이스를
 * Implement해서 사용 가능해야 함
 * ==>> AutoClosable을 구현한 객체라면 try문이 종료될 때 close() 구문을 호출해줌
 */