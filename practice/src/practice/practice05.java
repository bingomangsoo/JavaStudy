package practice;

import java.util.Scanner;

public class practice05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String [] name = new String[3];
		name[0] = "박혜민";
		name[1] = "홍길동";
		name[2] = "로운";
		System.out.print("검색할 이름을 입력하세요 : ");
		String input = sc.next();
		
		for (int i =0; i<name.length; i++) {

			if (name[i] == input) {
				System.out.println(name[i]);
			}
		}
	}

}
