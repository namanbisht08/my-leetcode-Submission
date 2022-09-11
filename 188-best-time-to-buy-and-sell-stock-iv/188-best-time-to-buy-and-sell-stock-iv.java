class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        
        if(2*k >= n){ 
            //basiaclly this means infinte transactions, no need to go for recursion take every local(high,lo) to profit
            return buyAndSellStock2(prices,n);
        }
        
        int[][][]dp = new int[(2*k)+1][2][n+1];
        for(int[][]d : dp){
            for(int[] d1: d){
                Arrays.fill(d1,-1);
            }
        }
        return findProfit(dp,prices,2*k,true,0,n);
    }
    
    int findProfit(int[][][]dp, int[]prices,int transaction,boolean buy, int indx, int end){
        if(dp[transaction][(buy==true ? 1 : 0)][indx] != -1){
            return dp[transaction][(buy==true ? 1 : 0)][indx];
        }        
        if(transaction == 0 || indx == end){
            return dp[transaction][(buy==true ? 1 : 0)][indx] = 0;
        }
        int max = 0;
        int skipping = findProfit(dp,prices,transaction,buy,indx+1,end);
        if(buy){
            int buying = findProfit(dp,prices,transaction-1,!buy,indx+1,end) - prices[indx];
            max = Math.max(skipping,buying);
        }
        else{
            int selling = findProfit(dp,prices,transaction-1,!buy,indx+1,end) + prices[indx];
            max = Math.max(skipping,selling);
        }
        return dp[transaction][(buy==true ? 1 : 0)][indx] = max;
    }
    
    int buyAndSellStock2(int[]prices,int n){
        int profit = 0;
        for(int i=1; i<n; i++){
            int transaction = prices[i]-prices[i-1];
            if(transaction > 0) profit += transaction;
        }
        return profit;
    }
}