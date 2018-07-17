package Session14July;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] Array1 = {
				{2,4,6},
				{1,8,9}
				};
		int[][] Array2= {
				
				{3,4,6},
				{6,7,9}
		};
		
		int sum[][] = new int[2][3];
		
		for(int i =0 ; i<Array1.length ; i++){
		
			for(int j=0;j<Array2[0].length;j++){
			
			 sum[i][j]= Array1[i][j] + Array2[i][j];
			 System.out.print(sum[i][j]+ " " );
			}
			System.out.println();
		}
		
		

	}

}
