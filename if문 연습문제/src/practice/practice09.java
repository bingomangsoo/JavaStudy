package practice;

import java.util.Scanner;

public class practice09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원의 중심과 반지름 입력>>");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double radius = sc.nextDouble();
		
		System.out.print("점 입력 >>");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		double length = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		
		if (length < radius) {
			System.out.println("점 (" + x2 + "," +y2 +")는 원 안에 있다.");
		}else {
			System.out.println("점 (" + x2 + ", " +y2 +")는 원 밖에 있다.");
		}
		
	}

}
