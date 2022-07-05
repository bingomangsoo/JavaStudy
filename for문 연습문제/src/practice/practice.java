package practice;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 48;
		
		System.out.println("수를 결정하였습니다. 맞추어 보세요.");
		
		int count =1;
		int min =0;
		int max = 99;
		
		while(true){
			System.out.println(min + "-" + max);
			System.out.print(count + ">>");
			int inputnum = sc.nextInt();
			if (inputnum == num) {
				System.out.println("맞았습니다.");
				System.out.print("다시 하시겠습니까 (y/n)");
				String yn = sc.next();
				if(yn.equals("y")) {
					System.out.println("수를 결정하였습니다. 맞추어 보세요.");
					
					count = 1;
					min =0;
					max =99;
				}else if (yn.equals("n")){
					break;
				}
			}else {
				count++;
				if (inputnum>num) {
					System.out.println("더 낮게");
					max = inputnum;
				}else if (inputnum<num) {
					System.out.println("더 높게");
					min = inputnum;
				}
				
			}
		}

	}

}
