package Array;

import java.util.HashSet;
import java.util.Set;

public class Contain_dup_II {

	
	public static void main(String arg[]){
		int[] nums = {1,2,3,4,5,2};
		int k = 3;
		Contain_dup_II cd = new Contain_dup_II();
		System.out.println(cd.containsNearbyDuplicate(nums, k));
	}
	
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
 }
}
