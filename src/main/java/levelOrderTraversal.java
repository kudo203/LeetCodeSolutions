import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrderTraversal {
    public static List<List<Integer>> levelOrder(TreeNode root){
        if(root==null)
        {
            List<List<Integer>> dummy = new ArrayList<List<Integer>>();
            return dummy;
        }
        Queue<Combo> queue = new LinkedList<Combo>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Combo rootCombo = new Combo(root,0);
        queue.add(rootCombo);
        while(!queue.isEmpty()){
            Combo nodeCombo = queue.remove();
            if(ans.size()>nodeCombo.level){
                List<Integer> temp = ans.get(nodeCombo.level);
                temp.add(nodeCombo.ln.val);
            }
            else{
                ArrayList<Integer> new1 = new ArrayList<Integer>();
                new1.add(nodeCombo.ln.val);
                ans.add(new1);
            }

            TreeNode left = nodeCombo.ln.left;
            TreeNode right = nodeCombo.ln.right;

            if(left!=null){
                Combo cLeft = new Combo(left,nodeCombo.level+1);
                queue.add(cLeft);
            }
            if(right!=null){
                Combo cRight = new Combo(right,nodeCombo.level+1);
                queue.add(cRight);
            }

        }
        return ans;
    }

    public static class Combo{
        TreeNode ln;
        int level;
        Combo(TreeNode ln1, int level1){
            ln = ln1;
            level = level1;
        }
    }

    public static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
        TreeNode(int x) { val = x; }
    }
}
