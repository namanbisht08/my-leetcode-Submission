import java.util.*;
class Solution {
    public String reverseWords(String s) {
        StringTokenizer st = new StringTokenizer(s);
        ArrayList<String> arr = new ArrayList<>();
        while(st.hasMoreTokens())
            arr.add(st.nextToken());
        
        String ans="";
        Collections.reverse(arr);
        for(String str : arr)
            ans+=str+" ";
        return ans.trim();
    }
}