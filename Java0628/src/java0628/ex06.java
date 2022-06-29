package java0628;

public class ex06 {

	public static void main(String[] args) {
		
		for(int i =1; i<51; i++) {
			if (i%10 ==3 || i%10 ==6 || i%10 ==9) {
				System.out.println("박수");
			}else if (i%10==5) {
				System.out.println("으악");
			}else {
				System.out.println(i);
			}
		}
		
	}

}
