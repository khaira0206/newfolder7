package dynamic_Programming;

public class Coin_Change {

	public static void main(String args[]){
		
		int[] denom = {1, 2, 5};
		
		Coin_Change cc = new Coin_Change();
		
	
	
			System.out.println(cc.coinChange(denom, 500000004));
		
	}
	
	public int coinChange(int[] denom, int amount){
		
	
		int[] dp = new int[amount + 1];
        dp[0] = 0;
        int j;
        
        for(int i = 1; i <= amount; i++ ){
        	j = 0;
            dp[i] = Integer.MAX_VALUE;
        	while(j < denom.length && i - denom[j] >= 0){
        	
        		dp[i] = Math.min(dp[i] , dp[i - denom[j]] + 1);
        		j++;
        	}
        	
        	
        }
        return dp[amount] > amount ? -1 : dp[amount];
	}
	
	
}
