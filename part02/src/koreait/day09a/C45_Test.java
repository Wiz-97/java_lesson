package koreait.day09a;

import koreait.day09b.ClassAB;

public class C45_Test {

	public static void main(String[] args) {
		ClassAA test1 = new ClassAA();
		test1.ab = 123;
		test1.name = "김윤환";
		
		//ClassAA에서 ClassA로부터 상속받은 메소드
		test1.print();
		
		//ClassAA의 새로운 메소드
		test1.test();
		
		ClassAB test2 = new ClassAB();
		test2.test();
	}

}
