package Array;

public class searchMatrix {

	public static void main(String arg[]){
		
		int[][] mat = {
		               {1,   3,  5,  7},
		               {10, 11, 16, 20},
		               {23, 30, 34, 50}
		};
		
		searchMatrix sm = new searchMatrix();
		System.out.println("Does it contain the target : "+sm.searchMatrix(mat, 2));
		
	}
	
	public boolean searchMatrix(int[][] matrix, int target) {
		
		int row_num = matrix.length;
		int col_num = matrix[0].length;
		
		int begin = 0, end = row_num * col_num;
		
		while(begin < end){
			int mid = (begin + end) / 2;
			int mid_value = matrix[mid/col_num][mid%col_num];
			
			if( mid_value == target){
				return true;
			
			}else if(mid_value < target){
				//Should move a bit further, otherwise dead loop.
				begin = mid+1;
			}else{
				end = mid;
			}
		}
		
		return false;
	}
}
