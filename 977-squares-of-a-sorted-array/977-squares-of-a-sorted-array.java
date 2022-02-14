class Solution {
    public int[] sortedSquares(int[] nums) {
       // int arr[]=new int[nums.length];
        for(int i=0; i<=nums.length-1; i++)
        {
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}