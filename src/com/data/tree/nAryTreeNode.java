package com.data.tree;

import com.data.list.mLinkedList;

public class nAryTreeNode {
    Object item;
    mLinkedList leaves;
    int MAXSIZE;
    public nAryTreeNode(Object pItem){
       // MAXSIZE = pMaxSIZE;
        item = pItem;
        leaves = new mLinkedList();
    }
}
