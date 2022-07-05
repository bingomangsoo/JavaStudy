package java0701;

import java.util.Random;

public class ex02RnadomArray {

	public static void main(String[] args) {
		
		// 10칸짜리 정수형 배열을 만들고
		// 1~20사이의 랜덤수로 초기화해보자.
		
		int array [] = new int [10];
		
		Random rd = new Random(); // 난수를 생성하는 데이터 아입
		int number = rd.nextInt(20)+1; //0에서 19까지의 사이의 난수 +1 >> 1에서 20사이의 수
		System.out.println(number);
		
		// 난수로 초기화하기
		
		for (int i =0; i<=9; i++) {
			array[i] = rd.nextInt(20)+1;
		}
		
		// 배열 값 확인
		for (int i =0; i<=9; i++) {
			System.out.print(array[i] + " ");

		}

	}

}
