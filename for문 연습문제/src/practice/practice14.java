package practice;

import java.util.Scanner;

public class practice14 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String course [] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score [] = {95, 88, 76, 62, 55};
		int i =0;
		while (true) {
			System.out.print("과목이름 >>");
			String input = sc.nextLine();
			for(i =0; i<course.length; i++) {
				if (course[i].equals(input)) {
					System.out.println(input + "의 점수는 " + score[i]);
					break;
				}
			}
			if (input.equals("그만")){
			break;
			}
			if (i == course.length) {
				System.out.println("없는 과목입니다.");
			}
		}
		
//		
//		for (int i =0; i<course.length; i++) {
//			System.out.print("과목 이름 >>");
//			String input = sc.nextLine();
//
//			if (course[i].equals(input)) {
//				System.out.println(input + "의 점수는" + score[i]);
//			}else if (input.equals("그만")) {
//				break;
//			}else{ 
//				System.out.println("없는 과목입니다.");
//			}
//			
//		}
	}

}
