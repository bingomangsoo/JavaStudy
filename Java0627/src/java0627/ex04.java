package java0627;

import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		
		while (true) {	//무한반복
			System.out.println("숫자를 입력하세요");
			int inputnum = sc.nextInt();

			if (inputnum <0 || inputnum>100) {

				System.out.println("합계 : " + sum);
				System.out.println("평균 : " + (double)sum/count);
				break;
			}
			sum+=inputnum;
			count++;
			
		}
	
		/*
		int score = 0;
		int sum = 0;
		int cnt = 0;
		
		do {
			System.out.println("성적 입력: ");
			score = sc.nextInt();
		} while (score >=0 && score<=100){
			sum =+ score;
			cnt++;
			System.out.println("합계 : " + sum-score);
			System.out.println("평균 : " + (sum-score)/(double)(cnt-1));
		}
		*/
	}
	
	
}
