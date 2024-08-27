package tree;

public class ConstructTreeFromInorderPostorder {


    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int iStart = 0;
        int iEnd = inorder.length-1;
        int pStart = 0;
        int pEnd = postorder.length-1;
        return helper(inorder,postorder, iStart, iEnd,  pStart,  pEnd);
    }

    public TreeNode helper(int[] inorder, int[] postorder, int istart, int iend , int pstart, int pend){
        if(istart>iend){ return null; }

        int val = postorder[pend];
        int index=0;
        TreeNode root = new TreeNode(val);
        for(int i=istart;i<=iend;i++){
            if(inorder[i]==val){
                index=i;
                break;
            }
        }
        int leftNodeLen = index-istart;
        int rightNodeLen = iend-index;
        root.left = helper(inorder,postorder, istart, index-1,  pstart,  pstart+leftNodeLen-1);
        root.right = helper(inorder,postorder, index+1, iend,  pend-rightNodeLen,  pend-1);

        return root;

    }



}
