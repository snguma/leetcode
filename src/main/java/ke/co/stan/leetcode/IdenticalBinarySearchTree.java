package ke.co.stan.leetcode;

import java.util.ArrayList;
import java.util.List;

/*

Given the root nodes of the two binary search trees.
The task is to print “Both BSTs are identical” if the two
Binary Search Trees are identical else print “Both BSTs are identical”.
Two trees are identical if they are identical structurally and nodes have the same values.

*  Tree1 –

         5
        / \
      3   8
     / \
    2   4

   Tree2-

       5
      / \
     3   8
    / \
   2   4
*
*
* */
public class IdenticalBinarySearchTree {


    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(5);
        tree1.left = new TreeNode(3);
        tree1.right = new TreeNode(8);
        tree1.left.left = new TreeNode(2);
        tree1.left.right = new TreeNode(4);

        TreeNode tree2 = new TreeNode(5);
        tree2.left = new TreeNode(3);
        tree2.right = new TreeNode(8);
        tree2.left.left = new TreeNode(2);
        tree2.left.right = new TreeNode(4);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        inorder(tree1, list1);
        inorder(tree2, list2);

        if(list1.equals(list2))
            System.out.println("Trees are Identical");
        else
            System.out.println("Trees are not identical");

    }

    private static void inorder(TreeNode treeNode, List<Integer> list){
        if(treeNode==null)return;
        inorder(treeNode.left, list);
        list.add(treeNode.val);
        inorder(treeNode.right, list);
    }


    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
    }

}
