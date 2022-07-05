package java0701;
import java.util.Scanner;
import java.util.Random;


public class adfadsf {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        Random r = new Random();
        

        

        
        int count = 0;
        int life = 3;

        System.out.println("구구단을 외자! 구구단을 외자!");
        int num1 = r.nextInt(9)+1;
        int num2 = r.nextInt(9)+1;
        System.out.print( num1 + " " + "* " + num2  + " = ");
        
        int max = 0;

        while(true){
            int wjdekq = sc.nextInt();


            if(num1*num2 == wjdekq){
                System.out.println("정답!!!");
                count++;

                num1 = r.nextInt(9)+1;
                num2 = r.nextInt(9)+1;
                System.out.print(num1 + " * " + num2 + " = ");
            }else {
                System.out.println("땡! 틀렸습니다.");
                life--;
                if (life ==0){
                    System.out.println();
                    if (count >max){
                        System.out.println("최고기록 경신 !! " + count + "점!");
                    }
                    System.out.println("목숨을 모두 소진하였습니다. 다시 하시겠습니까? (Y|N) >>");
                    String yn = sc.next();
                    if (yn.equals("N")){
                        break;
                    }else if (yn.equals("Y")){
                        life = 3;
                        count =0;
                        num1 = r.nextInt(9)+1;
                        num2 = r.nextInt(9)+1;
                        System.out.print(num1 + " * " + num2 + " = ");
                        
                    }
                }else{
                    System.out.print( num1 + " * " + num2 + " = ");
                }
            }
            


        }

	}

}
