package dynamic_Programming;

public class Num_Unique_BST {

	public static void main(String arg[]){
		Num_Unique_BST dw = new Num_Unique_BST();
		int num = 3;
		System.out.println(dw.numTrees(num));
	}
	
	int numTrees(int n) {
	    //cantalan树
	    //C(2n,n)/(n+1)
	     long ans =1;
	    for(int i=n+1;i<=2*n;i++){
	        ans = ans*i/(i-n);
	    }
	    return (int)ans/(n+1);
	}
	
}
