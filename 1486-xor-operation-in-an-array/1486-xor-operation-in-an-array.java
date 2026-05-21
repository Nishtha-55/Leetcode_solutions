class Solution {
    public int xorOperation(int n, int start) {
        int nums[]=new int[n];
        int i=0;
        int c=n;
int result=0;
        while(c!=0)
        {
            nums[i]=start + 2 * i ;
             result=result^nums[i];
            i++;
            c--;
        }
       /*  int result=0;
        for(int j=0;j<n;j++)
        {
            result=result^nums[j];
        }*/
        return result;
    }
}