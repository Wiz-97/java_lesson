package koreait.day07;

public class C36_C35Test {
//C35 클래스를 1)객체로 만들어서 2)static 인 것들 테스트
	// (참고: main메소드를 갖는 클래스를 객체로 만들지 않는 것이 일반적
	public static void main(String[] args) {
		
		//test1, test2는 참조형 변수
		C35_GlobalVar test1 = new C35_GlobalVar();		//C35 클래스 타입의 객체를 생성
		C35_GlobalVar test2 = new C35_GlobalVar();		//C35 클래스 타입의 객체를 생성
		
		//C35클래스에서 static이 아닌 인스턴스 변수에는 객체마다 다른 값 저장 -> 객체 각각 다른 특성
		test1.count = 10;
		test2.count = 20;
		
		test1.message = "hi test1";
		test2.message = "hello test2";
		
		test1.methodA();
		test2.methodA();
		
		test1.methodC(14);		//this.count에서 this는 test1
		test2.methodC(99);		//this.count에서 this는 test2
		
		System.out.println("test1.count = " + test1.count);
		System.out.println("test2.count = " + test2.count);
		
		//static 요소 테스트: static 변수 또는 메소드 는 클래스 이름으로 사용
		
		C35_GlobalVar.num = 101;
		System.out.println("static num = " + C35_GlobalVar.num);
		System.out.println("static num = " + test1.num);//static으로 접근하라는 경고문구 발생
		System.out.println("static num = " + test2.num);
		
		//static이 저장되는 메모리 영역(메소드 영역)과 객체가 저장되는 메모리 영역(힙 영역)이 다름
		
		System.out.println("TEST = " + C35_GlobalVar.TEST);
		//C35_GlobalVar.TEST = 100; //오류: final은 값 변경 불가
		
		C35_GlobalVar test3 = new C35_GlobalVar();
			//기본 변수값 확인하기
		System.out.println("test3.count = " + test3.count);
		System.out.println("test3.message = " + test3.message);
		System.out.println("C35_GlobalVar.num = " + C35_GlobalVar.num);
	}
}
