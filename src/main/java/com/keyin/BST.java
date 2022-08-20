package com.keyin;


//JAMIE READ ME ---- Hey Jamie, I know this is not the best BST when it comes to incorperating a database as well. 
// -- In the final day of the sprint I had to make a choice in what to do with our team sprint and as well in helping others with KPM.
// -- ended up having to spend 7 hours with semester 3 students then work through many unforgiving errors in our group sprint.
// -- ended up having to sacrafice some functionality in this part of the sprint because of all that. 
// -- Just thought i would explain my thought process into why this might not be done up to what might be ideal for this project
public class BST {
    //node class that defines BST node
    class Node {
        int key;
        Node left, right;

        public Node(int data){
            key = data;
            left = right = null;
        }
    }
    // BST root
    Node root;

    // bst constructor
    BST(){
        root = null;
    }

    Node getRoot() {
        return root;
    }

    //delete a node from BST
    void deleteKey(int key) {
        root = delete(root, key);
    }

    //delete function
    Node delete(Node root, int key)  {
        //tree is empty
        if (root == null)  return root;


        if (key < root.key)
            root.left = delete(root.left, key);
        else if (key > root.key)
            root.right = delete(root.right, key);
        else  {

            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.key = minValue(root.right);

            root.right = delete(root.right, root.key);
        }
        return root;
    }
//minimum val
    int minValue(Node root)  {
        int minval = root.key;
        while (root.left != null)  {
            minval = root.left.key;
            root = root.left;
        }
        return minval;
    }

    // insert a node
    void insert(int key)  {
        root = insertNode(root, key);
    }

    Node insertNode(Node root, int key) {
        //tree is empty
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertNode(root.left, key);
        else if (key > root.key)
            root.right = insertNode(root.right, key);

        return root;
    }


    void inorder(Node root) {
        inorderNodes(this.root);
    }

    void inorderNodes(Node root) {
        if (root != null) {
            inorderNodes(root.left);
            System.out.print(root.key + " ");
            inorderNodes(root.right);
        }
    }
//post order
    void postOrder(Node node)  {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.key + " ");
    }

    //PreOrder
    void preOrder(Node node)  {
        if (node == null)
            return;
        System.out.print(node.key + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    boolean search(int key)  {
        root = searchNode(root, key);
        return root != null;
    }

    //recursive insert function
    Node searchNode(Node root, int key)  {
        if (root==null || root.key==key)
            return root;
        if (root.key > key)
            return searchNode(root.left, key);
        return searchNode(root.right, key);
    }

}
