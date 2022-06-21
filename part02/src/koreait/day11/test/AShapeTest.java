package koreait.day11.test;

public class AShapeTest {
	public static void main(String[] args) {
		Triangle tri = new Triangle(100, 84);
		tri.shapeName = "�ﰢ��";
		System.out.println(tri);
		System.out.println("���� = " + tri.getArea());
		
		Circle cir = new Circle();
		cir.shapeName = "��";
		cir.setRadius(89);
		System.out.println(cir);
		System.out.println("���� = " + cir.getArea());
	}
}//AShapeTest
/*
 * ����: �޼ҵ� �������Ҷ� ����������
 * �θ� public -> �ڽ� default: ����
 * �θ� default -> �ڽ� public: ����
 */

abstract class AShape { // ����
	protected String shapeName;
	protected int width;
	protected int height;

	public AShape() {		//AShape ��ü�� ���� �Ұ�
		System.out.println("AShape �⺻������ ������");
	}
	
	public AShape(int width, int height) {
		System.out.println("AShape ������ ������");
		this.width = width;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "AShape [��������=" + shapeName + ", width=" + width
				+ ", height=" + height + "]";
	}	
	
	public abstract double getArea();
	
	
	//�߻�Ŭ������ �ν��Ͻ� �޼ҵ� �����ؼ� �ڽ��� ������ ����
	public Object explain() { //���ø����̼� �Ϸ� �� �߻�޼ҵ� �߰� ���� �߻��ϹǷ� �ν��Ͻ� �޼ҵ� �߰�
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
	private int radius;			// ������
	
	@Override
	public String toString() {
		return "Circle [������=" + radius + ", ��������=" + shapeName + ", width=" + width
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