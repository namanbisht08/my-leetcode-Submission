class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        k=k%len(nums)
        ar1=nums[-k:]
        ar2=nums[-len(nums):-k]
        nums.clear()
        nums.extend(ar1)
        nums.extend(ar2)
        