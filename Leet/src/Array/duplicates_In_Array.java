package Array;

import java.util.ArrayList;
import java.util.List;

public class duplicates_In_Array {

	
	public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i])-1;
            if (nums[index] < 0)
                res.add(Math.abs(index+1));
            nums[index] = -nums[index];
        }
        return res;
    }
	
	public static void main(String arg[]){
		
		int[] arr = {1,2,3,4,5,5,6};
		duplicates_In_Array dia = new duplicates_In_Array();
		System.out.println(dia.findDuplicates(arr));
	}
}
