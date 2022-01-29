// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}
// } Driver Code Ends

class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String s)
    {
        ArrayList<String> arr = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(s,".");
        StringBuilder sb = new StringBuilder();
        
        while(st.hasMoreTokens())
            arr.add(st.nextToken());
        
        sb.append(arr.get(arr.size()-1));
        for(int i = arr.size()-2; i>=0; i--)
        {
            sb.append(".");
            sb.append(arr.get(i));
        }
        
        return sb.toString();
    }
}