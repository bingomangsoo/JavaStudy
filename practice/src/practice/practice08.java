package practice;

import java.util.Scanner;

public class practice08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num [] = {1,2,3};
		
		
		for (int i =0; i<num.length; i++) {
			int choice = sc.nextInt();
			if (choice ==1) {
				System.out.println("==회원가입==");
			}else if (choice ==2){
				System.out.println("==로그인==");
			}else if (choice ==3) {
				System.out.println("종료합니다.");
				break;
			}
		}
			

	}

}
