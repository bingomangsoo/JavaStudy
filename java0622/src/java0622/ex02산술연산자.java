package java0622;

public class ex02산술연산자 {
	// 프로그램의 시작점
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); // 몫
		System.out.println(a%b); // 나머지
		
		float num1 = 3.14f;
		float num2 = 16.999f;
		
		// a가 float타입으로 자동 형변환이 일어난다.
		System.out.println(a+num1); // 100 -> 100.0
		
		// char는 한글자만 담을 수 있어서 불편하다.
		// 여러 글자를 사용할 때는 String 타입을 사용하자.
		char c = '안';
		String str = "안녕하세요";
		String num3 = "100";
		
		System.out.println(a+num3); // 정수와 문자열이 만나면 정수가 문자열로 바뀌게 된다.
		
		
	}
}

