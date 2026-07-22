class Solution {
    public int[] xorQueries(int[] arr, int[][] queries)
     {
        // Create a result array
        int a[]=new int[queries.length];
        // Create an array to store the cumulative XOR values.
        int pref[]=new int[arr.length];
        pref[0]=arr[0];

         // Calculate the cumulative XOR values for the array.
        for(int i=1;i<arr.length;i++){
              pref[i] = pref[i-1] ^ arr[i];
        }

        // Process each query
        for(int i=0;i<queries.length;i++)
        {
           int l=queries[i][0];
           int r=queries[i][1];
           // Calculate the XOR for the subarray from L to R.
             a[i] = pref[r] ^(l == 0 ? 0 : pref[l - 1]);
        }
        return a;
    }
}