package String;

import java.util.stream.Stream;

public class ComplexNumberMul {

	public static void main(String args[]){
		String a = "-1+    2i";
		String b = "0 + 2    i";
		
		ComplexNumberMul cn = new ComplexNumberMul();
		String str = cn.complexNumberMultiply(a, b);
		
		System.out.println(str);
	}
	
	 public String complexNumberMultiply(String a, String b) {
	        int[] valA = getValue(a);
	        int[] valB = getValue(b);
	        
	        int real = valA[0] * valB[0] - valA[1] * valB[1];
	        int img = valA[0] * valB[1] + valA[1] * valB[0];
	        
	        if(img < 0)
	        return real +""+ img + "i";
	        else
	        	 return real + "+" + img + "i";
	    }
	    
	    private int[] getValue(String s) {
	        String[] str = s.split("\\+|i", 0);
	        int[] val = new int[2];
	        System.out.println(str[0] +" "+ str[1]);
	        val[0] = Integer.valueOf(str[0].trim());
	       
	        val[1] = Integer.parseInt(str[1].trim());
	        
	        return val;
	    }
}
