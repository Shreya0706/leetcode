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
        List<List<Integer>> res=new ArrayList<>();
      if(root==null) return res;
      Queue<TreeNode> q=new LinkedList<>();
      q.add(root);
      
      int level=1;
      while(!q.isEmpty()){
        List<Integer> list=new ArrayList<>();
        int size=q.size();
        while(size!=0){
          TreeNode node=q.poll();
          list.add(node.val);
          
          if(node.left!=null){
            q.add(node.left);
          }
          if(node.right!=null){
            q.add(node.right);
          }
          size--;
        }
        if(level%2==0)Collections.reverse(list);
        res.add(list);
        level++;
      }
      return res;
    }
}