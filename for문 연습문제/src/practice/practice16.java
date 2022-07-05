package practice;

import java.util.Random;
import java.util.Scanner;

public class practice16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		String [] str = {"가위", "바위", "보"};
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while (true) {
			System.out.print("가위 바위 보!! >>");
			String user = sc.nextLine();

			int computer = rd.nextInt(3);
//			String strCom = str[computer];
			
			if (user.equals("그만")) {
				break;
			}
			
			
			System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[computer]);
			
				if (user.equals("가위")) {
					if(str[computer].equals("가위")) {
						System.out.println("비겼습니다.");
					}
					else if(str[computer].equals("바위")) {
						System.out.println("졌습니다.");
					}else if (str[computer].equals("보")){
						System.out.println("이겼습니다.");
					}
				}
				
				else if (user.equals("바위")) {
					if(str[computer].equals("바위")) {
						System.out.println("비겼습니다.");
					}
					else if(str[computer].equals("보")) {
						System.out.println("졌습니다.");
					}else if (str[computer].equals("가위")){
						System.out.println("이겼습니다.");
					}
				}
				else if (user.equals("보")) {
					if(str[computer].equals("보")) {
						System.out.println("비겼습니다.");
					}
					else if(str[computer].equals("가위")) {
						System.out.println("졌습니다.");
					}else if (str[computer].equals("주먹")){
						System.out.println("이겼습니다.");
					}
				}
				else {
					System.out.println("잘못냈습니다.");
				}
			}
				
			

	}

}
