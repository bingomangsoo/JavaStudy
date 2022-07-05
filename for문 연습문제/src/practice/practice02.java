package practice;

public class practice02 {

	public static void main(String[] args) {
		int n [][] = {{1},{1,2,3},{1},{1,2,3,4},{1,1}};
		
		for (int i =0; i<n.length; i++) {
			for (int j =0; j<n[i].length; j++) {
				System.out.println(n[i][j]);
			}
		}
	}

}
