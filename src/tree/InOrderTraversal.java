package tree;

public class InOrderTraversal implements TreeTraversal{

    // Left -> Visit -> Right
    @Override
    public void traverse(TreeNode root) {
        if(root==null) return;
        traverse(root.left);
        System.out.print(root.val+"-");
        traverse(root.right);
    }
}
