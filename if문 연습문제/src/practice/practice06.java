package practice;

import java.util.Scanner;

public class practice06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int n = sc.nextInt();
		
		if(n%10 == 3||n%10 == 6||n%10 == 9)
			if(n/10 == 3|| n/10 ==6 || n/10==0) {
				System.out.println("박수짝짝");
			}else {
				System.out.println("박수짝");
		}else if (n%30 == 0 || n%60==0 || n%90==0) {
			System.out.println("박수짝");
		}
	}
}
