class Solution {
    public boolean isAnagram(String s, String t) {
        char a[]=s.toCharArray();   //converting given two strings into char Array.
        char b[]=t.toCharArray();
        
        java.util.Arrays.sort(a);  //sorting both the char array
        java.util.Arrays.sort(b);
        
        return new String(a).equals(new String(b)); //now converting back char array into string to use equals() method which returns boolean value.
    }
}