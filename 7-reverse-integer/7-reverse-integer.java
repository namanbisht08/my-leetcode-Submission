class Solution {
    public int reverse(int x) {
        boolean isNeg=false;
        int i;
        StringBuffer sb;
        String str=String.valueOf(x);
        if(str.charAt(0)=='-')
        {
            isNeg=true;
            sb=new StringBuffer(str.substring(1,str.length()));
        }else
        {
         sb=new StringBuffer(str);   
        }
        str=sb.reverse().toString();
        try{
         i = Integer.parseInt(str);
        }catch(Exception e)
        {
            return i=0;
        }
        if(isNeg)
            return -i;
        else
            return i;
    }
}