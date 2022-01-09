class Solution {
    public int[][] rotation(int[][]mat)
    {
        int n=mat.length;
         int rotmat[][]=new int[n][n];
        for(int i=0,k=n-1; i<n; i++,k--)
            for(int j=0; j<n; j++)
            {
                rotmat[j][k]=mat[i][j];
            }
        
        return rotmat;
    }
    
    public boolean findRotation(int[][] mat, int[][] target) {
        int rotmat[][]=rotation(mat);
        if(java.util.Arrays.deepEquals(rotmat,target))
            return true;
        for(int i=0; i<3; i++)
        {
            rotmat=rotation(rotmat);
            if(java.util.Arrays.deepEquals(rotmat,target))
                return true;
        }
        return false;
    }
}