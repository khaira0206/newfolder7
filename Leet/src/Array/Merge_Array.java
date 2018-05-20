package Array;

public class Merge_Array {

	public static void main(String arg[]){
		int[] A = {0,3};
		int[] B = {1,2,5};
		int m = 2, n = 3;
		Merge_Array ma = new Merge_Array();
		ma.merge(A, m, B, n);
		
	}
	
	public void merge(int A[], int m, int B[], int n) {
        int i=m-1;
		int j=n-1;
		int k = m+n-1;
		int[] C = new int[5];
		while(i >=0 && j>=0)
		{
			if(A[i] > B[j])
				C[k--] = A[i--];
			else
				C[k--] = B[j--];
		}
		while(j>=0)
			C[k--] = B[j--];
		for(int l = 0; l < C.length; l++){
			System.out.println(C[l]);
		}
    }
         
	
}
