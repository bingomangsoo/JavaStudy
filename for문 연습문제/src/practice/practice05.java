package practice;

import java.lang.reflect.Array;
import java.util.Scanner;

public class practice05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] array = new int[10];
		
		System.out.print("양의 정수 10개를 입력하시오>>");
		
		for (int i =0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.print("3의 배수는 ");
		for (int i =0; i<array.length; i++) {
			if(array[i]%3==0) {
				System.out.print(array[i] + " ");
			}
		}
	}

}
