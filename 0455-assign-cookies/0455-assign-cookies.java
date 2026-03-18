class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count =0;
       Arrays.sort(s);
       Arrays.sort(g);
       int j=0;
       int i=0;
       while(i<g.length && j<s.length)
       {
        if(s[j]>=g[i])
        {
            count++;
            i++;
        }
        j++; //increase the j and check for satisfactory element available 
        }
        return count;
    }
}