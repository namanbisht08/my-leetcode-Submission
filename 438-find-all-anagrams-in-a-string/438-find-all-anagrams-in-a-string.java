import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> l = new ArrayList<>();
        int x = s.length()-p.length();
        char[] s1 = p.toCharArray();
        Arrays.sort(s1);
        for(int i=0; i<=x; i++)
        {
            char[] s2 = s.substring(i,i+p.length()).toCharArray();
            // Arrays.sort(s2);
            // if(new String(s1).equals(new String(s2)))
            //     l.add(i);
            
            if(isAnagram(s1,s2))
                l.add(i);
        }
        return l;
    }
    
    boolean isAnagram(char[] s1, char[] s2)
    {
        int x = s1.length;
        int hashTable[] = new int[26];
        for(int i=0; i<x; i++)
        {
            hashTable[s1[i]-'a']++;
            hashTable[s2[i]-'a']--;
        }
        
        for(int i=0; i<26; i++)
            if(hashTable[i]!=0)
                return false;
        return true;
    }
}