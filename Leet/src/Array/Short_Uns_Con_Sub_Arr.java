package Array;

public class Short_Uns_Con_Sub_Arr {

	
	//This solution is wrong
	public static void main(String arg[]){
		
		int[] arr = {2,4,3,1,7,6,8,9,10};
		Short_Uns_Con_Sub_Arr sucs = new Short_Uns_Con_Sub_Arr();
		System.out.println(sucs.findUnsortedSubarray(arr));
		
	}
	
	public int findUnsortedSubarray(int[] A) {
	    int n = A.length, beg = -1, end = -2, min = A[n-1], max = A[0];
	    for (int i=1;i<n;i++) {
	      max = Math.max(max, A[i]);
	      min = Math.min(min, A[n-1-i]);
	      if (A[i] < max) end = i;
	      if (A[n-1-i] > min) beg = n-1-i; 
	    }
	    return end - beg + 1;
	}
}
