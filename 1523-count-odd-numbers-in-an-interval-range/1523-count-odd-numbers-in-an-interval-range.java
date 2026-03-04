class Solution {
    public int countOdds(int low, int high) {
        if(low%2==0)
        low++;
        if(high%2==0)
        high--;
        int flag =(high-low)/2 +1;       
        return flag;
    }
}
//due the constatints above solution is not feasible
 /*int flag=0;
        for(int i =low;i<=high;i++)
        {
            if(i%2!=0)
            flag++;

        }*/