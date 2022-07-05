package java0701;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] array = new int[8];

		
		
		for (int i =0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		int count =0;
		System.out.print("array에 들어있는 홀수는 ");
		for (int i =0; i<array.length; i++) {
			if(array[i]%2!=0) {
				System.out.print(array[i] + " ");
				count ++;
			}
		}
		System.out.print("이며,");
		System.out.println();
		System.out.println("총 " + count +"개 입니다.");
	}

}
