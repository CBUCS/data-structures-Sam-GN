package com.data.list;

public class mStack<T> implements ListInterface<T> {

    private mLinkedList<T> stack;

    public mStack (){
        this.stack = new mLinkedList();
    }
    //adds new item to stack
    @Override
    public boolean add(T item) {
        this.stack.add(item);
        return true;
    }

    //returns and removes the last added item to the stack
    public T pop (){
        if(this.stack.numItems()!=0){
            mNode<T> n = new mNode<T>();
            n.setItem(this.stack.grabAt(numItems()-1));
            this.stack.removeAt(numItems()-1);
            return n.getItem();
        }
        else
             return null;
    }
    //returns the last added item to the stack
    public T peak (){
        if(this.stack.numItems()!=0){
            mNode<T> n = new mNode<T>();
            n.setItem(stack.grabAt(numItems()-1));
            return n.getItem();
        }
        else
            return null;

    }


    //searches the stack for specific item
    @Override
    public boolean contains(T item) {
        return this.stack.contains(item);
    }
    //returns the number of items in stack
    @Override
    public int numItems() {
        return this.stack.numItems();
    }

    //returns an array of all the items in the stack
    @Override
    public T[] toArray() {
        return this.stack.toArray();
    }
    //prints all the items in the stack
    @Override
    public void print() {
       this.stack.print();
    }
    //clears the stack
    @Override
    public boolean clear(){
        this.stack = new mLinkedList<T>();
        return true;
    }
    //these methods are not used and will always return false or null where needed
    @Override
    public boolean removeAt(int position) { return true; }

    @Override
    public T grabAt(int position) { return null;}

    @Override
    public boolean addAt(T item, int position) {return false;}

    @Override
    public boolean remove(T item) { return false;}



}
