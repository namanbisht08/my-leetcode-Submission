# class Solution(object):
#     def isPalindrome(self, x):
#         return True if str(x)==str(x)[::-1] else False
        
    
class Solution(object):
    def isPalindrome(self, x):
        if ''.join(reversed(str(x)))==str(x): return True
        return False