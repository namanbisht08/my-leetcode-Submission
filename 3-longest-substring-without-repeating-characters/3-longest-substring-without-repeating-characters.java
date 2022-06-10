class Solution {
    public int lengthOfLongestSubstring(String s) {
      int curMax=0, max=0;
      Map<Character, Integer> map = new HashMap<>();
      for(int i=0; i<s.length(); i++)
      {
        if(map.containsKey(s.charAt(i)))
        {
          i=map.get(s.charAt(i));
          map.clear();
          max=Math.max(max,curMax);
          curMax=0;
        }
        else
        {
          curMax++;
          map.put(s.charAt(i),i);
        }
      }
      return Math.max(max,curMax);
    }
}