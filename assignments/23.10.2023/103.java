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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        helper(0, root, lists);
        for (int i = 1; i < lists.size(); i+=2) Collections.reverse(lists.get(i));
        return lists;
    }

    private void helper(int l, TreeNode node, List<List<Integer>> lists) {
        if (node == null) return;

        if (lists.size() < l + 1) {
            List<Integer> list = new ArrayList<>();
            list.add(node.val);
            lists.add(list);
        } else {
            lists.get(l).add(node.val);
        }
        l++;
        helper(l, node.left, lists);
        helper(l, node.right, lists);
    }
}