package practice;

import java.util.Scanner;

public class practice05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력하시오 >>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		
		if (b+c>a && (b-c>0?b-c<a:c-b<a)) {
			System.out.println("삼각형이 됩니다.");
		}else if (a+c>b && (a-c>0?a-c<b:c-a<b)){
			System.out.println("삼각형이 됩니다.");
		}else if (a+b>c && (a-b>0?a-b<c:b-a<c)) {
			System.out.println("삼각형이 됩니다.");
		}else {
			System.out.println("삼각형이 될 수 없습니다.");
		}

	}

}
