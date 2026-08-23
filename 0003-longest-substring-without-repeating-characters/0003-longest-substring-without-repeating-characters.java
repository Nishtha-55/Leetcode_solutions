class Solution {
    public int lengthOfLongestSubstring(String s) {
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
    }
}