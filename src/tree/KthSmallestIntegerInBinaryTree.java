package tree;

import java.util.HashSet;
import java.util.Set;

public class KthSmallestIntegerInBinaryTree {


    int node;
    int count=1;
    public int kthSmallest(TreeNode root, int k) {
        helper(root,k);
        return node;
    }

    private void helper(TreeNode root,int k){

        if(root==null) return;
        helper(root.left,k);
        if(count==k){
            node=root.val;
        }
        count++;
        helper(root.right,k);
    }


}
