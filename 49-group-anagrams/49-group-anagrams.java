//brute force : 
// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         int map[]=new int[strs.length];
//         List<List<String>> l = new ArrayList<>();
//         int n=strs.length;
//         for(int i=0; i<n; i++)
//         {
//             List<String> sl = new ArrayList<>();
//             if(map[i]!=0)
//                 continue;
//             sl.add(strs[i]);
//             map[i]++;
//             for(int j=i+1; j<n; j++)
//             { 
//                 if(isAnagram(strs[i],strs[j]))
//                 {
//                     sl.add(strs[j]);
//                     map[j]++;
//                 }
//             }
//             l.add(new ArrayList<>(sl));
//         }
//         return l;
//     }
    
//     boolean isAnagram(String str1, String str2)
//         {
//             int map[]=new int[26];
//             if(str1.length()!=str2.length())
//                 return false;
//             char[] ch1=str1.toCharArray();
//             char[] ch2=str2.toCharArray();
//             int n=str1.length();
            
//             for(int i=0; i<n; i++)
//             {
//                 map[ch1[i]-97]++;
//                 map[ch2[i]-97]--;
//             }
            
//             for(int i=0; i<26; i++)
//             {
//                 if(map[i]!=0)
//                     return false;
//             }
            
//             return true;
//         }
// }

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
}