package koreait.day09a;

public class Crow extends Animal {//까마귀
	
	protected int wings;
	
	public Crow() {
		System.out.println("새로운 동물은 까마귀입니다.");
	}
	
	public void fly() {
		setName("까마귀");
		setColor("검정색");
		System.out.println("특징: 날기");
	}
}
