package java0624;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("DB : ");
		int db = input.nextInt();
		System.out.print("전자계산기 구조 : ");
		int cal = input.nextInt();
		System.out.print("OS : ");
		int os = input.nextInt();
		System.out.print("데이터통신 : ");
		int data = input.nextInt();
		System.out.print("소프트웨어공학 : ");
		int software = input.nextInt();
		
		
		if (db>=8 && cal>=8 && os>=8 && data>=8 && software>=8) {
			if (db+cal+os+data+software >=60) {
				System.out.println("합격입니다!");
			}else {
				System.out.println("불합격입니다!");
			}
		}else {
			System.out.println("불합격입니다!");
		}

	}

}
