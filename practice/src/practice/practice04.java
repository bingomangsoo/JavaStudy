package practice;

import java.util.Scanner;

public class practice04 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		String [] arr = {"수", "박"};
		int num = sc.nextInt();
		
		for(int i =0; i<num; i++) {
			if(i%2==0) {
				System.out.print(arr[0]);
			}else {
				System.out.print(arr[1]);
			}
			
		}

	}

}
