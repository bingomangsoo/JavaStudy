package Java0623;

import java.util.Scanner;

public class ex01Scanner사용하기 {

	public static void main(String[] args) {
		// Scanner : 사용자로부터 입력을 받을 수 있는 데이터타입
		// 변수의 선언과 초기화
		int num = 11;
		
		int num2;
		num2 = 100;
		
		// 데이터타입 변수명 = 초기값;
		System.out.println("정수입력 >>");
		Scanner sc = new Scanner(System.in);
		// System.in : 표준입력장치
		
		//정수를 입력받는 기능
		int input = sc.nextInt();
		System.out.println(input);
		
		//글자 입력
		System.out.println("좋아하는 과일을 입력하세요 >>");
		String inputStr = sc.next();
		System.out.println(inputStr);
		
	}

}
