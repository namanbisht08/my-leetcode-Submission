class Solution {
    public String removeKdigits(String num, int k)
    {
      int len = num.length();
      //conner Case
      if(k==len)
        return "0";
      
      Stack<Character> stack = new Stack();
      for(int i=0; i<len; i++)
      {
        //when the current digit is smaller than the last digit, pop the last digit
        while(k>0 && !stack.isEmpty() && stack.peek()>num.charAt(i))
        {
          stack.pop();
          k--;
        }
        stack.push(num.charAt(i));
      }
      
      //corner case
      while(k>0)
      {
        stack.pop();
        k--;
      }
      
      StringBuilder sb = new StringBuilder();
      while(!stack.isEmpty())
        sb.append(stack.pop());
      sb.reverse();
      
      //remove all the 0 at the head
      while(sb.length()>1 && sb.charAt(0)=='0')
        sb.deleteCharAt(0);
      return sb.toString();
    }
}