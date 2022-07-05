package practice;

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원) >>");
		int money = sc.nextInt();
		
		System.out.println(money + "원은 " + "$" + (double)money/1100 + "입니다.");

	}

}
