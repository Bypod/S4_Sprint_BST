package com.keyin;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class BST {
    //node class inside tree
    public class Node{
        int key;
        Node left, right;

        public Node(int data){
            key = data;
            left = null;
            right = null;
        }
    }

    //root creation
    Node root;

    //empty bst create
    BST(){
        root = null;
    }

    //instert node
    void insert(int key){
        root  = insertNode(root, key);
    }

    Node insertNode(Node root, int key) {
        if(root == null) {
            root = new Node(key);
            return root;
        }
        //check where to enter in tree
        if (key < root.key) {
            root.left = insertNode(root.left, key);
        } else if (key > root.key) {
            root.right = insertNode(root.left, key);
        }
        return root;
    }

    //get root node
    Node getRoot() {return root;}

    void inOrder(Node root){
        if (root != null) {
            inOrder(root.left);
            System.out.println("---" + root.key);
            inOrder(root.right);
        }
    }

    void preorder(Node root){
        if (root != null) {
            System.out.println("---" + root.key);
            preorder(root.left);
            preorder(root.right);
        }
    }

    void postorder(Node root){
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.println("---" + root.key);
        }
    }

    void createBST(int[] arr){
        BST bst = new BST();
        ObjectMapper mapper = new ObjectMapper();

        if (arr.length > 0){
            for(int i : arr){
                bst.insert(i);
            }


        }
    }

}


