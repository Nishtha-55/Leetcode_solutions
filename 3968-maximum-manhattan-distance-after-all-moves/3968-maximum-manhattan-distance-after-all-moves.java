class Solution {
    public int maxDistance(String moves) {
        int u=0,d=0,l=0,r=0;
        int dash=0;
        int s=0;
        for(char c:moves.toCharArray()){
            if(c=='L') 
            l++;
            else if(c=='R')
            r++;
            else if(c=='U')
            u++;
           else if(c=='D')
            d++;
            else
            dash++;
        }
        int x=r-l;
        int y=u-d;

        return Math.abs(x)+Math.abs(y)+dash;
    }
}