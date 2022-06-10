// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String s){
        // code here
        int n = s.length();
        boolean [][] dp = new boolean[n][n];
        int start = 0;
        int end = 0;
        int maxLen = 0;
        
        for(int gap = 0; gap < n; gap++){
            for(int i = 0, j = gap; j < n; j++, i++){
                if(gap == 0){
                    dp[i][j] = true;
                } else if(gap == 1){
                    dp[i][j] = s.charAt(i) == s.charAt(j);
                } else {
                    dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1] == true;
                }
                if(dp[i][j] == true && gap > maxLen){
                    maxLen = gap;
                    start = i;
                    end = j;
                }
            }
        }
        return s.substring(start, end + 1);
    }
}