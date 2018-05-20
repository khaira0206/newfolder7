package Array;

import java.util.ArrayList;
import java.util.List;

public class Comb_Sum_3 {

	
public static void main(String args[]){
		
	Comb_Sum_3 obj = new Comb_Sum_3();
		
		System.out.println(obj.comb(3,9));
		
	}

public List<List<Integer>> comb(int k , int t){
	
	int[] arr ={9,8,7, 6, 5, 4, 3, 2,1};
	List<List<Integer>> list = new ArrayList<>();
	helper(list,new ArrayList<Integer>(), k , t, arr, 0);
	
	return list;
	
}
private void helper(List<List<Integer>> result, List<Integer> list, int k , int t, int[] arr, int start){
	
	if(t == 0 && k == 0){
		result.add(new ArrayList<Integer>(list));
	}
	if(t < 0){
		return;
	}
	for(int i = start; i < arr.length; i++){
		
		list.add(arr[i]);
		helper(result, list, k - 1, t - arr[i], arr, i + 1);
		list.remove(list.size() -1);
	}
	
	
}

}
