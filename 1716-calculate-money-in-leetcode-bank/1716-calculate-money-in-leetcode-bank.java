class Solution {
    public int totalMoney(int n) {
        int monday=1;
       
        int ans=0;
        while(n>0){
          int money=monday;
          for(int day=1;day<=Math.min(n,7);day++){
            ans +=money;
            money++;
          }
          n=n-7;
          monday++;
        }
        return ans;
    }
}