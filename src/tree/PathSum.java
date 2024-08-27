package tree;

public class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root,0,targetSum);
    }

    private boolean helper(TreeNode root, int sum, int targetSum) {
        if(root.left== null && root.right == null) {
            return sum + root.val == targetSum;
        }
        if(root!=null){
            return helper(root.left, root.val+sum, targetSum) || helper(root.right, root.val+sum, targetSum);
        }
        return false;
    }

}
