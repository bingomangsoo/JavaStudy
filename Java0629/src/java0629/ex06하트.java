package java0629;

public class ex06하트 {

	public static void main(String[] args) {
		
		
		for (int j =1, k=3; j <=2; j++, k-=2) {
			for (int i =2; i >=j; i--) {
				System.out.print(" ");
			}
			for (int i =1; i<=j; i++) {
				System.out.print("**");
			}
			for (int i =1; i<=k; i++) {
				System.out.print(" ");
			}
			for (int i =1; i<=j; i++) {
				System.out.print("**");
			}
			
		
		System.out.println();
		}
		
		
		
		for (int j =0, k =11; j<=5; j++, k-=2) {
			for (int i=1; i<=j; i++) {
				System.out.print(" ");
			}
			for (int i =1; i<=k; i++) {
				System.out.print("*");
			}
			for (int i=1; i<=j; i++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
