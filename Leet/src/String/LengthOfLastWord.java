package String;

public class LengthOfLastWord {

	
	public static void main(String arg[]){
		
		String s = "Hello World";
		LengthOfLastWord ll = new LengthOfLastWord();
		System.out.println(ll.lengthOfLastWord(s));
		
	}
	
	public int lengthOfLastWord(String s) {
	    return s.trim().length()-s.trim().lastIndexOf(" ")-1;
	}
	
}
