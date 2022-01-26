// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}
// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n){
        ArrayList<Integer> res = new ArrayList<Integer>();
        fun(0,n,arr,res,0);
        return res;
    }
    
    void fun(int ind,int n, ArrayList<Integer> arr, ArrayList<Integer> res, int sum)
    {
        if(n==ind)
        {
            res.add(sum);
            return;
        }
        
        sum+=arr.get(ind);
        fun(ind+1,n,arr,res,sum);
        
        sum-=arr.get(ind);
        fun(ind+1,n,arr,res,sum);
    }
}