package dynamic_Programming;

public class UniquePath {

	public static void main(String args[]){
		
		UniquePath up = new UniquePath();
		
		System.out.println(up.uniquePaths(4, 4));
		
	}
	
	public int uniquePaths(int m, int n) {
	   
	    int[] dp = new int[n];
	    dp[0] = 1;
	    
	    for(int i = 0; i<m; i++){
	        for(int j = 1; j<n; j++){
	            dp[j] += dp[j - 1];
	        
	        }
	    }
	    return dp[n-1];
	}
}
