package koreait.day04;

public class C20_StringMethod {
	public static void main(String[] args) {
		
		String message = "Hello World";		//java.lang.String(�⺻��Ű�� Ŭ����)
		
		//String Ŭ������ �޼ҵ�� �ſ� ����
		//�� �ܿ�� ����ϴ� ���� �ƴϰ� �޼ҵ��� �̸�, ����, ���������� �����ؼ� ���
		//�޼ҵ� �����ε�(overloading): �޼ҵ� �̸��� ���������� ���� ���ڰ��� ������ ������ �ٸ��� ���ǵ� ��
		
		int len = message.length();
		char temp = message.charAt(3);
		boolean isState = message.equals("Hello World");
		
		System.out.println("length() = " + len);
		System.out.println("charAt(3) = " + temp);
		System.out.println("equals(\"Hello World\") = " + isState);
		System.out.println("indexOf('e') = " + message.indexOf('e'));
		System.out.println("indexOf(\"lo\") = " + message.indexOf("lo"));
		System.out.println("indexOf(\"lo\") = " + message.indexOf("ol"));		//ã�� ���ڿ��� ���� �� -1���
		
		String test = "hi hi";
		System.out.println("test.indexOf(\"lo\") = " + test.indexOf("hi"));
		System.out.println("test.indexOf(\"lo\") = " + test.lastIndexOf("hi"));
		
		System.out.println("substring(2) = " + message.substring(2));
		System.out.println("substring(2,4) = " + message.substring(2,4));
		System.out.println("message.replace(\"ll\", \"*@\") = " + message.replace("ll", "*@"));//ġȯ, ���ڿ� ���� ���� ��ȯ �ʼ�X
		System.out.println("message.startsWith(\"H\") = " + message.startsWith("H"));
		System.out.println("message.endsWith(\"d\") = " + message.endsWith("d"));
		
		//   "�� ����ϰ� �������� \" �Է� -> ��ȣ�� ���ڿ��������� �ؼ��Ǳ� ����
		
	}
}
//		message.length();				//public int length()
//		message.charAt(0);				//public char charAt(int index)
//		
//		message.equals("Hello World");	//public boolean equals(Object anObject), Object�� ��� Ÿ��
//										//message�� String Ÿ���̹Ƿ� Object�� String���� �ؼ�

//		message.indexOf('e');		//return Ÿ�� ���� int
//		message.indexOf("lo");		//return Ÿ�� ���� int
//		message.substring(2);		//return Ÿ�� ���� String
//		message.substring(2,4);		//return Ÿ�� ���� String
//		message.replace("ll", "*@");//return Ÿ�� ���� String

