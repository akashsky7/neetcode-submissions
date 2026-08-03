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

        if(root == null){
            return null;
        }
        Queue<TreeNode> nodes = new LinkedList<>();

        nodes.add(root);

        while(!nodes.isEmpty()){
            TreeNode treeNode = nodes.poll();
        

            TreeNode temp = treeNode.left;
            treeNode.left = treeNode.right;
            treeNode.right = temp;

            if(treeNode.left!=null){
                nodes.add(treeNode.left);
            }
            if(treeNode.right!=null){
                nodes.add(treeNode.right);
            }
        
        }
        return root;
    }
}

