class Solution {
    public int repeatedNTimes(int[] nums) {
        //Approch 1
       /* for(int i=2;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1]||nums[i]==nums[i-2])
            return nums[i];
        }
return nums[0]; */

        //approch 4 
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            if(!set.add(num))
            return num;
        }
        return -1;
    }
}



