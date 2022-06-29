package java0624;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		String season;
		
		switch (month) {
		case 12 :
		case 1 :
		case 2 :
			season = "겨울";
			System.out.println(month + "월은 " + season +"입니다!");
			break;
			
		case 3:
		case 4:
		case 5:
			season = "봄";
			System.out.println(month + "월은 " + season +"입니다!");
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			System.out.println(month + "월은 " + season +"입니다!");
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			System.out.println(month + "월은 " + season +"입니다!");
			break;
		// default 생략 가능
		}
		System.out.println(month + "월은 " + season + "입니다!");
		//season이라는 변수가 초기화가 안될 가능성이 있기 때문에 error ->String season =""; 빈문자열로 넣어주면 ok

	}

}
