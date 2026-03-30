class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
        return false;
        return (n & (n-1))==0;
                            
/*`&&`      Logical AND ->  Works with boolean (`true/false`) 
   &`      Bitwise AND  -> Works with bits (integers) */
    }
}

//Approach 2
/* for (int i = 0; i < 31; i++) {
            int ans = (int) Math.pow(2, i);
            if (ans == n) {
                return true;
            }
        }
        return false;  */


//Approach 3
/* built in functions _ Integer.bitcount in java and __builtin.popcount(n) in cpp*/


//Approach 4
/* normal while loop */