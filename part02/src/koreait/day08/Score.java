package koreait.day08;

public class Score {
	private int korean;
	private int english;
	private int science;
	private String grade;	//getter, setter 작성해보기
							//값 예시: A+, A, A-, B+, ...
	//기본생성자 숨어있음
//	public Score() {}
	
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
