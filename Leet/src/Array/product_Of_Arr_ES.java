package Array;

public class product_Of_Arr_ES {

	
	public int[] prod_Of_Array(int arr[]){
		
		int prod = 1;
		int [] res = new int[arr.length];
		for(int i = 0 ; i < arr.length; i++){
			
			prod *= arr[i];
		}
		
		for(int i = 0; i < arr.length; i++){
			res[i] = prod / arr[i];
		}
		
		return res;
		
	}
	
	
	public static void main(String arg[]){
		
		product_Of_Arr_ES poa = new product_Of_Arr_ES();
		
		int[] arr = {1,2,3,4};
		
		arr = poa.prod_Of_Array(arr);
    for(int i = 0 ; i < arr.length; i++){
			
	System.out.println(arr[i]);
		}
	
		
	}
}
