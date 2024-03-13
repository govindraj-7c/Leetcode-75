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
    int max = 0;
    public int longestZigZag(TreeNode root) {
        maxPath(root,0,true);
        return max;
    }
    public void maxPath(TreeNode root, int steps, boolean left){
        if(root == null){
            return;
        }
        max = Math.max(max,steps);

        if(left == true){
            maxPath(root.left, steps+1, false);
            maxPath(root.right, 1, true);
        }
        else{
            maxPath(root.right, steps+1, true);
            maxPath(root.left, 1, false);
        }
    }
}