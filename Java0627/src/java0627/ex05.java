package java0627;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 몸무게 : " );
		int recent = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();
		
		int week = 1;
		
		while (true) {
			System.out.print(week + "주차 감량 몸무게 : ");
			int loss = sc.nextInt();
			week++;
			recent -=loss;
			
			if (recent <= goal) {
				System.out.println(recent + "kg 달성!! 축하합니다!");
				break;
			}
		
		}
	}

}
