package koreait.day13a;

import koreait.day12.Member;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class C55_ListSortTest {
	public static void main(String[] args) {
		//List�� �������̽�, ArrayList�� ����ü
		//������: List�� ����Ÿ������ ����. ������ ��� ���̺귯������ ListŸ�� ����
		List<Integer> ilist = new ArrayList<>();
		List<String> slist = new ArrayList<>();
		
		ilist.add(11);
		ilist.add(44);
		ilist.add(66);
		ilist.add(22);
		ilist.add(55);
		ilist.add(33);
		
		System.out.println("sort ����: " + ilist);
		//����: ��������
		ilist.sort(null);	//���ڷ� �ʿ��� ���� ���� Comparator ����ü
							//�⺻��, String�� null�� ����(�������� �⺻)
		System.out.println("sort ����: " + ilist);
		ilist.sort(Comparator.reverseOrder());		//reverse: ����, Comparator �������̽��� static �޼ҵ�
		System.out.println("�������� sort: " + ilist);
		
		slist.add("���ȣ");
		slist.add("�ڿϱ�");
		slist.add("�̽�ö");
		slist.add("������");
		slist.add("�ΰ���");
		slist.add("����ȣ");
		slist.add("Ȳġ��");
		slist.add("������");
		slist.add("����Ź");
		
		System.out.println("sort ����: " + slist);
		slist.sort(null);
		System.out.println("sort ����(ASCEnding): " + slist);
		slist.sort(Comparator.reverseOrder());
		System.out.println("�������� sort(DESCending): " + slist);
		
		List<Member> mlist = new ArrayList<>();
		
		mlist.add(new Member("YH", 34));
		mlist.add(new Member("KM", 31));
		mlist.add(new Member("CR", 22));
		mlist.add(new Member("AZ", 26));
		mlist.add(new Member("SW", 38));
		mlist.add(new Member("RA", 26));
		
		System.out.println("member ����Ʈ ����: " + mlist);
//		mlist.sort(null);		//����: Member ��ü�� ���� �� ���� ��ü(null�� �⺻��, String�� ����) -> ���� �������̽��� ���ڷ� �ؾ���
		
		mlist.sort(new MemberAgeAscending());
		System.out.println("memberAge sort Ȯ��(ASC): " + mlist);
		mlist.sort(new MemberAgeDescending());
		System.out.println("memberAge sort Ȯ��(DESC): " + mlist);
		
		mlist.sort(new MemberNameAscending());
		System.out.println("memberName sort Ȯ��(ASC)" + mlist);
		mlist.sort(new MemberNameDescending());
		System.out.println("memberName sort Ȯ��(DESC)" + mlist);
		
		System.out.println("\n2. Comparable �������̽� ����ϴ� sort");
		List<User> ulist = new ArrayList<User>();
		ulist.add(new User("��ȯ",34));
		ulist.add(new User("����",33));
		ulist.add(new User("����",35));
		ulist.add(new User("���",38));
		ulist.add(new User("����",29));
		ulist.add(new User("��",30));
		
		System.out.println("user ����Ʈ ����: " + ulist);
		//User�� ���� �� �ִ� Ÿ���� �Ǿ��� => Comparable ����ü ����
		ulist.sort(null);
		System.out.println("user sort(ASC): " + ulist);
		ulist.sort(Comparator.reverseOrder());
		System.out.println("user sort(DESC): " + ulist);
		
		
		//��ü�� ���� �� ������ ���·� ������� ���� User�̴�.
		//�񱳱��� ����� ����� sort�� �����Ų ���� ���� Member.
		
		ulist.sort(new Comparator<User>(){
			@Override
			public int compare(User o1, User o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});	//�޼ҵ� ���ڷ� �͸�Ŭ������ �����ؼ� ��ü ����
		
		System.out.println("user sort(name ASC): " + ulist);
		
		
		
		
		
		
	}
}
