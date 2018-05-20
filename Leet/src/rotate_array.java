
public class rotate_array {

	public void rotate(int[] arr, int k){
		k %= arr.length;
		reverse(arr , 0 , arr.length - 1);
		reverse(arr , 0 , k - 1);
		reverse(arr , k , arr.length - 1);
		for(int i = 0; i < arr.length ; i++){
			
			System.out.print(" " + arr[i]);
		}
		
	}
	public void reverse(int[] arr , int start, int end){
		while(start < end){
			int temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
			start++;
			end--;
		}
		
	}
	public static void main(String arg[]){
		
		int[] arr = {1,2,3,4,5,6,7};
		
		rotate_array ra = new rotate_array();
		ra.rotate(arr,3);
		
	}
	
}
