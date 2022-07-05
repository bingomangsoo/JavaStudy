package practice;

import java.util.Scanner;

public class practice06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int check[] = {1,4,3,2,1};
		int input [] = new int[5];
		
		for (int i =0, j=1; i<check.length; i++, j++) {
			System.out.print(j + "답 >> ");
			int inputNum = sc.nextInt();
			input[i] = inputNum;
			
		}
		
		System.out.println("정답확인");
		int count = 0;
		for (int i =0; i<check.length; i++) {
			if (input[i] == check[i]) {
				System.out.print("O ");
				count += 10;
			}else {
				System.out.print("X ");
			}
		}
		System.out.println("총점 : " + count);
		
	}

}
