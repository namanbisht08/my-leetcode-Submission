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




// #################### {COME BACK AGAIN} TC O(n) SC O(n)* ####################
// can be improved using morris traversal of BST

class Solution {
    void inOrder(TreeNode root, ArrayList<Integer> arr)
    {
        if(root==null)
            return;
        
        inOrder(root.left,arr);
        arr.add(root.val);
        inOrder(root.right,arr);
    }
    
    public int kthSmallest(TreeNode root, int k) {
       ArrayList<Integer> arr = new ArrayList<>();
        inOrder(root,arr);
        return k>arr.size()?-1:arr.get(k-1); 
    }
}