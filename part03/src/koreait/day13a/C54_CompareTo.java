package koreait.day13a;

public class C54_CompareTo {
	public static void main(String[] args) {
		//모든 객체(Object 상속)에는 compareTo 메소드가 존재: 값의 비교
		
		String me = "kim";
		String you = "lee";
		String he = "park";
		
		//String은 알파벳(사전식) 비교
		System.out.println("kim과 lee 비교: " + me.compareTo(you));	//-1(음수): "kim">"lee"
		System.out.println("kim과 park 비교: " + me.compareTo(he));	//-5(음수): "kim">"park"
		
		int a = 12, b = 45;
		System.out.println("a-b: " + (a-b));	//12-45<0 => 음수
		
		Integer aa=12;
		Integer bb=45;
		System.out.println("aa와 bb: " + aa.compareTo(bb));		//-1: aa<bb
		aa=90;
		System.out.println("90과 45: " + aa.compareTo(bb));		//1: aa>bb
		aa=45;
		System.out.println("45와 45: " + aa.compareTo(bb));		//0: aa==bb
		
		//compareTo와 같은 비교는 sort(정렬)에 사용
		//정렬은 오름차순, 내림차순 2가지 방법
		
	}
}
