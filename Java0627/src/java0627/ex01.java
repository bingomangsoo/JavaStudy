package java0627;

import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액을 입력하세요. : ");
		int money = sc.nextInt();
		System.out.println("메뉴를 고르세요.");
		System.out.print("1. 콜라(800원) 2. 생수(500원) 비타민워터(1500원) >> ");
		int choice = sc.nextInt();
		
		/*
		int money1 = money -800;
		int money2 = money -500;
		int money3 = money - 1500;
		*/
		int price = 0;
		int jandon = money - price;
		
		/*
		if (jandon > 0) {
			switch (price) {
			case 800 :
			case 500 :
			case 1500 :
				System.out.print("잔돈 : ");
				System.out.println(jandon);
				System.out.println("천원 : " + (jandon/1000) + ", " + "오백원 : " + (jandon%1000/500) + ", "+ "백원 : " + (jandon%500/100));	
				break;
			}
		} else {
			System.out.println("잔돈이 부족합니다.");
		}
		*/
		
		if (choice ==1) {
			price = 800;
		}else if (choice ==2) {
			price = 500;
		}else if (choice ==3) {
			price = 1500;
		}
		
		if (money >= price) {
			int change = money - price;
			System.out.println("잔돈 : " + change);
			System.out.println("천원 : " + (change/1000) + "개");
			System.out.println("오백원 : " + (change%1000/500) +"개");
			System.out.println("백원 : " + change%500/100 +"개");

		}else {
			System.out.println("잔돈이 부족합니다.");
		}

		
	}
}
		
		/*
		if (money1 > 0 &&  money2 >0 && money3>0) {
			switch (choice) {
			case 1 :
				System.out.print("잔돈 : ");
				System.out.println(money1);
				System.out.println("천원 : " + (money1/1000) + ", " + "오백원 : " + (money1%1000/500) + ", "+ "백원 : " + (money1%500/100));	
				break;
			
			case 2 :
				System.out.println("잔돈 : ");
				System.out.println("천원 : " + (money2/1000) + ", " + "오백원 : " + (money2%1000/500) + ", "+ "백원 : " + (money2%500/100));
				break;
				
			case 3:
				System.out.println("잔돈 : ");
				System.out.println("천원 : " + (money3/1000) + ", " + "오백원 : " + (money3%1000/500) + ", "+ "백원 : " + (money3%500/100));
			break;
				
			}
		}else {
			System.out.println("잔돈이 부족합니다.");
		}
	} */


		

