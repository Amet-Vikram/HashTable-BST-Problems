package com.bridgelabz.dsa.bst;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();

        tree.insert(56);
        tree.insert(30);
        tree.insert(70);
        tree.insert(22);
        tree.insert(40);
        tree.insert(11);
        tree.insert(3);
        tree.insert(16);
        tree.insert(60);
        tree.insert(95);
        tree.insert(65);
        tree.insert(63);
        tree.insert(67);


        if(tree.searchNode(tree.root, 100))
            System.out.println("Element is present");
        else
            System.out.println("Element is not present");
    }
}
