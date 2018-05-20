package String;

public class StringCompression {

	public static void main(String arg[]){
		StringCompression sc = new StringCompression();
		char[] str = {'a','a','b','b','c','c','c'};
		sc.compress(str);
	}
	
	public int compress(char[] str){
		
		int k = 0;
		for(int i = 0; i < str.length; i++){
			int j = 1;
			str[k++]  =str[i];
			while(i+1 != str.length && str[i] == str[i+1]){
				j++;
				i++;
			}
			char[] arr1 = String.valueOf(j).toCharArray();
			for(int l = 0; l< arr1.length; l++ ){
				str[k++] = arr1[l]; 
			}
		}
		for(int i = 0; i < str.length; i++){
			System.out.print(str[i]);
		}
	     return k;
		
	}
	
}
