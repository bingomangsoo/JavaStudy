package practice;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		int [] array = new int[3];
		int count = 0;
		
		for (int i =0; i<array.length; i++) {
			array[i] = sc.nextInt();

			}
		System.out.print("array에 들어있는 홀수는 : ");
		for (int i =0; i<array.length; i++) {
			if (array[i]%2!=0) {

				count++;
				System.out.print(array[i] + " ");
			}
		}
		System.out.println(" 입니다.");
		System.out.println("총 개수는" + count +"개 입니다.");
		
	}

}
