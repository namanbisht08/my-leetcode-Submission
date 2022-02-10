/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
      List<List<Integer>> l = new ArrayList();
      List<Integer> sl = new ArrayList();
      Queue<TreeNode> q = new LinkedList();
      boolean rightToLeft=false;
      
      q.add(root);
      while(!q.isEmpty())
      {
        sl.clear();
        int s=q.size();
        while(s--!=0)
        {
          TreeNode temp=q.poll();
          if(temp!=null)
          {
            sl.add(temp.val);
            q.add(temp.left);
            q.add(temp.right);
          }
          
        }
        
        if(rightToLeft)
        {
          if(sl.size()>0)
          {
            Collections.reverse(sl);
            l.add(new ArrayList(sl));
            rightToLeft=!rightToLeft;
          }
        }
        else
        {
          if(sl.size()>0)
          {
           l.add(new ArrayList(sl));
         rightToLeft=!rightToLeft;  
          }
        }
      }
      return l;
    }
}