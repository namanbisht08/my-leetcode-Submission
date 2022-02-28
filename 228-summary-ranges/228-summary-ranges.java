class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int arr[]=new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
          if(arr[i]==1)
            continue;
          int j=i;
          for(;j<nums.length-1 && nums[j]+1==nums[j+1]; j++)
            arr[j]++;
          arr[j]++;
          if(i==j)
            ans.add(""+nums[i]);
          else
            ans.add(""+nums[i]+"->"+nums[j]);
        }
      return ans;
    }
}