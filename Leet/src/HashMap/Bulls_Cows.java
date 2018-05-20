package HashMap;

class Result{
	int bulls = 0;
	int cows = 0;
	
	public String toString(){
		return " Bulls "+ bulls  +" Cows "+ cows ;
	}
}

public class Bulls_Cows {
	
	public static void main(String[] arg){
		
		Bulls_Cows bc = new Bulls_Cows();
		System.out.println(bc.CountBC("1778", "8787"));
		
	}
	
	public Result CountBC(String guess, String result){
		
		Result res = new Result();
		if(guess.length() != result.length()){
			return null;
		}
		
		int[] freq = new int[10];
		for(int i = 0; i < guess.length(); i++){
		int g = Character.getNumericValue(guess.charAt(i));
		int r = Character.getNumericValue(result.charAt(i));
		if(g == r){
			res.bulls++;
		}
		else{
			freq[r]++;
		}
		}
		
		for(int i = 0; i < guess.length(); i++){
			int g = Character.getNumericValue(guess.charAt(i));
			int r = Character.getNumericValue(result.charAt(i));
			if(freq[g] > 0 && g != r){
				res.cows++;
				freq[g]--;
			}
		}
		return res;
	}
	
}
