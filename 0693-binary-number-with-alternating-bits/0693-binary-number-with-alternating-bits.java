class Solution {
    public boolean hasAlternatingBits(int n) {
        int currentbit=n%2;
        n=n/2;
        while(n>0){
            if(currentbit == n%2)
            {return false;}
            currentbit = n%2;
            n=n/2;
        }
        return true;
    }

}
//take currentbit = 2%n --- store it 
// upadate the number n=n/2
// chaeck if curentbit is not equal to nextbit ---decimal to binary appraoch



//APPROACH 2
// use shifting and XOR
// result = n & (n>>1)
// check if all the bits are set in the result or not 
// to check -- result & (result+1) == 0 ---- true else false 
// shifting operations and XOR operations constant time me complete hote hai so time complexity will be O(1)

