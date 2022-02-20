class Solution:
    def removeCoveredIntervals(self, intervals: List[List[int]]) -> int:
      count=cur=0
      for _,r in sorted(intervals, key=lambda i: (i[0], -i[1])):
        if cur<r:
          cur=r
          count+=1;
      return count;