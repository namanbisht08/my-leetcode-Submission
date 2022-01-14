class Solution(object):
    def romanToInt(self, s):
      st={'I':1, 'V':5, 'X':10, 'L':50, 'C':100, 'D':500, 'M':1000}
      ans=0
      for i in range (len(s)):
        if (i+1)!=len(s) :
            if st[s[i]]>=st[s[i+1]]:
                ans+=st[s[i]];
            else:
                ans-=st[s[i]]
           
        else:
           ans+=st[s[i]];
           
      return ans
        
        
      