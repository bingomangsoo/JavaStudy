package java0624;

import java.util.Scanner;

public class ex04마트계산대프로그램 {

	public static void main(String[] args) {
		// 선물세트를 구매할 때 얼마를 지불헤야하는지
		// 계산하는 프로그램을 만들어보자.
		// 1. 선물세트의 기본가격 10000
		// 2. 11개 이상 구매시에는 10% 할인
		// 3. 10개들이로 구매를 하면 5% 추가 할인 = 10개로 사던지, 20개로 사던지
		// 4. 100개 단위로 구매하면 5%할인
		
		Scanner sc = new Scanner(System.in);
		System.out.print("사려는 상품 갯수를 입력하세요 : ");
		int num = sc.nextInt();
		int gift = 10000;
		

		if (num>=10 && num%10==0) {
			if (num ==10) {
				System.out.println("가격은 " + (int)(gift*num*0.95) + "원 입니다.");
			}
			if (num>=11) {
				System.out.println("가격은 " +(int)(gift*num*0.85) + "원 입니다.");
			}
		}else if(num>=11) {
			System.out.println("가격은 "+ (int)(gift*num*0.9) +"원 입니다.");
		}else {
			System.out.println("가격은 " + gift*num +"원 입니다.");
		}
		
		
		
		
	}

}
