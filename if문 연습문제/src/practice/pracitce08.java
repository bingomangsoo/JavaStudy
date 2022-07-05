package practice;

import java.util.Scanner;

public class pracitce08 {

	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if ((x>=rectx1 && x<= rectx2) && (y>=recty1&&y<=recty2))
			return true;
		else return false;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(inRect(150,150, 100, 100, 200, 200));

	}

}
