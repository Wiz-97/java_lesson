package koreait.day09a;

public class Dog extends Animal {
	
	protected int legs;	//디폴트 한정자 + 다른 패키지 자식 클래스
	
	public Dog() {
		System.out.println("새로운 동물은 강아지입니다.");
	}
	
	public void run() {
		setName("강아지");
		setColor("갈색");
		System.out.println("특징: 달리기");
	}
	
	
}
