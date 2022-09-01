class Solution {
    public void setZeroes(int[][] mat) {
      
      int r=mat.length, c=mat[0].length;
      boolean isVisited[][]=new boolean[r][c];
        
        for(int i=0; i<r; i++)
          for(int j=0; j<c; j++)
          {
            if(mat[i][j]==0 && !isVisited[i][j])
            {
              for(int ti=0; ti<r; ti++)
              {
                if(mat[ti][j]==0)
                  continue;
                mat[ti][j]=0;
                isVisited[ti][j]=true;
              }
              
              for(int tj=0; tj<c; tj++)
              {
                if(mat[i][tj]==0)
                  continue;
                mat[i][tj]=0;
                isVisited[i][tj]=true;
              }
            }
          }
    }
}