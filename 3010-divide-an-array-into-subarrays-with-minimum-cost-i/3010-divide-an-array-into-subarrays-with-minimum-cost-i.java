class Solution {
    public int minimumCost(int[] nums) {
        int n=nums.length;
int sum=nums[0];
int min=Integer.MAX_VALUE;
int sec_min=Integer.MAX_VALUE;;
for(int i =1;i<n;i++)
{
    if(nums[i]<min)
    {
        sec_min=min;
        min=nums[i];
    }
    else if(nums[i]<sec_min)
    {
        sec_min=nums[i];
    }
}
return sum+min+sec_min;
    }
}