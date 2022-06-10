class Solution {
    public int removePalindromeSub(String s) {
        //if(isPalindrome(s)) return 1;   //O(1) space complexity
      if(s.equals(new StringBuilder(s).reverse().toString())) return 1;  //O(n) space complexity
      return 2;
    }
  
  public boolean isPalindrome(String s)
  {
    int i=0, size=s.length();
    while(i<=size/2)
    {
      if(s.charAt(i)!=s.charAt(size-1-i++))
        return false;
    }
    return true;
  }
}