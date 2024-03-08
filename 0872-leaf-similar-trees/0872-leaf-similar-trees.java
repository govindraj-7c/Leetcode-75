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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1 = elements(root1, new ArrayList<>());
        ArrayList<Integer> list2 = elements(root2, new ArrayList<>());
        return list1.equals(list2);
    }
    public ArrayList<Integer> elements(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return list;
        }
        else if(root.left == null && root.right == null){
            list.add(root.val);
        }
        else{
            elements(root.left, list);
            elements(root.right, list);
        }
        return list;
    }
}