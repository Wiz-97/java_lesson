package koreait.day11.test;

public class AShapeTest2 {

	// �͸� Ŭ����

	public static void main(String[] args) {
		
		//�������
		//�̸� ����(Inner) Ŭ���� ����. 1ȸ�� Ŭ����
		AShape sha = new AShape() {
			//�߻�޼ҵ� ������
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
		System.out.println("sha ����=" + sha.getArea());
		System.out.println("sha2 ����=" + sha2.getArea());
		
		
	}

}
