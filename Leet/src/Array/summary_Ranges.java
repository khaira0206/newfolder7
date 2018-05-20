package Array;

import java.util.ArrayList;
import java.util.List;

public class summary_Ranges {
	
	public List<String> sum_Ran(int[] nums){
		List<String> list=new ArrayList();
		if(nums.length==1){
			list.add(nums[0]+"");
			return list;
		}
	    for(int i=0;i<nums.length;i++){
	    	int a=nums[i];
	    	while(i+1<nums.length&&(nums[i+1]-nums[i])==1){
	    		i++;
	    	}
	    	if(a!=nums[i]){
	    		list.add(a+"->"+nums[i]);
	    	}else{
	    		list.add(a+"");
	    	}
	    }
	    return list;
	} 
	
	
	public static void main(String arg[]){
		summary_Ranges sr = new summary_Ranges();
		
		int[] arr = {0,1,2,4,5,7};
		
		System.out.println(sr.sum_Ran(arr));
	}

}
