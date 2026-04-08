import java.util.*;

class Solution {
    List<List<Integer>> res = new ArrayList<>();

    private void fill(TreeNode node, int sum, List<Integer> temp, int targetSum){
        if(node == null) return;

        // Create new list for this path
        List<Integer> newTemp = new ArrayList<>(temp);
        newTemp.add(node.val);

        sum += node.val;

        if(node.left == null && node.right == null){
            if(sum == targetSum){
                res.add(newTemp);
            }
            return;
        }

        fill(node.left, sum, newTemp, targetSum);
        fill(node.right, sum, newTemp, targetSum);
    }
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        fill(root, 0, new ArrayList<>(), targetSum);
        return res;
    }
}