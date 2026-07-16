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
    static class NodeDepth {
        TreeNode node;
        int depth;

        public NodeDepth(TreeNode node, int depth) {
        this.node = node;
        this.depth = depth;
    }
    } 

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int maxDepth = 0;
        Stack<NodeDepth> stack = new Stack<>();

        stack.push(new NodeDepth(root, 1));

        while(!stack.isEmpty()) {
            NodeDepth current = stack.pop();
            TreeNode currentNode = current.node;
            int currentDepth = current.depth;

            maxDepth = Math.max(maxDepth, currentDepth);

            if (currentNode.left != null){
                stack.push(new NodeDepth(currentNode.left, currentDepth + 1));
            }
            if (currentNode.right != null){
                stack.push(new NodeDepth(currentNode.right, currentDepth + 1));
            }
        }
        return maxDepth;
    }
}
