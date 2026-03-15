class Solution {
    public boolean isArraySpecial(int[] nums) {
        for(int i =0;i<nums.length-1;i++)
        {
            if((nums[i]%2==0)&& (nums[i+1]%2==0))
            return false;
            if((nums[i]%2!=0)&& (nums[i+1]%2!=0))
              return false;
        }
        return true;
    }
}
//adjacent bits should be of different parity 
//brute force 
//