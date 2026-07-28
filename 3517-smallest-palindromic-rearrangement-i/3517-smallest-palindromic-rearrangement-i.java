class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        int mid=n/2;
        char c[]=s.toCharArray();
        Arrays.sort(c,0,mid);
        for(int i=0;i<n;i++){
            c[n-1-i]=c[i];
        }
        return String.valueOf(c);
    }
}