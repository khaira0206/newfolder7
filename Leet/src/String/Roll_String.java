package String;

public class Roll_String {

	public static void main(String arg[]){
		Roll_String rs = new Roll_String();
		int[] arr = {3,2,1};
		System.out.println(rs.roll("abz", arr));
	}
	
	public String roll(String str , int[] arr){
		StringBuilder sb = new StringBuilder();
		char[] ch = str.toCharArray();
		for(int i = 0; i < arr.length; i++){
			ch = roll( ch, arr[i]);
		}
	return sb.append(ch, 0, arr.length).toString();
	}
	
	
	private char[] roll(char[] ch, int k){
		
		
		for(int i = 0; i < k; i++){
			if(ch[i] == 'z')
				ch[i] = 'a';
			else
				ch[i]++;
			
		}
		
		return ch;
	}
	
}
