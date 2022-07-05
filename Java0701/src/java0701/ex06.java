package java0701;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요.");
		
		int [] input = new int[5];
		
		
		for(int i =0; i<input.length; i++) {
			System.out.print(i+1 + "번답 >>");
			input[i] = sc.nextInt();
		}
		
		// 정답에 따라 x o를 출력하고 총점을 보여주는 프로그램을 만들어보자.
		// 문제 하나당 20점
		
		int [] answer = {1,4,3,2,1}; // 정답배열
		int sum =0;
		int score [] = {15,25,30,20,10};
		
		System.out.println("정답확인");
		for (int i =0; i<input.length; i++) {
			if (input[i] == answer[i]) {
				System.out.print("O ");
				sum += score[i];
			}else {
				System.out.print("X ");
			}
		}
		System.out.println("총점 : " + sum );
		
	}

}
