class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long m=mass; //to avoid problem dur to large mass
        for(int ast:asteroids){
            if(m<ast)
           return false;
           m +=ast; 
           }
        return true;
    }
}

//to avoid integer overflow 
// else if(m>Math.pow(10,5))
          // return true;