package koreait.day07;

public class Singer {
//C37 ��ȣ ����
	/*
	 * Ŭ���� ���� �ϴ� ���� ���Ǽ����� �����͸� ó���ϱ� ���� ������ ����
	 */
	
	
	
	String genre;		//�帣
	String name_eng;	//�����̸�
	String name_kor;	//�ѱ��̸�
	int debut_year;		//���߳⵵
	String[] members;		//�׷��� ��� ��� �̸��� ����
	
	static final String JOB = "������";
	static String label="����";		//Singer���Դ� ��� ������ �� ǥ��
	
	void printMembers() {
		if(members==null) {
			System.out.println("�׷��� �ƴ� �ַ� �����Դϴ�.");
		}else
			for(int i=0; i<members.length; i++) {
				if(members[i] != null) {
					System.out.println((i+1) + ":" + members[i]);
				}
			}
	}
	
	int actYears(int year) {	//year ���� Ȱ���Ⱓ ���
		return year - debut_year+1;
	}
	
	@Override
	public String toString() {
		return "Singer [genre = " + genre + ", name_eng = " + name_eng + ", name_kor = " + name_kor + ", debut_year = " + debut_year + "]";
	}
}
