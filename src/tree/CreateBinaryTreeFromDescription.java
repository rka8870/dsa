package tree;

import java.util.HashMap;
import java.util.Map;

public class CreateBinaryTreeFromDescription {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    class TreeObj {
        TreeNode node;
        boolean isParent;
        TreeObj(TreeNode node,boolean isParent){
            this.node=node;
            this.isParent=isParent;
        }
    }

    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer,TreeObj> map = new HashMap<>();
        for(int i=0;i<descriptions.length;i++){
            int nodeVal = descriptions[i][0];
            int childVal = descriptions[i][1];
            boolean isLeft = descriptions[i][2]==1 ? true : false;
            if(map.get(nodeVal)==null){
                TreeNode node = new TreeNode(nodeVal,null,null);
                map.put(nodeVal,new TreeObj(node,true));
                if(map.get(childVal)==null){
                    map.put(childVal,new TreeObj(new TreeNode(childVal,null,null),false));
                    if(isLeft){
                        node.left = map.get(childVal).node;
                    } else {
                        node.right = map.get(childVal).node;
                    }
                }
            } else{
                TreeObj obj = map.get(nodeVal);
                TreeNode node = obj.node;
                if(isLeft){
                    if(map.get(childVal)!=null){
                        TreeObj leftTreeObj = map.get(childVal);
                        node.left = leftTreeObj.node;
                        leftTreeObj.isParent=false;
                    }
                    else{
                        TreeNode leftNode = new TreeNode(childVal,null,null);
                        map.put(childVal,new TreeObj(leftNode,false));
                        node.left = leftNode;
                    }
                } else {
                    if(map.get(childVal)!=null){
                        TreeObj rightTreeObj = map.get(childVal);
                        node.right = rightTreeObj.node;
                        rightTreeObj.isParent=false;
                    }
                    else{
                        TreeNode rightNode = new TreeNode(childVal,null,null);
                        map.put(childVal,new TreeObj(rightNode,false));
                        node.right = rightNode;
                    }
                }
            }
        }
        for(int key : map.keySet()){
            if(map.get(key).isParent){
                return map.get(key).node;
            }
        }

        return null;

    }
}
