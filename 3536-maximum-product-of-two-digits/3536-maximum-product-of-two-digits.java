class Solution {
    public int maxProduct(int n) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        while(n!=0){
            int r=n%10;
            if(max1<=r){
                max2=max1;
                max1=r;
            }
            else if(max2<r)
            max2=r;

            n=n/10;
        }
        return max1*max2;
    }
}