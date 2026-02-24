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
    public int sumRootToLeaf(TreeNode root) {
        String str = "";
        return helper(root,str);
        
    }
    public int helper(TreeNode root,String str){
        if(root == null) return 0;
        str = str + root.val;
        if(root.left == null && root.right == null){
            return Integer.parseInt(str,2);
        }
        int leftSum = helper(root.left,str);
        int rightSum = helper(root.right,str);

        return leftSum + rightSum;
    }
}