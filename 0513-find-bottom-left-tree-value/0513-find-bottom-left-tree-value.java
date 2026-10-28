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
    int ans=0;
    int prevcount=-1;
    public int findBottomLeftValue(TreeNode root) {
        count(root, 0);
        return ans;
    }
    void count(TreeNode root, int countt){
        if(root==null){
            return;
        }
        if(countt>prevcount){
            prevcount=countt;
            ans=root.val;
        }
        count(root.left, countt+1);
        count(root.right, countt+1);
    }
}