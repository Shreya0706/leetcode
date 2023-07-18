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
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> positionQueue = new LinkedList<>();
        queue.add(root);
        positionQueue.add(1);
        int maxWidth = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            int leftmostPosition = positionQueue.peek();
            int rightmostPosition = 0;

            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                int position = positionQueue.poll();

                if (curr.left != null) {
                    queue.add(curr.left);
                    positionQueue.add(2 * position);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                    positionQueue.add(2 * position + 1);
                }

                rightmostPosition = position;
            }

            int levelWidth = rightmostPosition - leftmostPosition + 1;
            maxWidth = Math.max(maxWidth, levelWidth);
        }

        return maxWidth;
        
        
        
        
        // if(root==null) return 0;
        // Queue <TreeNode> queue = new LinkedList <> ();
        // queue.add(root);
        // int res = 0;
        // while(!queue.isEmpty()){
        //     int count = queue.size();
        //     res = Math.max(res, count);
        //     for(int i = 0; i<count; i++){
        //         TreeNode curr = queue.poll();
        //         if(curr.left!=null){
        //             queue.add(curr.left);
        //         }
        //         if(curr.right!=null){
        //             queue.add(curr.right);
        //         }
        //     }
        // }
        // return res;
    }
}