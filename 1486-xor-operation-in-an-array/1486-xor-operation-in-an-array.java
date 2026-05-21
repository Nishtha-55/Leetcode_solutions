class Solution {
    public int xorOperation(int n, int start) {
        int nums[]=new int[n];
        int i=0;
        int c=n;
        while(c!=0)
        {
            nums[i]=start + 2 * i ;
            i++;
            c--;
        }
        /*for(int i=start;i<n;i++)
        {
            nums[i]=start + 2 * i ;
        }*/
         int result=0;
        for(int j=0;j<n;j++)
        {
            result=result^nums[j];
        }
        return result;
    }
}