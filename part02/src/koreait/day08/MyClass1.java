package koreait.day08;

public class MyClass1 {

	private int age; // �ڹ��� Ư��: ���м�(��м�)�� Ŭ������ �ʵ尪�� �ٸ� Ŭ������ ���� ���� ���ϵ��� ��(ĸ��ȭ)
	String name;
	public double point;

	void setAge(int age) {
		if (age > 1 && age <= 150) {	//age �ʵ尪�� �˻�
			this.age = age; // age�ʵ�� ���� Ŭ���������� ����.
		} else {
			System.out.println("�߸��� ���Դϴ�.");
		}
	}

	int getAge() {
		return age;
	}
	
	
}
/*
 * private int age; //private: �ٸ� Ŭ�������� ��� �Ұ�. ���� ��� ���� String name;
 * //default(package): �ٸ� ��Ű������ ��� ����. �̿��̸� ���� ��� public int score; //public:
 * ��𼭳� ��� ����
 * 
 * private, default, protected(���), public�� ����(�ʵ�), �޼ҵ�, ������, Ŭ���� � ���Ǵ�
 * ����������(Ŭ������ ���������� default, public�� ���)
 */
