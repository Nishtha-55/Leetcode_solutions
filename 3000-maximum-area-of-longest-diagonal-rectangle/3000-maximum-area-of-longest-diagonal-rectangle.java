class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiagonal=0;int maxArea=0;int d;
        for(int i=0;i<dimensions.length;i++){
            int l=dimensions[i][0];
            int w=dimensions[i][1];
         d=((int)Math.pow(dimensions[i][0],2))+((int)Math.pow(dimensions[i][1],2));
         int a= l*w;
         if(d>maxDiagonal)
         {maxDiagonal=d;
         maxArea=a;}
        else if(d==maxDiagonal)
         maxArea=Math.max(a,maxArea);
        }
        return maxArea;
    }
}