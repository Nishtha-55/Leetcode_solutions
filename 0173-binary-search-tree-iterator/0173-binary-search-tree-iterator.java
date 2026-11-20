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
class BSTIterator {
    Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        stack = new Stack<TreeNode>();

        leftTree(root);
    }

    public void leftTree(TreeNode root) {
        if(root == null) return;

        TreeNode curr = root;

        while(curr != null) {
            stack.push(curr);
            curr = curr.left;
        }
    }
    
    public int next() {
        TreeNode node = stack.pop();

        if(node.right != null) leftTree(node.right);

        return node.val;
    }
    
    public boolean hasNext() {
        return stack.isEmpty() ? false : true;
    }
}