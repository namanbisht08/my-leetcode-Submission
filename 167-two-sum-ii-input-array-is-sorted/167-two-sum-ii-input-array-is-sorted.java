import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map <Integer, Integer> hm = new HashMap<>();
        int arr[]=new int[2];
        int s = nums.length;
        for(int i=0; i<s; i++)
          hm.put(target-nums[i],i);
      
        for(int i=0; i<s; i++)
        {
          if(hm.containsKey(nums[i]) && hm.get(nums[i]) != i)
          {
            if(hm.get(nums[i])>i)
            {
              arr[0]=i+1;
              arr[1]=hm.get(nums[i])+1;
            }
            else{
              arr[1]=i+1;
              arr[0]=hm.get(nums[i])+1;
            }
          }
          else
            continue;
        }
       return arr;
    }
}