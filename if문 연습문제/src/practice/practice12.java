package practice;

import java.util.Scanner;

public class practice12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		String operator = sc.next();
		
		switch (operator) {
		case "+" :
			System.out.println(a + "+" + b +"의 계산결과는 " + (a+b));
			break;
		case "-" :
			System.out.println(a + "-" + b +"의 계산결과는 " + (a-b));
			break;
		case "/" :
			if(b==0) System.out.println("0으로 나눌 수 없습니다.");
			else System.out.println(a + "%" + b +"의 계산결과는 "+(a/b));
			break;
		case "%" :
			if(b==0) System.out.println("0으로 나눌 수 없습니다.");
			else System.out.println(a + "%" + b +"의 계산결과는 "+(a/b));
			break;
		}
	}

}
