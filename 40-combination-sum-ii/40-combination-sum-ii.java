class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        fun(0,candidates,target,ans, new ArrayList<Integer>());
        return ans;
    }
    
    void fun(int ind, int[] candidates, int target, List<List<Integer>> ans, List<Integer>ds)
    {
     if(target==0){
         ans.add(new ArrayList<>(ds));
         return;
     }

     for(int i=ind; i<candidates.length; i++)
     {
         if(i>ind && candidates[i]==candidates[i-1]) continue;
         if(candidates[i]>target) break;
         
         ds.add(candidates[i]);
         fun(i+1,candidates,target-candidates[i],ans,ds);
         ds.remove(ds.size()-1);
     }   
    }
}