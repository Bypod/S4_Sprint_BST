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

         newTree.insert(10)
         newTree.insert(30)
         newTree.insert(15)
         newTree.insert(90)
         newTree.insert(30)
         newTree.insert(12)

         newTree.inOrder(newTree.getRoot())

    }
}
