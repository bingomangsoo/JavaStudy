package practice;

import java.util.Scanner;

public class practice04 {
	public static void main(String[] args) {
		//97 ~ 122 e =101
		Scanner sc = new Scanner(System.in);
		
		System.out.print("소문자 알파벳 하나를 입력하시오>> ");
		String alpha = sc.next();
		char c = alpha.charAt(0);
		
		for (int i =97; i<=(int)c; i++) {
			for(int j = c, k =0; j>=i; j--, k++) {
				System.out.print((char)(i+k));
			}System.out.println();
		}
		
//		for (int i =101; i>=(int)c; i--) {
//			for(int j = c, k =0; j<=i; j++, k++) {
//				System.out.print((char)(i));
//			}System.out.println();
//		}
	}
}
