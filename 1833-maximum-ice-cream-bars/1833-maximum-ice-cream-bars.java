class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count=0;int sum=0;
        for(int cost:costs){
            if(sum+cost<=coins)
            {
                sum +=cost;
                count++;
            }
        }
        return count;
    }
}