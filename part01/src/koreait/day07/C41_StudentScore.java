package koreait.day07;

public class C41_StudentScore {

	public static void main(String[] args) {

		Student[] stus = new Student[5]; // �迭 ��� 10��
		String[] names = { "����ȯ", "�̰��", "������", "�Ż�", "�輺��" };

		stus[0] = new Student();
		stus[0].name = names[0];
		stus[0].no = 1;
		stus[0].grade = 2800;

		// for������ ������ 4�� ��ü�� �����ؼ� stus �迭��ҿ� ������Ű��
		for (int i = 1; i < stus.length; i++) {
			stus[i] = new Student();	//***�߿�*** ��ü�����ؼ� ������Ű��(�� �ҽ� ���� �߻�)
			stus[i].name = names[i];
			stus[i].no = i + 1;
			stus[i].grade = 2800;
		}
		//Ȯ���� ���� ���
		for (int i = 0; i < stus.length; i++) {
			System.out.println(stus[i]);
		}
		
		
		//�� ������ Student ��ü�� Score ��ü�� �ʵ�� ������ �Ѵ� => Score ��ü 3�� �ʵ尪 �Է� ����
		for (int i = 0; i<stus.length; i++) {
			System.out.println(stus[i].name + " ���� �Է��ϼ���.");
//			Score  temp = new Score();	//��ü ����(������Ű�� ����)
//			temp.input();
//			stus[i].score = temp;		//korean, english, science 3���� �ʵ尪 �ִ� ����
			
			stus[i].score = new Score();//temp ���� �Ȱ��� ����� ������
			stus[i].score.input();
			
			System.out.println(stus[i]);//Ȯ��
		}
		
		System.out.println("[[���� ���]]");
		System.out.printf("%4s %6s %8s %6s\n","no","name","sum","average");
		for(int i=0; i<stus.length;i++) {
			System.out.printf("%4d %6s %8d %6.1f\n",stus[i].no,stus[i].name,stus[i].score.sum(),
					stus[i].score.average());
		}
	}

}
