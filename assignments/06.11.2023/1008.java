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
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder,Integer.MAX_VALUE,new int[]{0});
    }
    public TreeNode helper(int[] preorder,int bound,int[]i) {
        if(i[0]==preorder.length || preorder[i[0]]>bound) return null;
        TreeNode root = new TreeNode(preorder[i[0]++]);
        root.left=helper(preorder,root.val,i);
        root.right=helper(preorder,bound,i);
        return root;

    }
}