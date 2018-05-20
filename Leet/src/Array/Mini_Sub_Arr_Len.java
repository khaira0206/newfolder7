package Array;

public class Mini_Sub_Arr_Len {

	
	public static void main(String arg[]){
		
		int[] a = {2,7,1,2,4,3};
		int s = 7;
		Mini_Sub_Arr_Len ms = new Mini_Sub_Arr_Len();
		System.out.println(ms.minSubArrayLen(s, a));
		
	}
	
	public int minSubArrayLen(int s, int[] a) {
		  if (a == null || a.length == 0)
		    return 0;
		  
		  int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;
		  
		  while (j < a.length) {
		    sum += a[j++];
		    
		    while (sum >= s) {
		    	System.out.println(sum);
		      min = Math.min(min, j - i);
		      sum -= a[i++];
		    }
		  }
		  
		  return min == Integer.MAX_VALUE ? 0 : min;
		}
	
}
