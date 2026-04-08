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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        boolean past = false;
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode node = q.peek();
            q.poll();
            if(node == null){
                past=true;
            }else{
                if(past==true){
                    return false;
                }else{
                    q.offer(node.left);
                    q.offer(node.right);
                }
            }
        }
        return true;
    }
}