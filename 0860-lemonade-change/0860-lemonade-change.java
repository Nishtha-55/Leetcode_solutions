class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten =0;
        for(int bill:bills)
        {
            if(bill==5)
            {
                five ++;    
            }
            else if (bill==10)// return 5$ to customer 
            {
                if(five>0)
                {five --;
                ten++;}
                else
                return false;
            }
            else if (five >0 && ten>0) // return 15$ to customer 
            {
                five--; 
                ten--; 
            }
            else if (five >=3 )//20 $ case 
            { five= five-3;}
            else
            {return false;}
        }
        return true;

        }
    }       
    

//normally take count for the five, ten dollar respectively and increment them on getting .while receiving ten dollars --- decreament and increament the flags accordingly using if conditions 