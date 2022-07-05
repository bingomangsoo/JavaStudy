package practice;

import java.util.Scanner;

public class pracitce07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점 (x,y)의 좌표를 입력하시오>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a>100 && a<200 && b>100 && b<200) {
			System.out.println("점 " + "(" + a + "," + b + ")는 사각형 안에 있다.");
		}else {
			System.out.println("사각형 안에 없다.");
		}
	}

}
