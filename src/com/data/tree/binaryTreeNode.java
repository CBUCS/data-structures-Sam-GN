package com.data.tree;

public class binaryTreeNode<T> {
    //node class for binary tree. it stores an item and has the attribute to point to the next two nodes
    private T item;
    private binaryTreeNode<T> left;
    private binaryTreeNode<T> right;

    public binaryTreeNode(T pItem){
        this.item = pItem;
        this.left = null;
        this.right = null;
    }

    public void setItem(T item) {
        this.item = item;
    }
    public void setLeft(binaryTreeNode<T> left) {
        this.left = left;
    }

    public void setRight(binaryTreeNode<T> right) {
        this.right = right;
    }

    public T getItem() {
        return this.item;
    }

    public binaryTreeNode<T> getLeft() {
        return this.left;
    }

    public binaryTreeNode<T> getRight() {
        return this.right;
    }
}
