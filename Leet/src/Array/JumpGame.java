package Array;

public class JumpGame {

	public static void main(String arg[]){
		JumpGame jump =  new JumpGame();
		int[] A = {3,3,1,0,4};
		System.out.println(jump.jump(A));
				
	}
	
	public boolean jump(int[] arr){
	
		int reachable = 0;
		
		for(int i = 0; i < arr.length; i++){
			if(i > reachable){
				return false;
			}
			reachable = Math.max(reachable, i + arr[i]);
		}
		
	return true;
	
	}
	
}
