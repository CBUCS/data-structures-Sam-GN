package com.data.data;

import java.util.Arrays;

public class mQueue implements ListInterface {


    private mLinkedList Queue;

    public mQueue (){
       Queue = new mLinkedList();
    }

    @Override
    public boolean add(Object item) {

       Queue.addAt(item,0);
            return true;
    }
    public Object dequeue (){
        mNode n = new mNode();
        n.item = Queue.grab();
        Queue.removeAt(numItems()-1);
        return n.item;
    }

    @Override
    public boolean contains(Object item) {
        return Queue.contains(item);
    }

    @Override
    public int numItems() {
        return Queue.numItems();
    }

    @Override
    public Object[] toArray() {
        return Queue.toArray();
    }

    @Override
    public void print() {
       Queue.print();
    }

    @Override
    public boolean addAt(Object item, int position) { return false; }

    @Override
    public boolean remove(Object item) { return false; }

    @Override
    public boolean removeAt(int position) { return false; }

    @Override
    public Object grab() { return null; }


}
