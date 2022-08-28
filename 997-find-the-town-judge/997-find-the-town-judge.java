class Solution {
  
  public boolean visitedByEveryone(HashMap<Integer,ArrayList<Integer>> hs, int n)
  {
    for(int i=1; i<=hs.size(); i++)
    {
      if(i==n) continue;
      if(!hs.get(i).contains(n))
        return false;
    }
    return true;
  }
  
  public boolean visitingNoOne(HashMap<Integer,ArrayList<Integer>> hs, int n)
  {
    return hs.get(n).size()==0 || hs.get(n)==null; 
  }
  
    public int findJudge(int n, int[][] trust) {
      HashMap<Integer,ArrayList<Integer>> hs = new HashMap<>();
      for(int i=1; i<=n; i++)
        hs.put(i,new ArrayList<>());
      
      for(int[] arr : trust)
      {
        int u=arr[0], v=arr[1];
        hs.get(u).add(v);
      }
      
      for(int i=1; i<=n; i++)
      {
        if(visitedByEveryone(hs,i) && visitingNoOne(hs,i))
          return i;
      }
      
      return -1;
    }
}