package koreait.day11.test;

public class AShapeTest {
	public static void main(String[] args) {
		Triangle tri = new Triangle(100, 84);
		tri.shapeName = "삼각형";
		System.out.println(tri);
		System.out.println("넓이 = " + tri.getArea());
		
		Circle cir = new Circle();
		cir.shapeName = "원";
		cir.setRadius(89);
		System.out.println(cir);
		System.out.println("넓이 = " + cir.getArea());
	}
}//AShapeTest
/*
 * 참고: 메소드 재정의할때 접근한정자
 * 부모 public -> 자식 default: 오류
 * 부모 default -> 자식 public: 가능
 */

abstract class AShape { // 도형
	protected String shapeName;
	protected int width;
	protected int height;

	public AShape() {		//AShape 객체는 생성 불가
		System.out.println("AShape 기본생성자 동작중");
	}
	
	public AShape(int width, int height) {
		System.out.println("AShape 생성자 동작중");
		this.width = width;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "AShape [도형종류=" + shapeName + ", width=" + width
				+ ", height=" + height + "]";
	}	
	
	public abstract double getArea();
	
	
	//추상클래스도 인스턴스 메소드 정의해서 자식이 재정의 가능
	public Object explain() { //애플리케이션 완료 후 추상메소드 추가 오류 발생하므로 인스턴스 메소드 추가
		return null;
	}
	
	
}

class Triangle extends AShape {

	public Triangle(int width, int height) {
		super(width, height);
	}
	
	@Override
	public double getArea() {
		return width * height / 2;
	}

}

class Circle extends AShape {
	private int radius;			// 반지름
	
	@Override
	public String toString() {
		return "Circle [반지름=" + radius + ", 도형종류=" + shapeName + ", width=" + width
				+ ", height=" + height + "]";
	}	

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius * radius * 3.14;
	}
	
	
}

class Rectangle extends AShape {

	@Override
	public double getArea() {
		return width * height;
	}
}