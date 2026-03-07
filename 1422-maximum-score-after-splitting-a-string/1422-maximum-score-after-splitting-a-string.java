class Solution {
    public int maxScore(String s) {
        int max=Integer.MIN_VALUE;
        char c1='0';
        char c2='1';
        for(int i =0;i<s.length()-1;i++)
        {
            String l=s.substring(0,i+1);
            String r=s.substring(i+1);
            long zero=l.chars()
              .filter(ch -> ch == c1)
              .count();
              long one=r.chars()
              .filter(ch -> ch == c2)
              .count();
           int score=(int)(zero+one);
           
           max=Math.max(score,max);
        }
        return max;
    }
}