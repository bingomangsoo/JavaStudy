package practice;

public class practice09 {
	public static void main(String[] args) {
		
		int [][] array = {{1,2,3},{3,2,1}};
		
		for(int[] x : array) {
			for(int y : x) {
				System.out.println(y);
			}
		}
		
	}
	

}
