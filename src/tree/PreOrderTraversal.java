package tree;

public class PreOrderTraversal implements TreeTraversal{

    // Visit -> Left -> Right
    @Override
    public void traverse(TreeNode root) {
        if(root==null) return;
        System.out.print(root.val+"-");
        traverse(root.left);
        traverse(root.right);
    }
}
