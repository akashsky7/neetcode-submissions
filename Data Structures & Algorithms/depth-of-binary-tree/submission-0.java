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
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> nodes = new LinkedList<>();

        if(root == null){
            return 0;
        }
        

        nodes.add(root);
        int noOfLevels = 0;

        while(true){
            int noOfNodesAtLevel = nodes.size();

            if(noOfNodesAtLevel==0){
                return noOfLevels;
            }

            while(noOfNodesAtLevel>0){
                TreeNode treeNode = nodes.poll();

                if(treeNode.left!=null){
                    nodes.add(treeNode.left);
                }
                if(treeNode.right!=null){
                    nodes.add(treeNode.right);
                }
                noOfNodesAtLevel--;
            }
            noOfLevels++;
        }
    }
}
