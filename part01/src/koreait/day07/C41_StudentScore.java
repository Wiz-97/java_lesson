package koreait.day07;

public class C41_StudentScore {

	public static void main(String[] args) {

		Student[] stus = new Student[5]; // 배열 요소 10개
		String[] names = { "김윤환", "이경민", "이제동", "신상문", "김성대" };

		stus[0] = new Student();
		stus[0].name = names[0];
		stus[0].no = 1;
		stus[0].grade = 2800;

		// for문으로 나머지 4개 개체를 생성해서 stus 배열요소에 참조시키기
		for (int i = 1; i < stus.length; i++) {
			stus[i] = new Student();	//***중요*** 객체생성해서 참조시키기(안 할시 오류 발생)
			stus[i].name = names[i];
			stus[i].no = i + 1;
			stus[i].grade = 2800;
		}
		//확인을 위한 출력
		for (int i = 0; i < stus.length; i++) {
			System.out.println(stus[i]);
		}
		
		
		//각 생성된 Student 객체가 Score 객체를 필드로 갖도록 한다 => Score 객체 3개 필드값 입력 실행
		for (int i = 0; i<stus.length; i++) {
			System.out.println(stus[i].name + " 점수 입력하세요.");
//			Score  temp = new Score();	//객체 생성(참조시키기 위함)
//			temp.input();
//			stus[i].score = temp;		//korean, english, science 3개의 필드값 있는 상태
			
			stus[i].score = new Score();//temp 없이 똑같은 결과값 만들어보기
			stus[i].score.input();
			
			System.out.println(stus[i]);//확인
		}
		
		System.out.println("[[성적 통계]]");
		System.out.printf("%4s %6s %8s %6s\n","no","name","sum","average");
		for(int i=0; i<stus.length;i++) {
			System.out.printf("%4d %6s %8d %6.1f\n",stus[i].no,stus[i].name,stus[i].score.sum(),
					stus[i].score.average());
		}
	}

}
