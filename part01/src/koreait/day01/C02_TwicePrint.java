package koreait.day01;

public class C02_TwicePrint {
public static void main(String[] args) {
	System.out.println("Ʈ���̽�");
	System.out.println("�̸�\t�������\t\t����");// \t�� tab�� ���������
	System.out.println("------------------------------");
	System.out.println("�糪\t1996.12.29\t26");
	System.out.println("��ȿ\t1997.02.01\t25");
	System.out.println("�̳�\t1998.03.24\t24");
	System.out.printf("%-12s%s%5d\n","dahyeon","1998.05.28",24);// %s:���ڿ�, %d:����
	System.out.printf("%-12s%s%5d\n","momo","1999.04.23",23);
	System.out.printf("%-12s%s%5d\n","nayeon","1995.09.22",27);
	//%s�� ������ ĭ���� �����ʸ���. -��ȣ�� ���̸� �������� ������
	//printf �޼ҵ忡�� ���Ĺ��ڿ� �ڿ� ������ ������ ������ ������ ��ġ�ؾ���
	//ex) "%-12s%s%5d\n"�� ��� %s, %s, %d�� 3���̹Ƿ� �ļ� ������ 3���� �ʼ�
	System.out.printf("%-12s%5d\n","unknown",27);
	
	
	//����:System.out.printf("%-12s%s%5d\n","dahyeon","1998.05.28",24);
	//���� ���Ŀ��� ��������� ������������ �ٲ� ����غ���
	System.out.printf("%-12s %4d.%02d.%2d %5d\n","dahyeon",1998,5,28,24);
	System.out.printf("%-12s %4d.%02d.%2d %5d\n","momo",1999,4,23,23);
	System.out.printf("%-12s %4d.%02d.%2d %5d\n","nayeon",1995,9,22,27);
	
	//���� ���� : ���� ���
	//System.out.printf("%-12s %4d.%02d.%2d %5d\n",name,year,month,day,age);
}
}