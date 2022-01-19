package com.bridgelabz;

public class BinaryTree {

    // instance variable
    private static TreeNode root;

    // created TreeNode class in order to represent a TreeNode
    private class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;         // it could be any generic type

        public TreeNode(int data) {
            this.data = data;
        }

        public void inOrder(TreeNode root) {
            inOrder(BinaryTree.this.root);
        }

        public TreeNode search(TreeNode root, int key) {
            if (root == null || root.data == key) { // base case
                return root;
            }

            if (key < root.data) {
                return search(root.left, key);
            } else {
                return search(root.right, key);
            }

        }
    }

    public TreeNode insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }

        if (value < root.data) {
            root.left = insert(value);
        } else {
            root.right = insert(value);
        }
        return root;
    }


    public void inOrder() {
        if (root == null) {
            return;
        }
        inOrder();
        System.out.print(root.data + " ");
        inOrder();
    }

    public TreeNode search(int key) {
        return search(key);
    }

        public static void main(String[] args) {
            BinaryTree bst = new BinaryTree();
            bst.insert(56);
            bst.insert(30);
            bst.insert(70);
            bst.insert(22);
            bst.insert(40);
            bst.insert(60);
            bst.insert(95);
            bst.insert(11);
            bst.insert(65);
            bst.insert(3);
            bst.insert(16);
            bst.insert(63);
            bst.insert(67);

            bst.inOrder();

            System.out.println();

            if (null != bst.search(63)) {
                System.out.println("Key found");
            } else {
                System.out.println("Key not found");
            }
        }
}

