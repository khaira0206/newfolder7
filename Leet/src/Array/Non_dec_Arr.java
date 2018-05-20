package Array;

public class Non_dec_Arr {

	public static void main(String arg[]){
		
		int[] nums = {2,3,4,1,5};
		
		Non_dec_Arr na = new Non_dec_Arr();
		System.out.println(na.checkPossibility(nums));
		
	}
	
	public boolean checkPossibility(int[] nums) {
        int cnt = 0;                                                                    //the number of changes
        for(int i = 1; i < nums.length && cnt<=1 ; i++){
            if(nums[i-1] > nums[i]){
                cnt++;
                if(i-2<0 || nums[i-2] <= nums[i])nums[i-1] = nums[i];  //je piche ale ton chota ee and uston piche ale 
                //ton bda ee then ehi sala panga pa reha ehnu wich ale nu badlo  //modify nums[i-1] of a priority
                else nums[i] = nums[i-1];                              //je uston piche ale ton v chota tan asi
                //kush ni kar sakde bai tainu ee badlna pauga                  //have to modify nums[i]
            }
        }
        return cnt<=1; 
    }
	
}
