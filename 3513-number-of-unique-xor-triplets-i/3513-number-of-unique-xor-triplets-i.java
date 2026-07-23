class Solution {
    public int uniqueXorTriplets(int[] nums) {
        //complexity = o(log n)
        int ans=1;
        int n=nums.length;
        if(n<=2)
        return n;
        while(ans<=n){
            ans *=2;
        }
    return ans;
    }
}

//APPROACH 2
/* int mask=0;
    for(int num:nums){
        mask |= num;
    }
    return mask+1;*/