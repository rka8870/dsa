package tree;

public class PostOrderTraversal implements TreeTraversal{

    // Left -> Right -> Visit
    @Override
    public void traverse(TreeNode root) {
        if(root==null) return;
        traverse(root.left);
        traverse(root.right);
        System.out.print(root.val+"-");
    }

}
