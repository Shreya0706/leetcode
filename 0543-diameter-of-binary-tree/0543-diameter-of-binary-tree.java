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
    
    private int res = 0; 

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        
        calculateHeight(root);
        return res;
    }
    
    private int calculateHeight(TreeNode node) {
        if (node == null) return 0;
        
        int lh = calculateHeight(node.left);   
        int rh = calculateHeight(node.right);  
        res = Math.max(res, lh + rh);
        return 1 + Math.max(lh, rh);
    }
}