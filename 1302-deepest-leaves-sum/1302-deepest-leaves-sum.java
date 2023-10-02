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
    int sum=0,maxHeight=0;
    public int deepestLeavesSum(TreeNode root) {
        check(root,0);
        return sum;
    }
    public void check(TreeNode root,int level)
    {
        if(root==null) return;
        if(root.left==null && root.right==null)
        {
            if(level>maxHeight)
            {
                maxHeight=level;
                sum=root.val;
            }
            else if(level==maxHeight) sum+=root.val;
        }
        check(root.left,level+1);
        check(root.right,level+1);
    }
}