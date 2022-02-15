// //Brute force :
// class Solution {
//     public int singleNumber(int[] nums) {
//       Map<Integer,Integer> map = new HashMap();
//       for(int i: nums)
//       {
//         int k=map.getOrDefault(i,0);
//         map.put(i,k+1);
//       }
      
//       for (Map.Entry<Integer, Integer> me : map.entrySet())
//       {
//         if(me.getValue()==1)
//           return me.getKey();
//       }
//       return 1;
//     }
// }

// same XOR same=0
class Solution{
  public int singleNumber(int[] nums){
    int ans=0;
    for(int i=0; i<nums.length; i++)
      ans^=nums[i];
    return ans;
  }
}