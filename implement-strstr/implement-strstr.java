class Solution {
    public int strStr(String s, String n) {
        if(s.length()==0 && n.length()==0)
          return 0;
      return s.indexOf(n);
    }
}