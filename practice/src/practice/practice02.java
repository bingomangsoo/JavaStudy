package practice;

import java.util.Scanner;

public class practice02 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int array [] = new int [5];

		
		for (int i =0, j=1; i<array.length; i++, j++) {
			
			System.out.print(j +"번째 입력 >> ");
			array[i] = sc.nextInt();
			
		}
		System.out.print("입력된 정수 : ");
		for (int i =0; i<array.length; i++) {
			System.out.print(array[i] +" " );
			
		}
	}
}
