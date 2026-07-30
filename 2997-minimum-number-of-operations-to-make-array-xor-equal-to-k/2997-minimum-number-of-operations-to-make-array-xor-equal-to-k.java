class Solution {
    public int minOperations(int[] nums, int k) {
        int totalXor=0;
        for(int n:nums){
            totalXor ^=n;
        }
        int diff = totalXor ^ k;
        return Integer.bitCount(diff);
    }
}