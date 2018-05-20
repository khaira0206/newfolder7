package String;

import java.util.LinkedList;

public class RomanInt {
	
	String[] small = {"Zero","I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII",
			"XIV","XV","XVI","XVII","XVIII","XIX"};
	String[] tens = {"","","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
	String[] bigs = {"","M","MM"};
	String hundred = "C";
	String negative = "Negative";
	
	public static void main(String[] args){
		
		int num = 19323984;
		RomanInt ei = new RomanInt();
		System.out.println(ei.convert(num));
		
	}
	
	String convert(int num){
	
		if(num == 0){
			return small[0];
		}
		if(num < 0){
			return negative + " " + convert(-1 * num);
		}
		LinkedList<String> parts = new LinkedList<String>();
		int count = 0;
		
		while(num > 0){
			
			String chunk = convertChunk(num % 1000) + " " + bigs[count];
			parts.addFirst(chunk);		
			count++;
			num /=1000;
		}
		
		return convertToString(parts);
	}
	
	String convertChunk(int num){
		LinkedList<String> parts = new LinkedList<String>();
		if(num > 100){
			parts.addLast(small[num/100]);
			parts.addLast(hundred);
			num %= 100;
			
		}
		if(num >=20 && num <= 90){
			parts.addLast(tens[num/10]);
            num %= 10;
		}
		if(num >=10 && num <=19){
			parts.addLast(small[num]);
		}
		if(num >=1 && num <=9){
			parts.addLast(small[num]);
		}
		return convertToString(parts);
	}
	
	String convertToString(LinkedList<String> list){
		StringBuilder sb = new StringBuilder();
		while(list.size() > 1){
			sb.append(list.pop());
			sb.append(" ");
		}
		sb.append(list.pop());
		return sb.toString(); 
	}
	
}
