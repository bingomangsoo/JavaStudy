package practice;

import java.util.Random;

public class practice07 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int [] array = new int[10];
		
		int sum = 0;
		for (int i=0; i<array.length; i++) {
			array[i] = rd.nextInt(10) +1;
			sum += array[i];
		}
		System.out.print("랜덤한 정수들 : ");
		for (int i =0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("평균은 "+ (double)sum/array.length);
		}

}
