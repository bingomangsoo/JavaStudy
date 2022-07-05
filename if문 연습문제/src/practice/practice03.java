package practice;

import java.util.Scanner;

public class practice03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int money = sc.nextInt();
		
		System.out.println("오만원권 " + money/50000 + "매");
		System.out.println("만원권 " + money%50000/10000 + "매");
		System.out.println("천원권 " + money%10000/1000 + "매");
		System.out.println("백원 " + money%1000/100 + "개");
		System.out.println("오십원 " + money%100/50 + "개");
		System.out.println("십원" + money%50/10 +"개");
		System.out.println("일원 " + money%10/1 + "개");
	}

}
