package Excercise;

import java.util.Scanner;

public class excercise가위바위보 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		System.out.print("철수 >>");
		String cs = sc.next();
		System.out.print("영희 >>");
		String yh = sc.next();
		
		if(cs.equals("가위")) {
			if (yh.equals("가위")){
				System.out.println("비겼습니다.");
			}else if (yh.equals("바위")) {
				System.out.print("영희가 이겼습니다.");
			}else if (yh.equals("보")) {
				System.out.println("철수가 이겼습니다.");
			}
		}
		if(cs.equals("바위")) {
			if (yh.equals("바위")){
				System.out.println("비겼습니다");
			}else if (yh.equals("보")) {
				System.out.print("영희가 이겼습니다.");
			}else if (yh.equals("가위")) {
				System.out.println("철수가 이겼습니다.");
			}
		}		if(cs.equals("보")) {
			if (yh.equals("보")){
				System.out.println("비겼습니다.");
			}else if (yh.equals("가위")) {
				System.out.print("영희가 이겼습니다.");
			}else if (yh.equals("주먹")) {
				System.out.println("철수가 이겼습니다.");
			}
		}

	}

}
