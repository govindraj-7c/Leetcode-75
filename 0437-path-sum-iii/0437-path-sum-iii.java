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
    HashMap<Long,Integer> map;
    int count;
    public int pathSum(TreeNode root, int targetSum) {
        map = new HashMap<>();
        count = 0;

        dfs(root, 0, targetSum);

        return count;
    }
    public void dfs(TreeNode root, long prefixSum, int targetSum){
        if(root == null) return ;

        prefixSum += root.val;

        if(map.containsKey(prefixSum-targetSum)){
            count += map.get(prefixSum-targetSum);
        }

        if(prefixSum == targetSum){
            count++;
        }

        map.put(prefixSum, map.getOrDefault(prefixSum,0)+1);

        dfs(root.left, prefixSum, targetSum);
        dfs(root.right, prefixSum, targetSum);

        map.put(prefixSum, map.get(prefixSum)-1);
    }
}