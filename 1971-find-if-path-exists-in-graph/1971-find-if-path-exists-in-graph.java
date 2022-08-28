class Solution {
    public boolean validPath(int n, int[][] edges, int s, int dest) {
      HashMap<Integer,ArrayList<Integer>> hs = new HashMap<>();
      
      for(int i=0; i<n; i++)
        hs.put(i,new ArrayList<>());
      
      for(int[] temp : edges)
      {
        int u = temp[0];
        int v = temp[1];
      
        hs.get(u).add(v);
        hs.get(v).add(u);
      }
      
      boolean visited[] = new boolean[n];
      Queue<Integer> q = new LinkedList<>();
      
      q.offer(s);
      visited[s]=true;
      
      while(!q.isEmpty())
      {
        int vis = q.poll();
        for(int vertex : hs.get(vis))
          if(!visited[vertex])
          {
            visited[vertex]=true;
            q.offer(vertex);
          }
      }
      return visited[dest];
    }
}