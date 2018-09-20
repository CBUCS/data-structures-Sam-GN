package com.data.tree;

public class binaryTreeNode {
    //node class for binary tree. it stores an item and has the attribute to point to the next two nodes
    Object item;
    binaryTreeNode left;
    binaryTreeNode right;

    public binaryTreeNode(Object pItem){
        item = pItem;
        left = null;
        right = null;
    }
}
