class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        fun(1,new ArrayList<Integer>(), ans, n, k);
        return ans;
    }
    
    void fun(int ind, ArrayList<Integer> ds, List<List<Integer>> ans, int n, int k)
    {
        if(ds.size()==k)
            ans.add(new ArrayList(ds));
            
        for(;ind<=n; ind++)
        {
            ds.add(ind);
            fun(ind+1, ds, ans, n, k);
            ds.remove(ds.size()-1);
        }
    }
}