public class lowestCommonAncestor {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val>q.val){
            TreeNode temp = p;
            p = q;
            q = temp;
        }
        int rootVal = root.val;
        if(p.val < rootVal && q.val > rootVal){
            return root;
        }
        if(p.val > rootVal && q.val > rootVal){
            return lowestCommonAncestor(root.right, p, q);
        }
        if(p.val < rootVal && q.val < rootVal){
            return lowestCommonAncestor(root.left, p, q);
        }
        if(p.val == rootVal)
            return p;
        if(q.val == rootVal)
            return q;

        return null;
    }
}
