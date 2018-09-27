package com.data.tree;

import com.data.list.mLinkedList;

public class nAryTreeNode<T> {
    //this node has an item to store an object type.
    //and a linkedlist to store childes.
    private T item;
    private mLinkedList<nAryTreeNode<T>> leaves;

    public nAryTreeNode(T pItem){
        item =pItem;
        this.leaves = new mLinkedList<nAryTreeNode<T>>();
    }
    public boolean addItem(T pItem){

        leaves.add(new nAryTreeNode<T>(pItem));
        return true;

    }

    public T getItem() {
        return item;
    }

    public mLinkedList<nAryTreeNode<T>> getLeaves() {
        return leaves;
    }
}
