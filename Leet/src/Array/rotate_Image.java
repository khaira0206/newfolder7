package Array;

public class rotate_Image {

	
	 public void rotate(int[][] matrix) {
	        for(int i = 0; i<matrix.length; i++){
	            for(int j = i; j<matrix[0].length; j++){
	                int temp = 0;
	                temp = matrix[i][j];
	                matrix[i][j] = matrix[j][i];
	                matrix[j][i] = temp;
	            }
	        }
	        for(int i = 0; i < 4 ; i++){
				 for(int j = 0; j < 4; j++){
					 System.out.print(matrix[i][j]+" ");
				 }
				 System.out.println();
			 }
		 
	        for(int i =0 ; i<matrix.length; i++){
	            for(int j = 0; j<matrix.length/2; j++){
	                int temp = 0;
	                temp = matrix[i][j];
	                matrix[i][j] = matrix[i][matrix.length-1-j];
	                matrix[i][matrix.length-1-j] = temp;
	            }
	        }
	        for(int i = 0; i < 4 ; i++){
				 for(int j = 0; j < 4; j++){
					 System.out.print(matrix[i][j]+" ");
				 }
				 System.out.println();
			 }
		 
	    }
	 
	 public static void main(String args[]){
		 
		 int[][] mat =  new int[4][4];
		 for(int i = 0; i < 4 ; i++){
			 for(int j = 0; j < 4; j++){
				 mat[i][j] = (i+1)*(j+i);
			 }
		 }
		 
		 
		 rotate_Image ri = new rotate_Image();
		 ri.rotate(mat);
		 System.out.println();


		 
	 }
}
