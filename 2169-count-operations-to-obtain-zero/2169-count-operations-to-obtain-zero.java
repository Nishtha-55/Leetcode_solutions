class Solution {

    public int countOperations(int num1, int num2) {
     int res = 0;
        while (num1 != 0 && num2 != 0) 
        {
            res += num1 / num2;
            num1 %= num2;
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        return res;
    }
}

//brut force technique but time limit exceeds
/* int flag=0;
        while(num1!=0||num2!=0)
        {
           if(num1>=num2){
            num1=num1-num2;
            flag++;
           }
           else{
             num2=num2-num1;
            flag++;
           }
        }
        return flag;*/
