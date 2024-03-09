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
    public int goodNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        int countL = goodCount(root.left, 0, root.val);
        int countR = goodCount(root.right, 0, root.val);
        return countL + countR + 1;
    }
    public int goodCount(TreeNode root, int count, int val){
        if(root == null) return count;
        if(root.val >= val){
            val = root.val;
            count++;
        }
        count = goodCount(root.left, count, val);
        count = goodCount(root.right, count, val);
        return count;
    }
}