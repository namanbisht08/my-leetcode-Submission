class Solution {
    public void moveZeroes(int[] nums) {
      int size=nums.length;
        for(int slow=0,fast=0; fast<size; fast++)
          if(nums[fast]!=0)
            swap(nums,slow++,fast);
    }
  
  void swap(int[] nums, int slow, int fast)
  {
    var temp = nums[slow];
    nums[slow] = nums[fast];
    nums[fast] = temp;
  }
}