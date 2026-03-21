class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int startcol=y;
        int endcol=y+k-1;
        int startrow=x;
        int endrow=x+k-1;
        for(int i=startrow;i<=endrow;i++)
        {
            for(int j=startcol;j<=endcol;j++)
            {
                int temp=grid[i][j];
                grid[i][j]=grid[endrow][j];
                grid[endrow][j]=temp;

            }
            endrow--;
        }
        return grid;
    }
}