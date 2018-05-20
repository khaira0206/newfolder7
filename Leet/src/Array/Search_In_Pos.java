package Array;

public class Search_In_Pos {

	public static void main(String args[]){
		
		Search_In_Pos sip = new Search_In_Pos();
		int[] arr ={1,3,5,6};
		System.out.println(sip.searchInsert(arr, 2));
		
	}
	
	
	public int searchInsert(int[] A, int target) {
        int low = 0, high = A.length;
        while(low<high){
            int mid = low + (high - low)/2;
            if(A[mid] == target) return mid;
            else if(A[mid] > target) high = mid;
            else low = mid+1;
        }
        return low;
    }
}
