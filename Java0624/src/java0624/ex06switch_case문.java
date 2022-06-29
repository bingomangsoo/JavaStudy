package java0624;

import java.util.Scanner;

public class ex06switch_case문 {

	public static void main(String[] args) {
		// switch_case 사용하기
		// 간단 챗봇 만들기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력해주세요 : ");
		String str = sc.nextLine(); //next()는 띄어쓰기가 없는 문장 입력(띄어쓰기 직전까지만 인식) nextLine은 띄어쓰기가 있는 문장 입력
		
		switch (str) {
		case "안녕" :
		case "안녕하살법" : //str이 "안녕"이든, "안녕하살법"이든 명령실행
			System.out.println("안녕하세요");
			break;
			
		case "배고파" :
		case "오늘 점심 뭐 먹을래?" :
			System.out.println("나도.. 오늘 점심은 뭐지?");
			break;
			
		default: // if-else 문의 else와 같은 역할
			System.out.println("무슨 말인지 모르겠어..");
			break;
		}
		
		

	}

}
