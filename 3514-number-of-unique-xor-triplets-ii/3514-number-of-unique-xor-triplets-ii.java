class Solution {
    public int uniqueXorTriplets(int[] nums) {
         int n = nums.length;
        
        if(n < 3) {
            HashSet<Integer> set = new HashSet<>();

            for(int num : nums) {
                set.add(num);
            }

            return set.size();
        }

        boolean[] pairXor = new boolean[2048];

        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                pairXor[nums[i] ^ nums[j]] = true;
            }
        }

        boolean[] ans = new boolean[2048];

        for(int i=0; i<2048; i++) {
            if(!pairXor[i]) continue;

            for(int num : nums) {
                ans[i ^ num] = true;
            }
        }

        int count = 0;

        for(boolean present : ans) {
            if(present) count++;
        }

        return count;
    }
}

// brute force se time limit exceed ho jayegi 