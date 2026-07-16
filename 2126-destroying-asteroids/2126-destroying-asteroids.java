class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        int m=mass; //to avoid problem dur to large mass
        for(int ast:asteroids){
            if(m<ast)
           return false;
           else if(m>Math.pow(10,5))
           return true;
           m +=ast; 
           }
        return true;
    }
}

//to avoid integer overflow 