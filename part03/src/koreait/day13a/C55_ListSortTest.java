package koreait.day13a;

import koreait.day12.Member;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class C55_ListSortTest {
	public static void main(String[] args) {
		//List는 인터페이스, ArrayList는 구현체
		//다형성: List를 참조타입으로 선언. 앞으로 배울 라이브러리들이 List타입 원함
		List<Integer> ilist = new ArrayList<>();
		List<String> slist = new ArrayList<>();
		
		ilist.add(11);
		ilist.add(44);
		ilist.add(66);
		ilist.add(22);
		ilist.add(55);
		ilist.add(33);
		
		System.out.println("sort 이전: " + ilist);
		//정렬: 오름차순
		ilist.sort(null);	//인자로 필요한 것은 비교자 Comparator 구현체
							//기본형, String은 null로 가능(오름차순 기본)
		System.out.println("sort 이후: " + ilist);
		ilist.sort(Comparator.reverseOrder());		//reverse: 역순, Comparator 인터페이스의 static 메소드
		System.out.println("내림차순 sort: " + ilist);
		
		slist.add("김경호");
		slist.add("박완규");
		slist.add("이승철");
		slist.add("윤도현");
		slist.add("민경훈");
		slist.add("김진호");
		slist.add("황치열");
		slist.add("나윤권");
		slist.add("서문탁");
		
		System.out.println("sort 이전: " + slist);
		slist.sort(null);
		System.out.println("sort 이후(ASCEnding): " + slist);
		slist.sort(Comparator.reverseOrder());
		System.out.println("내림차순 sort(DESCending): " + slist);
		
		List<Member> mlist = new ArrayList<>();
		
		mlist.add(new Member("YH", 34));
		mlist.add(new Member("KM", 31));
		mlist.add(new Member("CR", 22));
		mlist.add(new Member("AZ", 26));
		mlist.add(new Member("SW", 38));
		mlist.add(new Member("RA", 26));
		
		System.out.println("member 리스트 상태: " + mlist);
//		mlist.sort(null);		//오류: Member 객체는 비교할 수 없는 객체(null은 기본형, String만 가능) -> 비교자 인터페이스를 인자로 해야함
		
		mlist.sort(new MemberAgeAscending());
		System.out.println("memberAge sort 확인(ASC): " + mlist);
		mlist.sort(new MemberAgeDescending());
		System.out.println("memberAge sort 확인(DESC): " + mlist);
		
		mlist.sort(new MemberNameAscending());
		System.out.println("memberName sort 확인(ASC)" + mlist);
		mlist.sort(new MemberNameDescending());
		System.out.println("memberName sort 확인(DESC)" + mlist);
		
		System.out.println("\n2. Comparable 인터페이스 사용하는 sort");
		List<User> ulist = new ArrayList<User>();
		ulist.add(new User("윤환",34));
		ulist.add(new User("제동",33));
		ulist.add(new User("성은",35));
		ulist.add(new User("상욱",38));
		ulist.add(new User("현제",29));
		ulist.add(new User("란",30));
		
		System.out.println("user 리스트 상태: " + ulist);
		//User는 비교할 수 있는 타입이 되었음 => Comparable 구현체 때문
		ulist.sort(null);
		System.out.println("user sort(ASC): " + ulist);
		ulist.sort(Comparator.reverseOrder());
		System.out.println("user sort(DESC): " + ulist);
		
		
		//객체를 직접 비교 가능한 상태로 만든것이 위의 User이다.
		//비교기준 내용과 방법을 sort에 적용시킨 것이 위의 Member.
		
		ulist.sort(new Comparator<User>(){
			@Override
			public int compare(User o1, User o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});	//메소드 인자로 익명클래스를 정의해서 객체 생성
		
		System.out.println("user sort(name ASC): " + ulist);
		
		
		
		
		
		
	}
}
