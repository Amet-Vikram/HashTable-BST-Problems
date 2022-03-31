package com.bridgelabz.dsa.bst;

public class BinarySearchTree<T extends Comparable<T>> {
    Node<T> root;
    static boolean flag = false;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(T data) {
        Node<T> newNode = new Node<>(data);

        if(root == null) {
            root = newNode;
            return;
        }
        else {
            Node<T> current = root;
            Node<T> parent = null;
            while(true) {
                parent = current;
                if(current.data.compareTo(data) > 0) {
                    current = current.left;
                    if(current == null) {
                        parent.left = newNode;
                        return;
                    }
                }
                else {
                    current = current.right;
                    if(current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void inorderTraversal(Node<T> node) {
        if(root == null)
            System.out.println("Tree is empty");
        else {
            if(node.left != null)
                inorderTraversal(node.left);
            System.out.print(node.data + " ");
            if(node.right != null)
                inorderTraversal(node.right);
        }
    }

    public int size(Node<T> node) {
        if (node == null)
            return 0;
        else
            return(size(node.left) + 1 + size(node.right));
    }

    public boolean searchNode(Node<T> node, T value) {
        if(root == null)
            return flag;
        else {
            if (node.data == value) {
                flag = true;
            }
            if (!flag && node.left != null) {
                searchNode(node.left, value);
            }
            if (!flag && node.right != null) {
                searchNode(node.right, value);
            }
        }
        return flag;
    }
}
