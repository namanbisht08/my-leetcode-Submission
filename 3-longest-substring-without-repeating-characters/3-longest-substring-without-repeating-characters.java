class Solution {
   public int lengthOfLongestSubstring(String s)
   {
       int ans=0;
       int n=s.length();
       for(int i=0; i<n; i++)
       {
           boolean arr[]=new boolean[256];    //including all the Ascii charaters and by defalut marked as false intially
           for(int j=i; j<n; j++)
           {
               if(arr[s.charAt(j)]==true)     // if already true means that charater is visited so break the loop.
                   break;
               else{
                   ans=Math.max(ans,j-i+1);   // if the char is not already visited then marked it true and update the count of longest character(ans).
                   arr[s.charAt(j)]=true;
               }
           }
           arr[s.charAt(i)]=false;
       }
   return ans;
   }
}







// class Solution {
//    public boolean isDistinct(String str, int i, int j)
//    {
//        boolean arr[]=new boolean[26];
       
//        for(int k=i; k<=j; k++)
//        {
//            if(arr[str.charAt(k)-'a']==true)
//                return false;
//            arr[str.charAt(k)-'a']=true;
//        }
//        return true;
//    }
    
//     public int lengthOfLongestSubstring(String s) {
//         int res=0;
//         for(int i=0; i<s.length(); i++)
//             for(int j=i; j<s.length(); j++)
//             {
//                 if(isDistinct(s,i,j))
//                    res=Math.max(res,j-i+1); 
//             }
//      return res;
//     }
// }







