package practice;

import java.util.Scanner;

public class practice04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 3개 입력 >>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if ((a<b && a>c) || (a<c&& a>b)) {
			System.out.println("중간 값은 " +a);
		}else if ((b<c && b>a) || (b<a && b>c)) {
			System.out.println("중간 값은 " +b);
		}else {
			System.out.println("중간 값은 " + c);
		}

	}

}
