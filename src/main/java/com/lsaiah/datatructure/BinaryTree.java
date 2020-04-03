package com.lsaiah.datatructure;
import java.util.ArrayDeque;

public class BinaryTree {
    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }
    TreeNode root;
    public BinaryTree(int[] array) {
        root = createBinaryTree(array, 0);
    }
    //利用二叉树的数组表示法构建二叉树，并返回根节点。
    public TreeNode createBinaryTree(int[] array, int index) {
        if (index < array.length) {
            int value = array[index];
            TreeNode root = new TreeNode(value);
            root.left = createBinaryTree(array, index * 2 + 1);
            root.right = createBinaryTree(array, index * 2 + 2);
            return root;
        }
        return null;
    }
    //深度优先遍历采用栈的非递归实现
    public void depthOrderTraversal(TreeNode root) {
        if (root == null) {
            System.out.println("空树！");
            return;
        }
        ArrayDeque<TreeNode> stack = new ArrayDeque<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.println(node.value + "  ");
            //先让右结点入栈，以致在pop时确保左结点先出栈
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        System.out.println("\n");
    }
    //深度优先遍历的递归实现
    public void depthOrderTraversalWithRecursion(TreeNode root) {
        if (root != null) {
            System.out.println(root.value);
        }
        depthOrderTraversal(root.left);
        depthOrderTraversal(root.right);
    }

    //广度优先遍历采用队列的非递归实现。广度优先遍历无法用递归实现
    public void breadthOrderTraversal(TreeNode root) {
        if (root == null) {
            System.out.println("空树！");
            return;
        }
        ArrayDeque<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            System.out.println(node.value + "  ");
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        BinaryTree binaryTree = new BinaryTree(array);
//        binaryTree.depthOrderTraversal(binaryTree.root);
//        binaryTree.depthOrderTraversalWithRecursion(binaryTree.root);
        binaryTree.breadthOrderTraversal(binaryTree.root);
    }
}
