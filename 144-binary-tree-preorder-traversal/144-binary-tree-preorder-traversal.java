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

//iterative solution :-
// class Solution {
//     public List<Integer> preorderTraversal(TreeNode root) {
//         Stack<TreeNode> s = new Stack<>();
//         List<Integer> l = new ArrayList<>();
//         if(root==null)
//             return l;
//         s.push(root);
//         while(!s.empty())
//         {
//             TreeNode node =s.pop();
//             if(node!=null)
//             {
//                 l.add(node.val);
//                 if(node.right!=null) s.push(node.right);
//                 if(node.left!=null) s.push(node.left);
//             }
//             else
//                 continue;
//         }
//     return l;
//     }
// }

//Recursive way :-
class Solution {
     public List<Integer> preorderTraversal(TreeNode root) {
         List<Integer> l = new ArrayList<Integer>();
         helper(root,l);
         return l;
     }
    
    void helper(TreeNode root, List<Integer> l)
    {
        if(root==null)
            return;
        l.add(root.val);
        helper(root.left,l);
        helper(root.right,l);
    }
}