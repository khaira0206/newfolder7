package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortColors {
	
	public static void main(String arg[]){
		
		SortColors sc = new SortColors();
		int[] arr = {1,2,0,1,0,2,1,2,2,1,0};
		 sc.sortColor(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]);
		}
		
	}

	public void sortColor(int[] nums){
		 int p1 = 0, p2 = nums.length - 1, index = 0;
		    while (index <= p2) {
		        if (nums[index] == 0) {
		            nums[index] = nums[p1];
		            nums[p1] = 0;
		            p1++;
		        }
		        if (nums[index] == 2) {
		            nums[index] = nums[p2];
		            nums[p2] = 2;
		            p2--;
		            index--;
		        }
		        index++;
		    }
		    
	}
	
	
}
