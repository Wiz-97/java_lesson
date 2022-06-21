package koreait.day07;

public class C35_GlobalVar {
	/* [변수가 선언된 위치로 구분]
	 * 지역변수(Local Variable): 메소드, for, if, while 등의 {}내에서 선언된 변수. 블록을 벗어나면 변수 사용 불가능
	 * 전역변수(Global Variable): 클래스의 {}에서 선언된 변수
	 * 
	 * [전역변수를 static 여부로 구분]
	 * [클래스이름.변수명]
	 * 객체를 만들어서 사용하는 [this.변수명] => 인스턴스 필드
	 * 
	 * 전역변수는 클래스 또는 객체의 특성을 나타낼 때 필드(또는 프로퍼티(property))라고 부른다.
	 */
	
	
	int count;		//전역변수
	String message;
	static int num;
	static final int TEST = 9999;		//static final = 상수(고정된 숫자, 변경 불가). 선언할 때 초기화 하지 않으면 오류 발생
	
	public static void main(String[] args) {	//static은 static 끼리만 접근
		int num = 10;	//main 메소드에서만 사용 가능
		System.out.println("num=" + num);
		methodB();
//		System.out.println("message=" + message);	//오류: static이 아닌 변수는 사용 불가
	}
	
	public void methodA() {
		int num = 99;		//methodA에서만 사용 가능
		System.out.println("num=" + num);
		System.out.println("message=" + message);	//전역변수로 선언된 message
	}
	
	public static void methodB() {
		int num = 77;	//methodB에서만 적용
		//지역변수와 전역변수 이름이 같은 경우, 지역변수를 가져온다
		System.out.println("num=" + num);	//77
		System.out.println("num=" + C35_GlobalVar.num);		//Integer.BYTES와 같은 형태
		//전역 변수로 선언된 num. static일 때는 클래스이름.변수명 이고 static이 아닐 때는 this.변수명
	}
	
	//******** 앞으로 많이 쓸 유형의 메소드
	public void methodC(int count) {
		this.count=count;		//this는 new로 만들어진 객체. ==> methodC를 실행시키는 객체
	}
}
