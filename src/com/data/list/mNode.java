package com.data.list;

public class mNode<T> {
    //create node for linkedlist
    private T item;
    private mNode<T> next;

    public void setItem(T item) {
        this.item = item;
    }

    public void setNext(mNode<T> next) {
        this.next = next;
    }

    public T getItem(){
        return this.item;
    }

    public mNode<T> getNext(){
        return this.next;
    }
}
