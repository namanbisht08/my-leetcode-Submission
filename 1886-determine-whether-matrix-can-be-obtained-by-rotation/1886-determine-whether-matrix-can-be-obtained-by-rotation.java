class Solution {
    public void rotation(int[][]mat)
    {
       int temp,n=mat.length;
     
        //transpose of a matrix without using any extra space
        for(int i=0;i<n;i++)
        for(int j=0;j<i;j++)
        {
          temp = mat[i][j];
          mat[i][j] = mat[j][i];
          mat[j][i] = temp;
         }
        
        //swap rows of transpose mat to get final answer
         for(int i=0;i<n; i++)
            //2nd catch is j will go halfoflength
            for(int j=0;j<mat[0].length/2;j++)
            {
                temp =0;
                temp = mat[i][j];
                mat[i][j]=mat[i][n-1-j];
                mat[i][n-1-j]=temp;
            }
    }
    
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0; i<4; i++)
        {
            rotation(mat);
            if(java.util.Arrays.deepEquals(mat,target))
                return true;
        }
        return false;
    }
}