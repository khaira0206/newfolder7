package String;

public class ReverseWordsInStringIII {

	public static void main(String args[]) {

		ReverseWordsInStringIII rs= new ReverseWordsInStringIII();
		
		String s = "   Let's take LeetCode contest  ";
		s = rs.reverseWords(s);
		System.out.println(s); 
		
	}

	public String reverseWords(String s) {
		String[] str = s.split(" ");

		for (int i = 0; i < str.length; i++)
			str[i] = new StringBuilder(str[i]).reverse().toString();

		StringBuilder result = new StringBuilder();

		for (String st : str)
			result.append(st + " ");

		return result.toString().trim();
	}

}
