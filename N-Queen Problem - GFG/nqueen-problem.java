// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.nQueen(n);
            if(ans.size() == 0)
                System.out.println("-1");
            else {
                for(int i = 0;i < ans.size();i++){
                    System.out.print("[");
                    for(int j = 0;j < ans.get(i).size();j++)
                        System.out.print(ans.get(i).get(j) + " ");
                    System.out.print("] ");
                }
                System.out.println();
            }
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution{
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
        getQueen(board, 0,res);
        return res;
        
    }
    
    
    static void getQueen(boolean[][] board, int r,ArrayList<ArrayList<Integer>> res){
         
        if(r == board.length){
            res.add(getPath(board));
            return;
        }
        
        for(int c=0;c<board.length;c++){
            if(isSafe(board, r, c)){
                board[r][c] = true;
                getQueen(board, r+1,res);
                board[r][c] = false;
            }
        }
        
    }
    
    static boolean isSafe(boolean[][] board, int r, int c){
        //Checking vertical up
        for(int i=r; i>=0 ;i--){
            if(board[i][c]){
                return false;
            }
        }
        
        //Checking diagonal left
        int maxLeft = Math.min(r,c);
        
        for(int i = 1;i<=maxLeft;i++){
            if(board[r-i][c-i]){
                return false;
            }
        }
        
        //Checking diagonal right
        int maxRight = Math.min(r,board.length - c - 1);
        
        for(int i = 1;i<=maxRight;i++){
            if(board[r-i][c+i]){
                return false;
            }
        }
        //Will not check below the given row because we know that we have not placed any queen below the given row yet
        return true;
    }
    
    static ArrayList<Integer> getPath(boolean[][] board){
        ArrayList<Integer> path = new ArrayList<>();
        int n = board.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]){
                    path.add(j+1);
                }
            }
        }
        return path;
    }
    
    
}