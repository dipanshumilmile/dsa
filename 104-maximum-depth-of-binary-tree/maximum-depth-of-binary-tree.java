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
    int depth=0;
    private void solve(TreeNode root, int n){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            depth = Math.max(n, depth);
            return;
        }
        if(root.left!=null){
            solve(root.left, n+1);
        }
        if(root.right!=null){
            solve(root.right, n+1);
        }
    }
    public int maxDepth(TreeNode root) {
        solve(root, 1);
        return depth;
        
    }
}