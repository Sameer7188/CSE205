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

    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        helper(ans, root, 0);

        return ans;
    }

    public static void helper(List<List<Integer>> ans, TreeNode root, int level) {
        if (root==null) return;
        
        if (ans.size()<=level) ans.add(new ArrayList<Integer>());
        
        ans.get(level).add(root.val);
        
        helper(ans, root.left, level+1);
        helper(ans, root.right, level+1);
    }
}