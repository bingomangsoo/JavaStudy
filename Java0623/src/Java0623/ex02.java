package Java0623;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Java 점수 입력 : ");
		int java = sc.nextInt();
		System.out.print("Web 점수 입력 : ");
		int web = sc.nextInt();
		System.out.print("Android 점수 입력 : ");
		int android = sc.nextInt();
		int sum = java + web + android;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum / 3.0f);
		
		//자동정렬 : ctrl + a , ctrl + shirft + f
		
		
	}

}
