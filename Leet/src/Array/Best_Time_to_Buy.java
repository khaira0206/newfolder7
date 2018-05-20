package Array;

public class Best_Time_to_Buy {

public static void main(String args[]){
		
		Best_Time_to_Buy obj = new Best_Time_to_Buy();
		int[] arr ={7, 6, 5, 4, 3, 2};
		System.out.println(obj.maxProfit(arr));
		
	}

public int maxProfit(int[] prices) {
    int maxCur = 0, maxSoFar = 0;
    for(int i = 1; i < prices.length; i++) {
        maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
        maxSoFar = Math.max(maxCur, maxSoFar);
    }
    return maxSoFar;
}
}