class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> l = new ArrayList<>();
        fun(0,arr,l,new ArrayList<Integer>());
        return l;
    }
    
    void fun(int i, int[] arr, List<List<Integer>> l, List<Integer> ds)
    {
        if(i==arr.length)
        {
            l.add(new ArrayList<Integer>(ds));
            return;
        }
        
        ds.add(arr[i]);
        fun(i+1,arr,l,ds);  //pick
        
        ds.remove(ds.size()-1);
        fun(i+1,arr,l,ds);  //not pick
    }
    
}