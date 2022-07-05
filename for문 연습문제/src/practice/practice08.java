package practice;

import java.util.Random;
import java.util.Scanner;

public class practice08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.print("정수 몇개?");
		int num = sc.nextInt();
		int array [] = new int [num];
		
		
		
		
		
		for (int i =0; i<array.length; i++) {
			array[i] = rd.nextInt(100)+1;
			for(int j=0;j<i;j++) 
            {
                if(array[i]==array[j]){
                	i--;
                }
            }
		}
		for (int i =0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
