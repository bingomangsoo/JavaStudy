package snippet;

public class Snippet {
	public static void main(String[] args) {
		if (num>=10 && num%10==0) {
			if (num ==10) {
				System.out.println("가격은 " + (int)(gift*num*0.95) + "원 입니다.");
			}
			if (num>=11) {
				System.out.println("가격은 " +(int)(gift*num*0.95*0.9) + "원 입니다.");
			}
		}else if(num>=11) {
			System.out.println("가격은 "+ (int)(gift*num*0.9) +"원 입니다.");
		}else {
			System.out.println("가격은 " + gift*num +"원 입니다.");
		}
		
	}
}

