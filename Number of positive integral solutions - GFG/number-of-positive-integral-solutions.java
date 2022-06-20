// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.posIntSol(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    long posIntSol(String s)
    {
        int x = 1;
        int k = 0;
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '+') x++;
            else if(s.charAt(i) == '=')
                k = Integer.parseInt(s.substring(i+1,s.length()));
        }
        if(k < x)
        return 0;
        
        int  n = k-1;
        int r = x-1;
       
        long up = 1;
        long down = 1;
        for(int i=1;i<=r;i++)
            up *= n--;
        for(int i=1;i<=r;i++)
            down *= i;
        return up / down;
    }
}