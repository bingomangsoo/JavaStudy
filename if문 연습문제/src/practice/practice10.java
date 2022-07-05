package practice;

import java.util.Scanner;

public class practice10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double radius1 = sc.nextDouble();
		
		System.out.println("두번째 원의 중심과 반지름 입력>>");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double radius2 = sc.nextDouble();
		
		double length = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		
		if(length < radius1+radius2) {
			System.out.println("두 원은 서로 겹친다.");
		}else {
			System.out.println("겹치지 않는다.");
		}

	}

}
