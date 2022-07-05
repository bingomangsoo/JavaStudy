package java0701;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요.");
		
		int [] input = new int[5];
		
		for(int i =0, j =1; i<input.length; i++, j++) {
			System.out.print(j + "번답 >>");
			input[i] = sc.nextInt();
		}
		System.out.print("입력한 답은 : ");
		for (int i =0; i<input.length; i++) {
			System.out.print(input[i]+ " ");
		}
		

	}

}
