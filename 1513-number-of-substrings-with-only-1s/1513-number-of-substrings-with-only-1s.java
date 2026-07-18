class Solution {
    public int numSub(String s) {

    //By using a sliding window approach, we can efficiently keep track of this count.
        long result=0,mod = 1000000007;
        long count=0;
        for(int i=0;i<s.length();i++){
          if(s.charAt(i)=='1')
          {count++;
          result =(result+count)%mod;}
          else
          count=0;

        }
        return (int)result;
    }
}
//Use modular addition function to safely add the current count of substrings to total, ensuring to take modulo (10^9 + 7) to prevent overflow.