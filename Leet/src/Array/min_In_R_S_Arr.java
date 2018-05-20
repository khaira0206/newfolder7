package Array;

public class min_In_R_S_Arr {

	
	    public int findMin(int[] num) {
	        if (num == null || num.length == 0) {
	            return 0;
	        }
	        if (num.length == 1) {
	            return num[0];
	        }
	        int start = 0, end = num.length - 1;
	        while (start < end) {
	            int mid = (start + end) / 2;
	            if (mid > 0 && num[mid] < num[mid - 1]) {
	                return num[mid];
	            }
	            if (num[start] <= num[mid] && num[mid] > num[end]) {
	                start = mid + 1;
	            } else {
	                end = mid - 1;
	            }
	        }
	        return num[start];
	    }
	
	
	public static void main(String arg[]){
		int[]  num = {4 ,5, 0, 1 ,2,3};
		min_In_R_S_Arr mir = new min_In_R_S_Arr();
		System.out.println(mir.findMin(num));
	}
}
