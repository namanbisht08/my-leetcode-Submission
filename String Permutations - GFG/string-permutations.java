// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    public void findPermutation(String s,ArrayList<String> lst,String ans)
    {
        if(s.length()==0)
        {
            lst.add(ans);
            return;
        }
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            String leftString=s.substring(0,i);
            String rightString=s.substring(i+1);
            findPermutation(leftString+rightString,lst,ans+ch);
        }
    }
    public ArrayList<String> permutation(String S)
    {
        ArrayList<String> lst=new ArrayList<>();
        String ans="";
        
        findPermutation(S,lst,ans);
        Collections.sort(lst);
        return lst;
    }
}
