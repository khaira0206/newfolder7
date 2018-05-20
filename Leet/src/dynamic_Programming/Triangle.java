package dynamic_Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle {

	public static void main(String arg[]){
		Triangle tr = new Triangle();
		
		List<List<Integer>> triangle = new ArrayList<>();
		List list1 = new ArrayList<Integer>(Arrays.asList(2));
		List list2 = new ArrayList<Integer>(Arrays.asList(3,4));
		List list3 = new ArrayList<Integer>(Arrays.asList(6,5,7));
		List list4 = new ArrayList<Integer>(Arrays.asList(4,1,8,3));
		
		triangle.add(list1);
		triangle.add(list2);
		triangle.add(list3);
		triangle.add(list4);
		tr.minimumTotal(triangle);
		//System.out.println(tr.minimumTotal(triangle));
	}
	
	public int minimumTotal(List<List<Integer>> triangle) {
		//System.out.println(triangle.size());
	    int[] A = new int[triangle.size()+1];
	    for(int i=A.length-1;i>=0;i--){
	    System.out.println(A[i]);
	    }
	    
	    for(int i=triangle.size()-1;i>=0;i--){
	        for(int j=0;j<triangle.get(i).size();j++){
	            A[j] = Math.min(A[j],A[j+1])+triangle.get(i).get(j);
	        }
	    }
	    return A[0];
	}
	
}
