class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
        for(int num:nums){
            int n=num;
            while(n!=0){
                int r=n%10;
                if(r==digit)
                count++;
                n=n/10;
            }
        }
        return count;
        
    }
}