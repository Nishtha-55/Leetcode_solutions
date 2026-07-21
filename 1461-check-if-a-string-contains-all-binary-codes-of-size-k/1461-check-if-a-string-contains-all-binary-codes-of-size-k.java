class Solution {
    public boolean hasAllCodes(String s, int k) {
        int codes=(int)Math.pow(2,k);
        HashSet<String> st=new HashSet<>();
        for(int i=k;i<=s.length();i++)
        {
            String sub=s.substring(i-k,i);
            if(!st.contains(sub))
            {
                st.add(sub);
                codes--;
            }
             if(codes==0)
              return true;
        }
      
        return false;
    }
}