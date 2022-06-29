package java0628;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int sum = 0;

		
		for (int i =num1; i <=num2; i++) {
			sum +=i;
			if (i <num2) {
				System.out.print(i);
				System.out.print('+');
			}if (i==num2) {
				System.out.print(num2);
				System.out.print("=");
				System.out.print(sum);
			}
		
		}
		
	}	

}
