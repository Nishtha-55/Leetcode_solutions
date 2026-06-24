class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> s=new HashSet<>();
        for(int n:nums){
            if(!s.add(n))
            return n;
        }
        return 0;
    }
}