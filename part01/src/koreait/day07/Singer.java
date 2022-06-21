package koreait.day07;

public class Singer {
//C37 번호 생략
	/*
	 * 클래스 정의 하는 것은 현실세계의 데이터를 처리하기 위한 형식을 지정
	 */
	
	
	
	String genre;		//장르
	String name_eng;	//영어이름
	String name_kor;	//한국이름
	int debut_year;		//데뷔년도
	String[] members;		//그룹일 경우 멤버 이름들 저장
	
	static final String JOB = "연예인";
	static String label="가수";		//Singer에게는 모두 동일한 라벨 표시
	
	void printMembers() {
		if(members==null) {
			System.out.println("그룹이 아닌 솔로 가수입니다.");
		}else
			for(int i=0; i<members.length; i++) {
				if(members[i] != null) {
					System.out.println((i+1) + ":" + members[i]);
				}
			}
	}
	
	int actYears(int year) {	//year 기준 활동기간 계산
		return year - debut_year+1;
	}
	
	@Override
	public String toString() {
		return "Singer [genre = " + genre + ", name_eng = " + name_eng + ", name_kor = " + name_kor + ", debut_year = " + debut_year + "]";
	}
}
