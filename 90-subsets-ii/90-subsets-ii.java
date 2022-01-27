class Solution {
    public List<List<Integer>> subsetsWithDup(int[] arr) {
        Arrays.sort(arr);
        Set<List<Integer>> s = new HashSet<>();
        fun(0, arr, s, new ArrayList<Integer>());
        List<List<Integer>> l = new ArrayList<>(s);
        return l;
    }
    
    void fun(int i, int[] arr, Set<List<Integer>> s, List<Integer> ds)
    {
        if(i==arr.length)
        {
            Collections.sort(ds);
            s.add(new ArrayList(ds));
            return;
        }
        
        ds.add(arr[i]);
        fun(i+1, arr, s, ds);
        
        ds.remove(ds.size()-1);
        fun(i+1, arr, s, ds);
    }
}