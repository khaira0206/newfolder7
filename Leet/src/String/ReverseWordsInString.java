package String;

import java.util.Stack;

public class ReverseWordsInString {

	public static void main(String args[]) {

		ReverseWordsInString rs= new ReverseWordsInString();
		
		String s = "         Let's    take LeetCode contest  ";
		String str = rs.reverseWords(s);
		System.out.println(str); 
		
	}
	
	String reverseWords(String str){
		
		String[] arr = str.split(" ");
		String out = "";
		for(int i = arr.length - 1; i >=0; i--){
			out += arr[i] + " "; 
		}
		return out;
	}
	
	
	
}
