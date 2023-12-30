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
    List<List<Integer>> ans = new ArrayList();
    List<Integer> subans = new ArrayList();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        if(root==null) 
            return ans;
        subans.add(root.val);
        if(root.left==null && root.right==null && targetSum==root.val){
            ans.add(new ArrayList(subans));
        }
        pathSum(root.left,targetSum-root.val );
        pathSum(root.right,targetSum-root.val );
        subans.remove(subans.size()-1);//backtracking
        return ans;   
    }
}