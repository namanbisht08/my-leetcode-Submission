// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static void helper(int[][] m, int n, ArrayList<String> ans, boolean[][] isVisited, String path, int i, int j)
    {
        //base
        if(i==n-1 && j==n-1)
        {
            ans.add(path);
            return;
        }
        
        //down
        if(i+1<n && isVisited[i+1][j]==false && m[i+1][j]==1)
        {
            isVisited[i][j]=true;
            helper(m,n,ans,isVisited,path+'D',i+1,j);
            isVisited[i][j]=false;
        }
        
        //left
        if(j-1>=0 && isVisited[i][j-1]==false && m[i][j-1]==1)
        {
            isVisited[i][j]=true;
            helper(m,n,ans,isVisited,path+'L',i,j-1);
            isVisited[i][j]=false;
        }
        
        //right
        if(j+1<n && isVisited[i][j+1]==false && m[i][j+1]==1)
        {
            isVisited[i][j]=true;
            helper(m,n,ans,isVisited,path+'R',i,j+1);
            isVisited[i][j]=false;
        }
        
        //up
        if(i-1>=0 && isVisited[i-1][j]==false && m[i-1][j]==1)
        {
            isVisited[i][j]=true;
            helper(m,n,ans,isVisited,path+'U',i-1,j);
            isVisited[i][j]=false;
        }
    }
    
    public static ArrayList<String> findPath(int[][] m, int n) {
        boolean isVisited[][] = new boolean[n][n];
        ArrayList<String> ans = new ArrayList<>();
        if(m[0][0]==0 || m[n-1][n-1]==0)
            return ans;
        helper(m,n,ans,isVisited,"",0,0);
        return ans;
    }
}