package Array;

public class Search_In_Rot_Arr {

	
	public static void main(String args[]){
		Search_In_Rot_Arr sira = new Search_In_Rot_Arr();
		int[] arr = {4,5,6,7,8,1,2,3};
		System.out.println(sira.search(arr, 1, 0, arr.length));
	}
	
	public int search(int[] a , int x, int left, int right){
		
		if(left > right) return -1;
		int mid = (left + right) / 2; 
		
		if(a[mid] == x){
			return mid;
		}
		
		if(a[mid] > a[left]){ // left is sorted
			if(a[mid] > x && x >= a[left]){
				return search(a, x, left, mid -1);
			}
			else{
				return search(a, x, mid + 1, right);
			}
		}
		else if(a[mid] < a[left]){ // right is sorted 
			if(a[mid] < x && x <= a[right]){
				return search(a, x, mid + 1, right);
			}
			else{
				return search(a, x, left, mid - 1);
			}
		}
		else if(a[left] == a[mid]){ // left is all repeats
			
			if(a[mid] != a[right]){
				
				return search(a, x, mid + 1, right);
			}
			else{                   // left and right are both repeats
				int result = search(a, x, left, mid - 1);
				if(result == -1){
					return search(a, x, mid + 1, right);
				}
				else{
					return result;
				}
			}
		}
		
		return -1;
	}
	
}
