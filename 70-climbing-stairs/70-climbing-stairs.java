//Radhey Radhey

//Memoization
class Solution{
  public int helper(int n, int[] dp)
  {
    if(n==1) return dp[1]=1;
    if(n==2) return dp[2]=2;
    
    if(dp[n]!=0) return dp[n];
    int left=helper(n-1,dp);
    int right=0;
    if(n>2)
      right=helper(n-2,dp);
    return dp[n]=left+right;
  }
  
  public int climbStairs(int n){
    int dp[] = new int[n+1];
    return helper(n, new int[n+1]);
  }
}

// //Tablulation
// class Solution {
//     public int climbStairs(int n) {
//         int dp[] = new int[n+1];
//       if(n==1) return 1;
//         dp[0]=0;
//         dp[1]=1;
//         dp[2]=2;
//       for(int i=3; i<=n; i++)
//       {
//         dp[i]=dp[i-1]+dp[i-2];
//       }
//       return dp[n];
//     }
// }