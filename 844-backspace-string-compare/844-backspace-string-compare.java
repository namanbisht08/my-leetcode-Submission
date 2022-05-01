import java.util.*;
class Solution {
  
    String backspace(String arr[])
    {
      Stack<String> stack = new Stack<String>();
      for(String s : arr)
        if(s.equals("#"))
          if(!stack.empty())
           stack.pop();
          else
            continue;
         else
          stack.add(s);
      
      return String.valueOf(stack);
    }
  
    public boolean backspaceCompare(String s, String t) {
        return backspace(s.split("")).equals(backspace(t.split("")));
    }
}