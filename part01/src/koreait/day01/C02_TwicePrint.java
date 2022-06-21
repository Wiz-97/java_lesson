package koreait.day01;

public class C02_TwicePrint {
public static void main(String[] args) {
	System.out.println("트와이스");
	System.out.println("이름\t생년월일\t\t나이");// \t는 tab을 실행시켜줌
	System.out.println("------------------------------");
	System.out.println("사나\t1996.12.29\t26");
	System.out.println("지효\t1997.02.01\t25");
	System.out.println("미나\t1998.03.24\t24");
	System.out.printf("%-12s%s%5d\n","dahyeon","1998.05.28",24);// %s:문자열, %d:정수
	System.out.printf("%-12s%s%5d\n","momo","1999.04.23",23);
	System.out.printf("%-12s%s%5d\n","nayeon","1995.09.22",27);
	//%s는 지정된 칸에서 오른쪽맞춤. -기호를 붙이면 왼쪽으로 맞춰짐
	//printf 메소드에서 형식문자와 뒤에 나오는 데이터 형식의 개수가 일치해야함
	//ex) "%-12s%s%5d\n"의 경우 %s, %s, %d로 3개이므로 후속 데이터 3개가 필수
	System.out.printf("%-12s%5d\n","unknown",27);
	
	
	//연습:System.out.printf("%-12s%s%5d\n","dahyeon","1998.05.28",24);
	//위의 형식에서 생년월일을 정수형식으로 바꿔 출력해보기
	System.out.printf("%-12s %4d.%02d.%2d %5d\n","dahyeon",1998,5,28,24);
	System.out.printf("%-12s %4d.%02d.%2d %5d\n","momo",1999,4,23,23);
	System.out.printf("%-12s %4d.%02d.%2d %5d\n","nayeon",1995,9,22,27);
	
	//진도 방향 : 변수 사용
	//System.out.printf("%-12s %4d.%02d.%2d %5d\n",name,year,month,day,age);
}
}