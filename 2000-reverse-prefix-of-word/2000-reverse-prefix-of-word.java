class Solution {
    public String reversePrefix(String word, char ch) {
       int j=word.indexOf(ch);
       char c[]=word.toCharArray();




       int start=0;
       int last = j;
       while(start<last)
       {
        char temp=c[start];
        c[start]=c[last];
        c[last]=temp;
        start++;
        last--;
       }
   String result = new String(c);
    return result;
    }
}