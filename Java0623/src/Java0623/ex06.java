package Java0623;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("노동시간을 입력하세요 : ");
		int time = scan.nextInt();
		System.out.println("총 임금은 " + (int)(time>8?8*5000+((time-8)*5000*1.5):time*5000) + "원 입니다");
		

	}

}
