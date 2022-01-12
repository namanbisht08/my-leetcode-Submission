// class Solution {
//     public String addBinary(String a, String b) {
//         return Integer.toBinaryString(Integer.parseInt(a,2)+Integer.parseInt(b,2));
//     }
// }


//python
// class Solution(object):
//     def addBinary(self, a, b):
//         return bin(int('0b'+a,2)+int('0b'+b,2))[2:]



class Solution {
    public String addBinary(String a, String b) {
        if(a.equals("0") && b.equals("0"))
            return "0";
         
        // Initialize result
        StringBuilder result = new StringBuilder("");
         
        // Initialize digit sum
        int s = 0;        
 
        // Traverse both strings starting
        // from last characters
        int i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0 || s == 1)
        {
             
            // Comput sum of last
            // digits and carry
            s += ((i >= 0)? a.charAt(i) - '0': 0);
            s += ((j >= 0)? b.charAt(j) - '0': 0);
 
            // If current digit sum is
            // 1 or 3, add 1 to result
            result.append((char)(s % 2 + '0'));
 
            // Compute carry
            s /= 2;
 
            // Move to next digits
            i--; j--;
        }
       
          // Remove leading zeros, if any
          int start = result.length()-1;
         
        while(start >=0 && result.charAt(start) == '0') {
            start--;
        }
         
        if(start != result.length()-1) {
            result.delete(start+1,result.length());
        }
         
        return result.reverse().toString();
    }
}