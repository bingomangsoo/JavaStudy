package practice;

public class practice13 {

	public static void main(String[] args) {
		for (int i=1; i<100; i++) {
			if (i%10 == 3 || i%10==6 || i%10 ==9) {
				if(i%3==0 && i>10) {
					System.out.print(i);
					System.out.println("박수 짝짝");
				}else {
					System.out.print(i);
					System.out.println("박수 짝");
				}
			}else if (i%3==0 && i<10) {
				System.out.print(i);
				System.out.println("박수 짝");
			}
		}
	

	}

}
