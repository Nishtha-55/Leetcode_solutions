class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int r=0;int n=nums.length;int count;
      for(int i=0;i<n;i++){
        count=0;
        for(int j=i;j<n;j++){
             
            if(nums[j]==target)
            count++;
        
            if(count>((j-i+1)/2))
            r++;

        }
      }
      return r;
    }
}