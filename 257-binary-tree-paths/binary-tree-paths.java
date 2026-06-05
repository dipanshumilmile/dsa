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
    List<String> res = new ArrayList<>();

    private void dfs(TreeNode root, String path){

        if(root==null) return;

        if(root.left == null && root.right == null){
            res.add(path);
        }
        if(root.left != null){
        
        dfs(root.left, path+"->"+root.left.val);
        }
        if(root.right != null){
        dfs(root.right, path+"->"+root.right.val);
        }

    }
    public List<String> binaryTreePaths(TreeNode root) {
     dfs(root, String.valueOf(root.val));
     return res;
        
    }
}