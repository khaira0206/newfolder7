package dynamic_Programming;

public class DecodeWays {

	public static void main(String arg[]){
		DecodeWays dw = new DecodeWays();
		String str = "12";
		System.out.println(dw.decodeWays(str));
	}
	
	public int decodeWays(String str){
		
		int n = str.length();
		int[] dp = new int[n+1];
		dp[0] = 1;
		dp[1] = str.charAt(0) != '0' ? 1 : 0;
		
		for(int i = 2; i <= n; i++){
			 int first = Integer.valueOf(str.substring(i-1, i));
	            int second = Integer.valueOf(str.substring(i-2, i));
	            if(first >= 1 && first <= 9) {
	               dp[i] += dp[i-1];  
	            }
	            if(second >= 10 && second <= 26) {
	                dp[i] += dp[i-2];
	            }
		}
		
		return dp[n];
	}
	
}
