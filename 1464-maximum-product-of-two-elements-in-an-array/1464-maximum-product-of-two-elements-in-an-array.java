
class Solution {
    public int maxProduct(int[] nums) {
       /* int largest=0;
        int n= nums.length;
        int second_largest=0;
    
        for(int num:nums)
        {
          if(num>largest)
          {
            second_largest=largest;
            largest=num;
          }
          else
          {
            second_largest=Math.max(second_largest,num);

          }
        }
        return (largest-1)*(second_largest-1);*/
        Arrays.sort(nums);
        int n=nums.length;
        return (nums[n-1]-1)*(nums[n-2]-1);
    }
}
// find largest and second largest element and multiply them