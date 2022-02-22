class Solution {
    public int titleToNumber(String s) {
      int sum=0;  
      for(char c : s.toCharArray())
        {
          sum*=26;
          sum+=c-'A'+1;
        }
      return sum;
    }
}

/*
"B" = 2
"BC" = (2)26 + 3
"BCM" = (2(26) + 3)26 + 13
*/