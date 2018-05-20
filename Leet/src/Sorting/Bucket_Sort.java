package Sorting;

public class Bucket_Sort {

	public static void main(String[] arg) {

		int[] array = { 88, 1, 3, 22, 1, 5, 4, 9, 6, 71 };
		Bucket_Sort bs = new Bucket_Sort();
		bs.Bucket_Sort(array);
		for (int arr : array) {
			System.out.print(" " + arr);
		}
	}

	void Bucket_Sort(int[] arr) {
	int[][] bucket = new int[10][20];
	int[] buckCount = new int[10];
	int digitCount =  0, divisor = 1,largest = arr[0];
	
	for(int i = 1; i < arr.length; i++){
		if(arr[i] > largest){
			largest  = arr[i];
		}
	}
	while(largest > 0){
		digitCount++;
		largest /= 10;
	}
	
	for(int passNo = 0; passNo < digitCount; passNo++){
		
		for(int i = 0; i < 10; i++){
			buckCount[i] = 0;
		}
		
		for(int k = 0; k < arr.length; k++){
			int r = (arr[k] / divisor) % 10;
			bucket[r][buckCount[r]++] = arr[k];
		}
		int i = 0;
		for(int j = 0; j < 10; j++){
			for(int k = 0; k < buckCount[j]; k++){
				arr[i++] = bucket[j][k];
			}
		}
		divisor *=10;
		
	}
	}

}
