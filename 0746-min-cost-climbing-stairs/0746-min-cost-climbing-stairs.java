//Radhey Radhey 

class Solution {
  public int helper(int[] cost, int n, int dp[])
  {
    if(n<0) return 0;
    if(n==0 || n==1) return dp[n]=cost[n];
    
    if(dp[n]!=0) return dp[n];
    return dp[n]=cost[n]+Math.min(helper(cost,n-1,dp), helper(cost,n-2,dp));
  }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        return Math.min(helper(cost,cost.length-1,dp), helper(cost,cost.length-2,dp)) ;
    }
}