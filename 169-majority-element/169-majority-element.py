class Solution:
    def majorityElement(self, nums: List[int]) -> int:
      return sorted(nums)[len(nums)//2]
      #return sorted(list(collections.Counter(nums).items()), key=lambda n: n[1], reverse=True)[0][0]
        