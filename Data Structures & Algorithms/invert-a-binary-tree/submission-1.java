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
    public TreeNode invertTree(TreeNode root) {
        return helper(root);
    }

    public TreeNode helper(TreeNode root) {
        TreeNode res = root;

        if(res == null) {
            return res;
        }

        TreeNode rightPtr = root.right;
        TreeNode leftPtr = root.left;


        res.left = helper(rightPtr);
        res.right = helper(leftPtr);

        return res;
    }
}
