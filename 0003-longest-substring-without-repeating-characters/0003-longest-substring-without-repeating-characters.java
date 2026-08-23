class Solution {
    public int lengthOfLongestSubstring(String s) {
      Map<Character,Integer> mp=new HashMap<>();
      int left=0;
      int right=0;
      int max=0;
      while(right<s.length()){
        char curr=s.charAt(right);
        if(mp.containsKey(curr)){
            int lastindex=mp.get(curr);
           int newleft= lastindex +1;
        
        if(left<newleft){
            left=newleft;
        }}
        mp.put(curr,right);
         int l=right-left+1;
            max=Math.max(l,max);
            right++;
      }
       return max;
    }
}





//APPROCH 1--- array -- two pointer 
/*
  int left=0;
        int right=0;
        int n=s.length();
        int[] ch =new int[256];
        int max=0;

        while(right<n){
            char current=s.charAt(right);
            int curr=(int)current;
            ch[curr]++;

            while(ch[curr]>1){
                char leftchar=s.charAt(left);
                int lc=(int)leftchar;
                ch[lc]--;

                left++;
            }
            int l=right-left+1;
            max=Math.max(l,max);
            right++;

        }
        return max;
        
        */