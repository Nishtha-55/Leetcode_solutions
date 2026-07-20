class Solution {
    public int concatenatedBinary(int n) {
    int digit=0;
    long res=0;
    int M=1000000007;
for(int i=1;i<=n;i++){
    if((i & (i-1))==0)
    digit++;
 res = ((res<<digit) % M + i)% M ;
   }
     return (int)res;
    }
}

//approach2
/*  int M=1000000007;
     long res=0;
     for(int i=1;i<=n;i++){
        int digit=(int)(Math.log(i) / Math.log(2)) + 1;
        res = ((res<<digit) % M + i)% M ;
     }
     return (int)res;*/