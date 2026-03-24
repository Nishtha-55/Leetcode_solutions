class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int res[]=new int [2*n];
        int k=0;
        for(int i=0;i<res.length;i++){
            if(i<n)
            res[i]=nums[i];
            else
            {
                res[i]=nums[k];
                k++;
            }
        }
        return res;
    }
}
/* better approach. 
       for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }*/ 