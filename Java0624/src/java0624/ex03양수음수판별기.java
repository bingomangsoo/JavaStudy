package java0624;

import java.util.Scanner;

public class ex03양수음수판별기 {

	public static void main(String[] args) {
		// 사용자로부터 정수를 입력받습니다.
		// 입력받은 숫자가 양수, 0, 음수인지 판별하는 프로그램을 만들어보세요.
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (num <0) {
			System.out.println("음수입니다.");
		}else if (num > 0) {
			System.out.println("양수입니다.");
		}else {
			System.out.println("0입니다.");
		}

	}

}
