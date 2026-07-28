class Solution {
    public String smallestPalindrome(String s) {
        //find length of array 
        int n=s.length();
        //find mid 
        int mid=n/2;
        //convert given string into character array for sorrting purpose 
        char c[]=s.toCharArray();
//sort the first half of the array lexicographically 
        Arrays.sort(c,0,mid);
    //now mirror the sorted part to make it palindrome
        for(int i=0;i<n;i++){
            c[n-1-i]=c[i];
        }
        //convert array back to string and return 
        return String.valueOf(c);
    }
}