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
    int diff = 0;
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        helper(root);
        if(diff == 1 || diff == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public int helper(TreeNode root){
        if(root == null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        diff = Math.max(diff,Math.abs(left - right));
        return Math.max(left , right) + 1;
    }

}