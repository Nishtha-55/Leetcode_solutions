class Solution {
    public int totalMoney(int n) {
         int terms = n / 7; // Weeks

        int first = 28;
        int last = 28 + (terms - 1) * 7; // AP formula for n-th term

        int result = terms * (first + last) / 2; // Sum of nth terms in an AP

        // Final week remaining days = n % 7
        int startMoney = 1 + terms;

        for (int day = 1; day <= (n % 7); day++) {
            result += startMoney;
            startMoney++;
        }

        return result;
    }
}

//APPROACH 1 -> SIMULATION
//T.C : O(n)
//S.C : O(1)
/*  int monday=1;
       
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
        return ans;*/

//APPROACH 2 -> ARITHMETIC PROGRESSION
/* 
*/