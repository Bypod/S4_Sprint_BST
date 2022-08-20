package com.keyin;


import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BSTTest {

    BST bst = new BST();

    @Test
    public void testInsertAndDelete() {
        bst.insert(1);
        bst.insert(90);
        bst.insert(33);
        bst.insert(3);
        bst.insert(44);
        bst.insert(77);

        assertEquals(1, bst.getRoot().key);
        assertEquals(90, bst.getRoot().right.key);
        assertEquals(33, bst.getRoot().right.left.key);

        bst.deleteKey(1);

        assertNotEquals(1, bst.getRoot().key);


    }

    @Test
    public void testSearch() {
        bst.insert(1);
        bst.insert(90);
        bst.insert(33);
        bst.insert(3);
        bst.insert(44);
        bst.insert(77);

        assertTrue(bst.search(77));

        assertFalse(bst.search(4));
        assertFalse(bst.search(11));

    }

//    @Test
//    public void testDisplay() {
//        bst.insert(1);
//        bst.insert(90);
//        bst.insert(33);
//        bst.insert(3);
//        bst.insert(44);
//        bst.insert(77);
//
//        assertNotNull(bst.inorder(bst.getRoot()));
//    }

}
