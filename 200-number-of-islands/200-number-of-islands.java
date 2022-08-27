class Solution {
  static boolean isValid(int i, int j, int n, int m, char grid[][])
  {
    return (i>=0 && i<n && j>=0 && j<m && grid[i][j]=='1');
  }
  
  static void helper(char[][] grid, int i, int j, int n, int m)
  {
    grid[i][j]='0';
    
    if(isValid(i+1,j,n,m,grid))
      helper(grid,i+1,j,n,m);
    
    if(isValid(i-1,j,n,m,grid))
      helper(grid,i-1,j,n,m);
    
    if(isValid(i,j+1,n,m,grid))
      helper(grid,i,j+1,n,m);
    
    if(isValid(i,j-1,n,m,grid))
      helper(grid,i,j-1,n,m);
  }
  
    public int numIslands(char[][] grid) {
      int n=grid.length, m=grid[0].length, cnt=0;
      
      for(int i=0; i<n; i++)
        for(int j=0; j<m; j++)
          if(grid[i][j]=='1')
          {
            cnt++;
            helper(grid,i,j,n,m);
          }
      return cnt;
    }
}