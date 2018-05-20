package Array;

public class Mini_Path_Sum {
	
	public static void main(String arg[]){
		
		int[][] grid = {{1,3,1},
		                {1,5,1},
		                {4,2,1}};
		
		Mini_Path_Sum mp = new Mini_Path_Sum();
		System.out.println(mp.minPathSum(grid));
		
	}
	

	public int minPathSum(int[][] grid) {
		int m = grid.length;// row
		int n = grid[0].length; // column
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 && j != 0) {
					grid[i][j] = grid[i][j] + grid[i][j - 1];
				} else if (i != 0 && j == 0) {
					grid[i][j] = grid[i][j] + grid[i - 1][j];
				} else if (i == 0 && j == 0) {
					grid[i][j] = grid[i][j];
				} else {
					grid[i][j] = Math.min(grid[i][j - 1], grid[i - 1][j])
							+ grid[i][j];
				}
			}
		}

		return grid[m - 1][n - 1];
	}
}
