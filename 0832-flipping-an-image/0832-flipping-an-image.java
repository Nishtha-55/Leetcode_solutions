class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row=image.length;
        int cols=image[0].length;
        int[][]res=new int[row][cols];
    
    for(int i=0;i<row;i++){
        for(int j=0;j<cols;j++){
            res[i][j]=image[i][cols-j-1];
        }
    }
    for(int i=0;i<row;i++){
        for(int j=0;j<cols;j++){
            res[i][j]=res[i][j]==1?0:1;
        }
    }
    return res;
}
}