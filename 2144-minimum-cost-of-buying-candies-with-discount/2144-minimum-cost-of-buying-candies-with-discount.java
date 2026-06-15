class Solution {
    public int minimumCost(int[] cost) {

      int ans=0;

        Arrays.sort(cost);
        for(int i=0;i<cost.length/2;i++){
            int t =cost[i];
            cost[i]=cost[cost.length-1-i];
            cost[cost.length-1-i]=t;
        }
        for(int i=0;i<cost.length;i++)
        { 
            if(i%3!=2)
            ans += cost[i];
        }
        return ans;
    }
} 