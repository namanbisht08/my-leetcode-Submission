class Solution {
   //Not an optimize way of finding anagram {was getting TLE}
    /*
    public boolean isAnagram(String s1, String s2)
    {
        char[] a1=s1.toCharArray();
        char[] a2=s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        
        return new String(a1).equals(new String(a2));
    }
    */
    
    
    //optimized way of finding anangram
   public boolean isAnagram(String s1,String s2)
    {
        char[] str1=s1.toCharArray();
        char[] str2=s2.toCharArray();
    // Create a count array and initialize
    // all values as 0
        int[] count = new int[26];
 
    // For each character in input strings,
    // increment count in the corresponding
    // count array
       int k=str1.length;
        for(int i = 0; i < k; i++)
        {
            count[str1[i] - 'a']++;
            count[str2[i] - 'a']--;
         }
 
    // If both strings are of different
    // length. Removing this condition
    // will make the program fail for
    // strings like "aaca" and "aca"
 
    // See if there is any non-zero
    // value in count array
         for(int i = 0; i < 26; i++)
             if (count[i] != 0)
                return false;
    return true;
}
    
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> l=new ArrayList<Integer>();
        int itrTill=s.length()-p.length();
        int PLen=p.length();
        for(int i=0; i<=itrTill; i++)
        {
            String str=s.substring(i,i+PLen);
            if(isAnagram(p,str))
                l.add(i);
        }
    return l;
    }
}