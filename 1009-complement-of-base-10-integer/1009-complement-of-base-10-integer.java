class Solution {
    public int bitwiseComplement(int n) 
    {
        int i=0;
        int result=0;
        if(n==0)
        return 1;
        while(n>0){
            int rem=n%2;
            result += ((1-rem )*(Math.pow(2,i)));
            n=n/2;
            i++;

        }
        return result;
    }
}