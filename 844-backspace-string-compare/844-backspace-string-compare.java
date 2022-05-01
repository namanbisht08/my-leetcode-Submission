import java.util.*;
class Solution {
  
    String backspace(String arr[])
    {
      Stack<String> stack = new Stack<String>();
      for(String s : arr)
      {
        if(s.equals("#"))
          if(!stack.empty())
           stack.pop();
          else
            continue;
        else
          stack.add(s);
      }
      
      String s="";
	    while(!stack.empty())
	    {
	        s+=stack.pop();
	    }
      System.out.println(s);
      return s;
    }
  
    public boolean backspaceCompare(String s, String t) {
        return backspace(s.split("")).equals(backspace(t.split("")));
    }
}