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
    List<Integer> l1 = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return l1.get(k-1);
    }
    public void inorder(TreeNode root,int k){
        if(root==null) return;

        inorder(root.left,k);
        l1.add(root.val);
        inorder(root.right,k);
    }
}