class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count=0;
for(int cost:costs){
    if(cost>coins)
    return count;
    else
    count++;
    coins -=cost;
}
   return count;   
    }
}

//APPROACH 2
/*  for(int cost:costs){
            if(sum+cost<=coins)
            {
                sum +=cost;
                count++;
            }
        }
        return count;*/