package practice;

import java.util.Scanner;

public class 수박 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] check = {1,4,3,2,1};
		int [] mycheck = new int [5];
		
		System.out.println("답을 입력하세요.");
		
		for (int i =0, j =1; i<check.length; i++, j++) {
			System.out.print(j +"번째 답 >>");
			int number = sc.nextInt();
			mycheck[i] = number;
			
		}
		System.out.println();
		int count = 0;
		System.out.println("정답 확인");
		for (int i=0; i<check.length; i++) {
			if(check[i] == mycheck[i]) {
				System.out.print("O ");
				count += 10;
			}else {
				System.out.print("X ");
			}
		}System.out.println("총점 : " + count);

	}

}
