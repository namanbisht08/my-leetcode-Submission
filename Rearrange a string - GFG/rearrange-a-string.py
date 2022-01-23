#User function Template for python3

class Solution:
    def arrangeString(self, s):
        l=list(s);
        j=0
        for i in l:
            if i.isnumeric() : j+=int(i)
        
        return ''.join(list(sorted([i for i in l if i.isalpha()])))+str(j)

#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        s = input().strip()
        ob = Solution()
        ans = ob.arrangeString(s)
        print(ans)
# } Driver Code Ends