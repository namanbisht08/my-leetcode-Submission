class Solution {
    int helper(int n, int[] dp)
    {
      if(n==1) return 1;
      if(n==0) return 0;
      if(dp[n]!=0) return dp[n];
      
      if(n%2==0){
        dp[n]=helper(n/2, dp);
        return dp[n];
      }
      dp[n]=helper(n/2, dp)+1;
      return dp[n];
    }
    
    public int[] countBits(int n) {
      int dp[] = new int[n+1];
      int ans[] = new int[n+1];
      //Arrays.fill(dp,-1);
      
      for(int i=0; i<=n; i++)
        ans[i]=helper(i, dp);
        
      return ans;
    }
}