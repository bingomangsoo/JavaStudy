package java0628;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
//		if (num1 > num2) {
//			for (int i =0; i<3; i++) {
//				System.out.println(num2);
//				num2++;
//			}
//		}else {
//			for (int i =0; i<3; i++) {
//				System.out.println(num1);
//				num1++;
//			}
//		}
		

		

		int num =0;
			if (num1 >num2) {
				num = num2;

			}else {
				num = num1;
			}
			for (int i =0; i<3; i++) {

				System.out.println(num);
				num++;
			

		}
			
		/*
		int samll = num1>num2?num2:num1;
		for(int i = small; i<=(num1+num2)-samll; i++){
			System.out.println(i);
		 */
	}

}
