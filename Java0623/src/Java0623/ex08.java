package Java0623;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int grade = input.nextInt();
		
		if (grade >=60) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
	}

}
