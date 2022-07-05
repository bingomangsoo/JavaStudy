package practice;

public class star_pyramid3 {

	public static void main(String[] args) {
		// 다이아몬드
		for (int i=0; i<5; i++) {
			for (int j =5; j>i; j--) {
				System.out.print(" ");
			}for (int j =0; j<=i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		for (int i =0; i<5; i++) {
			for (int j =0; j<=i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		//역피라미드
		
		for (int i =0; i<5; i++) {
			for (int j =0; j<=i; j++) {
				System.out.print(" ");
			}for (int j =5; j>i; j--) {
				System.out.print("*");
			}System.out.println();
		}

		
		//역피라미드
		
		for (int i =0; i<5; i++) {
			for (int j =5; j>=i; j--) {
				System.out.print("*");
			}System.out.println();
		}
		

	}

}
