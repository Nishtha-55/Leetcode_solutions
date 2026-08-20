class Solution {
    public int[] twoSum(int[] nums, int target) {
       //APPROACH 2
       int n=nums.length;
       Map<Integer,Integer> mp=new HashMap<>();
       for(int i=0;i<n;i++){
            int remaining = target - nums[i];
            if (mp.containsKey(remaining)) {
                return new int[]{mp.get(remaining), i};
            }
            
            mp.put(nums[i], i);
       }
       return new int[]{};
    }
}

// APPROACH 1 - BRUTE FORCE
/*  for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target)
                {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; */