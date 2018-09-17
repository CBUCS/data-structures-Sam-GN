package com.data.data;

import java.util.Arrays;

public class mStack implements ListInterface {

    private mLinkedList stack;

    public mStack (){
        stack = new mLinkedList();
    }

    @Override
    public boolean add(Object item) {
        stack.add(item);
        return true;
    }


    public Object pop (){
        if(stack.numItems()!=0){
            mNode n = new mNode();
            n.item = stack.grab();
            stack.removeAt(numItems()-1);
            return n.item;
        }
        else
             return null;
    }



    @Override
    public boolean contains(Object item) {
        return stack.contains(item);
    }

    @Override
    public int numItems() {
        return stack.numItems();
    }


    @Override
    public Object[] toArray() {
        return stack.toArray();
    }

    @Override
    public void print() {
       stack.print();
    }


    @Override
    public boolean removeAt(int position) { return true; }

    @Override
    public Object grab() { return null;}

    @Override
    public boolean addAt(Object item, int position) {return true;}

    @Override
    public boolean remove(Object item) { return false;}



}
