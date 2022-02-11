class Solution {
    public boolean checkInclusion(String s1, String s2) {
      int SizeS2=s2.length();
      int SizeS1=s1.length();
      char ch[]=s1.toCharArray();
      boolean ans=true;
      
      for(int i=0; i<=SizeS2-SizeS1; i++)
         if(isPresent(ch,s2.substring(i,i+SizeS1).toCharArray())==true)
           return true;
      
      return false;
    }
  
  boolean isPresent(char s1[], char s2[])
  {
    int map[]=new int[26];
    for(int i=0; i<s1.length; i++)
    {
      map[s1[i]-97]++;
      map[s2[i]-97]--;
    }
        
    for(int i : map)
      if(i>0)
        return false;
    
    return true;
  }
}