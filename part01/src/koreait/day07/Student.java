package koreait.day07;

//C39  번호생략
public class Student {

	int no;
	String name;
	int grade;
	Score score; // 다른 클래스 객체를 필드(구성요소)로 갖게 됩니다.

	void setData(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", grade=" + grade + ", score=" + score + "]";
	}

}
