package practice;

import java.util.Scanner;

public class practice03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] array = new int[10];
		
		for (int i =0, j =1; i<array.length; i++, j++) {
			
			System.out.print(j + "번째 정수 입력 >> ");
			array[i] = sc.nextInt();
		}
		System.out.print("입력된 정수 >> ");
		for (int i =0; i<array.length; i++) {
		System.out.print(array[i]+ " ");
			
		}
		int maxNum = 0;
		int minNum = array[0];
		int sum =0;
		for (int i =0; i<array.length; i++) {
			if(array[i] > maxNum) {
				maxNum = array[i];
			}
			if(array[i] < minNum) {
				minNum = array[i];
			}
			sum +=array[i];
		}
		System.out.println();
		System.out.println("최고 점수 >> " + maxNum);
		System.out.println("최저 점수 >> " + minNum);
		System.out.println("총합 >> " + sum);
		System.out.println("평균 >>" + (double)sum/array.length);
	}

}
