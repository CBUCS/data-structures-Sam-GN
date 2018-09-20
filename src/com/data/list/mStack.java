package com.data.list;

public class mStack implements ListInterface {

    private mLinkedList stack;

    public mStack (){
        stack = new mLinkedList();
    }
    //adds new item to stack
    @Override
    public boolean add(Object item) {
        stack.add(item);
        return true;
    }

    //returns and removes the last added item to the stack
    public Object pop (){
        if(stack.numItems()!=0){
            mNode n = new mNode();
            n.item = stack.grabAt(numItems()-1);
            stack.removeAt(numItems()-1);
            return n.item;
        }
        else
             return null;
    }
    //returns the last added item to the stack
    public Object peak (){
        if(stack.numItems()!=0){
            mNode n = new mNode();
            n.item = stack.grabAt(numItems()-1);
            return n.item;
        }
        else
            return null;

    }


    //searches the stack for specific item
    @Override
    public boolean contains(Object item) {
        return stack.contains(item);
    }
    //returns the number of items in stack
    @Override
    public int numItems() {
        return stack.numItems();
    }

    //returns an array of all the items in the stack
    @Override
    public Object[] toArray() {
        return stack.toArray();
    }
    //prints all the items in the stack
    @Override
    public void print() {
       stack.print();
    }
    //clears the stack
    @Override
    public boolean clear(){
        stack = new mLinkedList();
        return true;
    }
    //these methods are not used and will always return false or null where needed
    @Override
    public boolean removeAt(int position) { return true; }

    @Override
    public Object grabAt(int position) { return null;}

    @Override
    public boolean addAt(Object item, int position) {return false;}

    @Override
    public boolean remove(Object item) { return false;}



}
