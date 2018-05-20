package Array;

public class Min_Cost_Climb {

	public static void main(String args[]){
		
		int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
		Min_Cost_Climb mcc = new Min_Cost_Climb();
		System.out.println(mcc.minCostClimbingStairs(cost));
		
	}
	
	    public int minCostClimbingStairs(int[] cost) {
	        int [] mc = new int[cost.length + 1];
	        mc[0] = cost[0];
	        mc[1] = cost[1];
	        
	        for(int i = 2; i < cost.length; i++){
	            int costV = (i==cost.length - 1)?0:cost[i];
	            mc[i] = Math.min(mc[i-1] + costV, mc[i-2] + costV);
	        }
	        return mc[cost.length - 1];
	    }
	
	
}
