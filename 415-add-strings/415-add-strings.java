//using BigInteger class of math packkage.
/*
import java.math.*;
class Solution {
    public String addStrings(String num1, String num2) {
        return String.valueOf(new BigInteger(num1).add(new BigInteger(num2)));
    }
}
*/


class Solution {
    public String addStrings(String num1, String num2) {
        int len1=num1.length()-1;
        int len2=num2.length()-1;
        int resSize=Math.max(len1,len2)+2;
        int res[]=new int[resSize];   
        for(int i=resSize-1; i>=0; i--,len1--,len2--)
        {
            if(len1>=0 && len2>=0){
                int a = num1.charAt(len1)-'0';
                int b = num2.charAt(len2)-'0';
                int s = a+b+res[i];
                res[i]= s%10;
                res[i-1]+=s/10;
            }else{
                if(len1>len2 && len1>=0){
                   int a = num1.charAt(len1)-'0';
                   int s = a+res[i];
                   res[i]= s%10;
                   res[i-1]+=s/10;
                 }
                if(len2>len1 && len2>=0){
                   int b = num2.charAt(len2)-'0';
                   int s = b+res[i];
                   res[i]= s%10;
                   res[i-1]+=s/10;
                }
            }
            
        }
        
        int strIdx= res[0]!=0 ? 0 : 1;
        StringBuilder sb = new StringBuilder();
        for(int i=strIdx; i<resSize; i++)
            sb.append(res[i]);
        
        return sb.toString();
    }
}