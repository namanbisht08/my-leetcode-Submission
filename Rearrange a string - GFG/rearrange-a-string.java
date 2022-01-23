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
                    System.out.println(obj.arrangeString(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String arrangeString(String s)
        {
            char a[]=s.toCharArray();
            java.util.Arrays.sort(a);
            StringBuffer sb=new StringBuffer();
            int sum=0;
            
            for(char i : a)
                if((int)i<=57)
                    sum+=(int)i-48;
                else
                    sb.append(i);
                    
            return sb.append(sum).toString();
        }
}
