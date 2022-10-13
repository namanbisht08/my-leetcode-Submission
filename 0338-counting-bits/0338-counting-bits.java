class Solution {
    int helper(int n)
    {
      if(n==1) return 1;
      if(n==0) return 0;
      
      if(n%2==0) return helper(n/2);
      return helper(n/2)+1;
    }
    
    public int[] countBits(int n) {
      int ans[] = new int[n+1];
      
      for(int i=0; i<=n; i++)
        ans[i]=helper(i);
        
      return ans;
    }
}