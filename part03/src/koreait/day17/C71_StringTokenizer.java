package koreait.day17;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class C71_StringTokenizer {
	//token: 표식(최소단위)
	//tokenizer: 토큰화(최소단위의 표식으로 만들기. 구분기호 필요)
	public static void main(String[] args) {
		
		String temp = "모모 90 88 79";
		
		//토큰화: StringTokenizer 클래스의 기능 사용
		StringTokenizer stk = new StringTokenizer(temp);
		System.out.println("1. nextToken 메소드");
		System.out.println(stk.nextToken());
		System.out.println(stk.nextToken());
		System.out.println(stk.nextToken());
		System.out.println(stk.nextToken());
		System.out.println("has more Tokens?: " + stk.hasMoreTokens());
		//"모모 90 88 79"
		//			  ↑(토크나이저의 포인터, nextToken 메소드 후 위치 이동)
		
		
		
		System.out.println("2. 반복문에서 hasMoreTokens 메소드");
		stk = new StringTokenizer(temp);		//토크나이저 객체 다시 생성
		while(stk.hasMoreTokens()) {			//다음에 읽어올 토큰이 있으면 실행
			System.out.println(stk.nextToken());
		}
		
		
		System.out.println("3. 여러가지 구분기호 사용하기");		//empty는 만들지 않음(split과의 차이점)
		temp = "모모,90 88()79";
		stk = new StringTokenizer(temp, " ,()");	//두번째 인자는 delimiter: 구분기호 문자를 나열(정규식X)
		while(stk.hasMoreTokens()){
			System.out.println(stk.nextToken());
		}
		
		System.out.println("4. 토큰화 데이터로 객체 만들기");
		temp = "모모 90 88 79";
		stk = new StringTokenizer(temp);
		Score score = null;
		while(stk.hasMoreTokens()) {
			score = new Score(stk.nextToken(),
					Integer.parseInt(stk.nextToken()),
					Integer.parseInt(stk.nextToken()),
					Integer.parseInt(stk.nextToken()));
		}
		
		System.out.println("생성된 Score 객체: " + score);
		System.out.println("총점: " + score.sum());
		System.out.println("평균: " + score.average());
		System.out.println("학점: " + score.getGrade());
		
		//List로 만들기
		temp = "모모 90 88 79\n나나 78 83 79\n신비 92 73 66";
		stk = new StringTokenizer(temp);
		List<Score> scores = new ArrayList<>();
		while(stk.hasMoreElements()) {
			score = new Score(stk.nextToken(),
					Integer.parseInt(stk.nextToken()),
					Integer.parseInt(stk.nextToken()),
					Integer.parseInt(stk.nextToken()));
				scores.add(score);
		}
		System.out.println("토크나이저 결과: " + scores);
		
		scores.clear();				//리스트의 모든 요소 삭제
		
		//split 메소드는 어떻게 객체로 만들 수 있을까?
		String[] result = temp.split("[ \n]");
		for(int i=0;i<result.length;i+=4) {
			Score s = new Score(result[i+0],
					Integer.parseInt(result[i+1]),
					Integer.parseInt(result[i+2]),
					Integer.parseInt(result[i+3]));
			scores.add(s);
		}
		
		
	}
}
