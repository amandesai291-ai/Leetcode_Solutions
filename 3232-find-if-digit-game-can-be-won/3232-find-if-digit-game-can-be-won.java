class Solution {
    public boolean canAliceWin(int[] nums) {
        
        int onesum = 0 ;
        int  dubleSum = 0;
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i]<10)
            {
                onesum += nums[i];
            }else{
                dubleSum += nums[i];
            }     
            
        }

        if(onesum > dubleSum || dubleSum > onesum)
        {
            return true;
        }else{
            return false;
        }

        // return dubleSum != onesum;
    }
}