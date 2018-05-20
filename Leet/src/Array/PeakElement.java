package Array;

public class PeakElement {

	public static void main(String args[]){
		PeakElement pe = new PeakElement();
        int[] arr = {1,2,3,4,5,3,2,1};		
		System.out.println(arr[pe.findPeakElement(arr)]);
		
	}
	
	public int findPeakElement(int[] nums) {
        int l = 0, r = nums.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] > nums[mid + 1])
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }
}
