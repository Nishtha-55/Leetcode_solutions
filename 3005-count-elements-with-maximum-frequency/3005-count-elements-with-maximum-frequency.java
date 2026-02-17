class Solution {
    public int maxFrequencyElements(int[] nums) {
      int[] count = new int[101] ;
      int maxfreq=0;
      for(int num:nums)
      {
        count[num]++; // increasing the frequency of num
        maxfreq = Math.max(maxfreq,count[num]);
      } 
        int result=0;
      for(int i=0;i<101;i++)
      {
        if(count[i]==maxfreq)
        {
          result +=maxfreq;
        }
      } 
      return result;
    }
}
//approach 1- (two pass solution)-- take an array of size 101 and store the frequency in it then get the max frequency 
//approach 2- (one pass solution )- initialze maximum frequency with k 
