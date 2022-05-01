import java.util.*;
class Solution {
  
    String backspace(String str)
    {
      Stack<String> stack = new Stack<String>();
      for(String s : str.split(""))
        if(!s.equals("#"))
          stack.add(s);
        else
          if(!stack.empty())
           stack.pop();
          
      
      return String.valueOf(stack);
    }
  
    public boolean backspaceCompare(String s, String t) {
        return backspace(s).equals(backspace(t));
    }
}