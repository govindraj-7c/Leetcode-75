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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return sum(root, targetSum, 0);
    }
    public boolean sum(TreeNode root, int targetSum, int rootSum){
        if(root == null) return false;
        if(root.left == null && root.right == null){
            return rootSum + root.val == targetSum;
        }
        rootSum += root.val;
        boolean ans1 = sum(root.left, targetSum, rootSum);
        boolean ans2 = sum(root.right, targetSum, rootSum);

        return ans1 | ans2;
    }
}