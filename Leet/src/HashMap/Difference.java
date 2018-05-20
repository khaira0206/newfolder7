package HashMap;

public class Difference {

	public static void main(String[] arg){
		
		String s = "abcd";
		String t = "abcde";
		Difference df = new Difference();
		char ans = df.findTheDifference(s, t);
		
		System.out.println(ans);
		
}
	
		public char findTheDifference(String s, String t) {
	        int charCode = t.charAt(s.length());
	        // Iterate through both strings and char codes
	        for (int i = 0; i < s.length(); ++i) {
	              charCode -= (int)s.charAt(i);
	              charCode += (int)t.charAt(i); 
	        }
	        return (char)charCode;
		}
}
