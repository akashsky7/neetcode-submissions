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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(p);
        nodes.add(q);

        while(!nodes.isEmpty()){
            TreeNode first = nodes.poll();
            TreeNode second = nodes.poll();

            if(first == null && second == null){
                continue;
            }else if(first == null || second == null || first.val != second.val){
                return false;
            }

            nodes.add(first.left);
            nodes.add(second.left);
            nodes.add(first.right);
            nodes.add(second.right);
        }
        return true;
    }
}
