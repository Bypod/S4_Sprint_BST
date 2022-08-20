package com.keyin;

import java.util.Scanner;

public class BSTFunctions {

    public static void main (String[] args){

//         for (int i = 0; i < inputs.length; i++){
//         System.out.println("\nPlease enter numbers up to 10, Type 'create' to start creation of tree: ");
//             System.out.println("\nPlease enter 8 numbers");
//             inputs[i] = input.nextInt();
//         }



        // for (int in : inputs){

        // }

         BST newTree = new BST();

         //inserts
         newTree.insert(88);
         newTree.insert(30);
         newTree.insert(15);
         newTree.insert(90);
         newTree.insert(999                                                                                                                                                                       );
         newTree.insert(12);

         //display sorted tree
         newTree.inorder(newTree.getRoot());

         //delete key
        newTree.deleteKey(999);

        System.out.println("\n");

        //in order
        newTree.inorder(newTree.getRoot());
        System.out.println("\n");

        //pre order
        newTree.preOrder(newTree.getRoot());
        System.out.println("\n");

        // post order
        newTree.postOrder(newTree.getRoot());
        System.out.println("\n");

        System.out.println(newTree.search(15));




    }
}
