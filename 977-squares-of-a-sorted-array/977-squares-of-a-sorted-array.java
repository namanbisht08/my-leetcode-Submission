class Solution {
    public int[] sortedSquares(int[] nums) {
       int s=nums.length-1;
        for(int i=0; i<=s; i++)
        {
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}