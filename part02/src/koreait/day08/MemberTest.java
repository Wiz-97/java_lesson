package koreait.day08;

public class MemberTest {

	public static void main(String[] args) {
		Member Last = new Member();
		
		Member Calm = new Member("����ȯ", "brainzerg7@naver.com");
		System.out.println("Calm name = " + Calm.getName());
		Calm.setAge(34);
		System.out.println("Calm age = " + Calm.getAge());
		
		
	}

}
