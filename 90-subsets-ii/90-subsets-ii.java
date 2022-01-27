//Brute force approach

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] arr) {
        Arrays.sort(arr);
        Set<List<Integer>> s = new HashSet<>();  //taking set so that no duplicate List get appended.
        fun(0, arr, s, new ArrayList<Integer>());
        List<List<Integer>> l = new ArrayList<>(s); //converting the set back to list [list is the req. return type.]
        return l;
    }
    
    void fun(int i, int[] arr, Set<List<Integer>> s, List<Integer> ds)
    {
        if(i==arr.length)
        {
            Collections.sort(ds);      //sorting before appending, for making every list symmertic to compare
            s.add(new ArrayList(ds));
            return;
        }
        
        ds.add(arr[i]);           //element pick 
        fun(i+1, arr, s, ds);
        
        ds.remove(ds.size()-1);  //element not pick
        fun(i+1, arr, s, ds);
    }
}