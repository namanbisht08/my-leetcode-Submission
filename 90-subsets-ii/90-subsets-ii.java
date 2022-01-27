//Optimized approach.
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] arr) {
        List<List<Integer>> l = new ArrayList<>();
        Arrays.sort(arr);   //sort arr so that we get all the duplicate elements on adjacent [1,1,1,2,2,3,4,5,5,]
        fun(0, arr, l, new ArrayList<Integer>());
        return l;
    }
    
    void fun(int ind, int[] arr, List<List<Integer>> l, List<Integer> ds)
    {
        l.add(new ArrayList<>(ds));  //append list in list of list on each level {level no. = size of list}
        
        for(int i=ind; i<arr.length; i++)
        {
            if(i!=ind && arr[i]==arr[i-1]) continue;    //ignore if it is the first element, else do not append on list if it is duplicate.
            ds.add(arr[i]);
            fun(i+1, arr, l, ds);   //recursively call fun to append next index's element.
            ds.remove(ds.size()-1);
        }
    }
    
}

/*
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
*/