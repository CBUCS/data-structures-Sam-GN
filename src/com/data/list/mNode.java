package com.data.list;

public class mNode<T> {
    //create node for linkedlist
    T item;
    mNode next;

    public void setItem(T item) {
        this.item = item;
    }

    public void setNext(mNode next) {
        this.next = next;
    }
}
