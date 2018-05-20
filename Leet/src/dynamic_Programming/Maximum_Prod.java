package dynamic_Programming;

public class Maximum_Prod {

	public static void main(String arg[]){
		Maximum_Prod mp =  new Maximum_Prod();
		int[] A = {2,3,-2,4,-2};
		System.out.println(mp.maxProduct(A, 5));
				
	}
	
	
	int maxProduct(int A[], int n) {
	   
	    int r = A[0];
	    int imax = r, imin = r;
	  
	    for (int i = 1; i < n; i++) {
	        
	        if (A[i] < 0){
	        	int temp = imax + imin;
	        	imax = temp - imax;
	        	imin = temp - imin;
	        }
	        	
	       
	        imax = Math.max(A[i], imax * A[i]);
	        imin = Math.min(A[i], imin * A[i]);

	      
	        r = Math.max(r, imax);
	    }
	    return r;
	}
	
	
		
	
	
}
