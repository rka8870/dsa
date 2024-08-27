import dynammic_programming.FrogJumpKSteps;
import heap.MinHeap;
import recursion.Subsequence;
import tree.*;

import javaInterview.OutOfMemoryInfiniteWhileLoop;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /* CreateBinaryTreeFromDescription solver = new CreateBinaryTreeFromDescription();
        int[][] descriptions = {{20,15,1},{20,17,0},{50,20,1},{50,80,0},{80,19,1}};
        solver.createBinaryTree(descriptions);*/

        /*TopKElementsInList topKElementsInList = new TopKElementsInList();
        int[] nums = {1,2,2,3,3,3};
        topKElementsInList.topKFrequent(nums,2);*/

        /*BucketSort bucketSort = new BucketSort();
        int[] nums = {1,2,2,3,3,3};
        bucketSort.getMostFrequentElement(nums,2);*/

       /* EncoderDecoder encoderDecoder = new EncoderDecoder();
        List<String> list = new ArrayList<>();
        list.add("Raunak");
        list.add("Agarwal");
        list.add("is a underperformer3");
        String encodedString = encoderDecoder.encode(list);
        list = encoderDecoder.decode(encodedString);
        System.out.println(list);*/

        /*KahnsAlgorithm kahnsAlgorithm = new KahnsAlgorithm();
        int[][] edges = {{0,2},{3,2},{2,1}};
        List<Integer> order = kahnsAlgorithm.getOrder(edges,4);
        System.out.println(order);*/

        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        t1.left = t2;
        t1.right = t3;
       /* TreeTraversal preOrder = new PreOrderTraversal();
        TreeTraversal inOrder = new InOrderTraversal();
        TreeTraversal postOrder = new PostOrderTraversal();*/
        //preOrder.traverse(t1);
        //inOrder.traverse(t1);
        //postOrder.traverse(t1);

      /*  LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
        levelOrderTraversal.levelOrder(t1);*/

        /*PathSum pathSum = new PathSum();
        pathSum.hasPathSum(t1,5);*/

        /*ConstructTreeFromInorderPostorder driver  =new ConstructTreeFromInorderPostorder();
        int[] postorder = {9,15,7,20,3};
        int[] inorder = {9,3,15,20,7};
        driver.buildTree(inorder,postorder);*/

       /* LengthOfLongestSubstringWithoutRepeatingCharacters lengthOfLongestSubstringWithoutRepeatingCharacters = new LengthOfLongestSubstringWithoutRepeatingCharacters();
        lengthOfLongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(" ");*/

       /* KthSmallestIntegerInBinaryTree kthSmallestIntegerInBinaryTree = new KthSmallestIntegerInBinaryTree();
        kthSmallestIntegerInBinaryTree.kthSmallest(t1,1);*/


        /*SecondMinimumCost minimumCost = new SecondMinimumCost();
        int[][] edges = {{1,2},{1,3},{1,4},{3,4},{4,5}};
        minimumCost.secondMinimum(5,edges,3,5);*/

       /* OutOfMemoryInfiniteWhileLoop loop  = new OutOfMemoryInfiniteWhileLoop();
        loop.process();*/

        /*Subsequence subsequence = new Subsequence();
        int[] arr = {3,1,2};
        subsequence.subsequence(arr);*/

        /*MinHeap minHeap = new MinHeap(5);
        minHeap.add(4);
        minHeap.add(5);
        minHeap.add(1);
        minHeap.peek();
        minHeap.add(3);
        minHeap.peek();
        minHeap.add(0);
        minHeap.peek();
        minHeap.add(10);
        minHeap.delete();
        minHeap.add(10);
        minHeap.print();
        minHeap.delete();
        minHeap.print();*/

        int[] arr = {10,40,30,10};
        FrogJumpKSteps.minimizeCost(4,2,arr);

    }
}