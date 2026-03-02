class Solution {
    public int minimumDifference(int[] nums, int k) 
    {
       
        int max;
        int min;
        Arrays.sort(nums);
         int dif=Integer.MAX_VALUE;
        int i=0;
        int j=k-1;
        while(j<nums.length)
        {
              max=nums[j];
                min=nums[i];
                dif=Math.min(dif,max-min);
                i++;
                j++;
        }   
        return dif;
    }
}
//simplified code --- 
/* for(int i= k-1;i<n;i++)
{
    min= nums[i-k+1]
    max=nums[i];
    diff = Math.min(diff,max-min);
}*/