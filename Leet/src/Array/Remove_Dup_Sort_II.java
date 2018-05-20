package Array;

public class Remove_Dup_Sort_II {

	public static void main(String[] args){

		Remove_Dup_Sort_II rd = new Remove_Dup_Sort_II();
	    int[] nums = {1,1,1,2,2,2,2,2,2,3,3,3,3,4,5,5,5};
	    nums = rd.removeDuplicates(nums);
	    for(int i = 0; i < nums.length; i++){
	    	System.out.println(nums[i]);
	    }
	}
	
	
	public int[] removeDuplicates(int[] nums) {
	    int k = 0;
	    for (int i = 0; i < nums.length; i++)
	        if (i < 2 || nums[i] > nums[i-2])
	            nums[k++] = nums[i];
	    return nums;
	}
	
}
