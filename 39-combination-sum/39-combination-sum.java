


class Solution {

    public List<List<Integer>> combinationSum(int[] arr, int t) {

        List<List<Integer>> r = new ArrayList<>();

        fun(0,arr,t,r,new ArrayList<Integer>());

        return r;

    }

    

    void fun(int ind, int arr[], int t, List<List<Integer>> r, List<Integer> ds)

    {

        if(ind==arr.length){

            if(t==0)

                r.add(new ArrayList<>(ds));

            return;

        }

        

        if(arr[ind] <= t){

            ds.add(arr[ind]);

            fun(ind, arr, t-arr[ind], r, ds);

            ds.remove(ds.size()-1);

        }

        fun(ind+1, arr, t, r, ds);  

    }

}