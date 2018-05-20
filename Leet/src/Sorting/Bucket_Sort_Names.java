package Sorting;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Bucket_Sort_Names {

	public static void main(String[] arg){
		String[] arr ={"harry","singh","no","bye","what","hartlon","byebye","noo","non"};
		Bucket_Sort_Names bs = new Bucket_Sort_Names();
		bs.bucket_Sort_Names(arr);
		for (String str : arr) {
			System.out.println(" " + str);
		}
	}
	
	void bucket_Sort_Names(String[] arr){
		int count = 0, digitCount = 0;
		int largest = arr[0].length();
	
		List<String>[] bucket = new List[26];
		
		for(String str : arr){
			if(str.length() > largest){
				largest = str.length();
			}
		}
		
		for(int passNo = largest - 1; passNo >=0 ; passNo--){
			for(int k = 0 ; k < 26; k++){
				if(bucket[k] != null){
					bucket[k] = null;
				}
			}
			for(int i = 0; i < arr.length; i++){
				int freq = 0;
			if(passNo < arr[i].length()){
				 freq = arr[i].charAt(passNo)- 97;
			
				
				if( freq >= 0 && freq < 26){
					if(bucket[freq] == null){
						bucket[freq] = new LinkedList<>();
					}
					bucket[freq].add(arr[i]);
				}
			}
			else{
					freq = arr[i].charAt(arr[i].length()-1) - 97;
					if(bucket[freq] == null){
						bucket[freq] = new LinkedList<>();
					}
					bucket[freq].add(arr[i]);
				}
			
			
			}
			int l = 0;
			for(int k = 0; k < 26; k++){
				
				if(bucket[k] != null){
					
				for(String str : bucket[k]){
					arr[l++] = str;
					
				}
				}
			}
			
		}
		
	}
	
}
