class Solution {
    public int findJudge(int n, int[][] trust) {
      
      int inDgr[] = new int[n+1];
      int outDgr[] = new int[n+1];
      
      for(int[] arr : trust)
      {
        outDgr[arr[0]]++;
        inDgr[arr[1]]++;
      }
      
      for(int i=1; i<=n; i++)
        if(outDgr[i]==0 && inDgr[i]==n-1)
          return i;
      
      return -1;
    }
}