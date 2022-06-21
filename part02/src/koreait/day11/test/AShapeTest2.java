package koreait.day11.test;

public class AShapeTest2 {

	// 익명 클래스

	public static void main(String[] args) {
		
		//마름모꼴
		//이름 내부(Inner) 클래스 정의. 1회용 클래스
		AShape sha = new AShape() {
			//추상메소드 재정의
			@Override
			public double getArea() {
				return width+height;
			}
			
		};		
		AShape sha2 = new AShape(4,7) {
			@Override
			public double getArea() {
				return width+height;
			}
		};
		System.out.println("sha 넓이=" + sha.getArea());
		System.out.println("sha2 넓이=" + sha2.getArea());
		
		
	}

}
