class Solution {
    public int missingNumber(int[] nums) {
        // approach 1
        Arrays.sort(nums);
        int n=nums.length;
        int sum = n*(n+1)/2;
        for(int i=0;i<n;i++)
        {
           sum -=nums[i];
        }
        return sum;
    }
}