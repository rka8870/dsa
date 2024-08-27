package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {


    public class TreeElement{
        int level;
        TreeNode node;
        public TreeElement(int level,TreeNode node){
            this.level = level;
            this.node = node;
        }
    }


    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return null;
        Queue<TreeElement> queue = new LinkedList<>();
        queue.add(new TreeElement(1,root));
        List<List<Integer>> ans = new ArrayList<>();

        while(!queue.isEmpty()){
            TreeElement curr = queue.poll();
            TreeNode node = curr.node;
            if(ans.size()>=curr.level){
                ans.get(curr.level-1).add(node.val);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(node.val);
                ans.add(list);
            }
            if(node.left!=null){
                queue.add(new TreeElement(curr.level+1,node.left));
            }
            if(node.right!=null){
                queue.add(new TreeElement(curr.level+1,node.right));
            }
        }
        return ans;
    }

}
