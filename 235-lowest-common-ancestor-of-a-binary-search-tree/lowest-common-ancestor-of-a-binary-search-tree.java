/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {

    private boolean exists(TreeNode root, int n){
        if(root == null) return false;
        if(root.val == n) return true;
        return exists(root.left, n) || exists(root.right, n);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(root.val == p.val || root.val == q.val) return root;
        boolean pLiesLeft = exists(root.left, p.val);
        boolean qLiesLeft = exists(root.left, q.val);

        if(pLiesLeft && qLiesLeft) return lowestCommonAncestor(root.left, p, q);

        else if (!pLiesLeft && !qLiesLeft) return lowestCommonAncestor(root.right, p, q);
        else return root;




    }
}