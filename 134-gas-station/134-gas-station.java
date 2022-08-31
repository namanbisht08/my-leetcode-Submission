class Solution {
    public boolean canCompleteRound(int[] gas, int[] cost, int n, int size)
    {
      int tank=0, cst=0;
      
      for(int i=n; i<size+n; i++)
      {
        tank=tank-cst+gas[i%size];
        cst=cost[i%size];
          if(tank<cost[i%size])
            return false;
      }
      
      return true;
    }
    
    public int canCompleteCircuit(int[] gas, int[] cost) {
      int size = gas.length;
        for(int i=0; i<size; i++)
        {
          if(cost[i]==0 && gas[i]==0)
            continue;
          if(canCompleteRound(gas, cost, i, size))
            return i;
        }
      return -1;
    }
}