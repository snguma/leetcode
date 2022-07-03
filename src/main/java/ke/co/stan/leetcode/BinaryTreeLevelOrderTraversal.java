package ke.co.stan.leetcode;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
*
* Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
*
* */
public class BinaryTreeLevelOrderTraversal {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.left.left = null;
        treeNode.left.right = null;
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);

        System.out.println(BinaryTreeLevelOrderTraversal.levelOrder(treeNode));
    }

    private static List<List<Integer>> levelOrder(TreeNode treeNode){
        List<List<Integer>> result = new ArrayList<>();
        if(treeNode==null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i=0; i < size; i++){
                TreeNode currentNode = queue.remove();
                currentLevel.add(currentNode.val);
                if(currentNode.left != null)
                    queue.add(currentNode.left);
                if(currentNode.right !=null)
                    queue.add(currentNode.right);

            }
            result.add(currentLevel);
        }
        return result;
    }

    public static class TreeNode {
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
}
