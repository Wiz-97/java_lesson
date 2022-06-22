package koreait.ext;

public class BinaryOp {
	public static void main(String[] args) {
		
		//2진수의 비트 연산: &, |, ^, ~, >>, << 등 간단히 테스트
		int data = 0b0101110100100110;
		
		System.out.println("1. 비트 반전 연산 '~'");
		System.out.println(String.format("%32s", Integer.toBinaryString(data)));
		System.out.println(String.format("%32s", Integer.toBinaryString(~data)));
		
		data = -2345;
		System.out.println("2. 음수값 오른쪽 쉬프트 연산 '>>'(왼쪽에 추가되는 비트는 무엇?)");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>1), data>>1));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>2), data>>2));
		//정수 32비트의 맨 왼쪽 비트는 부호를 표시함. 오른쪽 쉬프트연산에서 왼쪽에 추가되는 비트는 부호와 같음
		//참고: 오른쪽 쉬프트 할때 부호와 상관없이 왼쪽에 추가되는 비트를 0으로 해야도리 때는 >>>연산으로 실행
		
		
		System.out.println("3. 오른쪽 쉬프트 연산 '>>>'");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>>1), data>>>1));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>>2), data>>>2));
		
		int n = 0xffffffff;			//32비트가 모두 1
		data = 100;
		//참고: 논리연산 and는 참 and 참 일때만 결과가 참, or는 거짓 or 거짓일때만 결과가 거짓
		//비트연산 and는 1&1 일때만 결과가1, 비트연산 or는 0 or 0일때만 결과가 0
		System.out.println("4. &는 bit의 and 연산");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(n), n));
		System.out.println("---------------------------------------------");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data&n), data&n));
		
		System.out.println("\n5. |는 bit의 or 연산");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(n), n));
		System.out.println("---------------------------------------------");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data|n), data|n));
		
		
		
	}
}
