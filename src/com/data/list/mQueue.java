package com.data.list;

public class mQueue<T> implements ListInterface<T> {


    private mLinkedList<T> Queue;

    public mQueue (){
       this.Queue = new mLinkedList<T>();
    }
    //adds item to the queue
    @Override
    public boolean add(T item) {

       this.Queue.addAt(item,0);
            return true;
    }
    //removes item from queue
    public T dequeue (){
        mNode<T> n = new mNode<T>();
        n.setItem(this.Queue.grabAt(numItems()-1));
        this.Queue.removeAt(numItems()-1);
        return n.getItem();
    }
    //searches the queue for specific item
    @Override
    public boolean contains(T item) {
        return this.Queue.contains(item);
    }
    //returns the number of items in the queue
    @Override
    public int numItems() {
        return this.Queue.numItems();
    }
    //returns an array of all the items in the queue
    @Override
    public T[] toArray() {
        return this.Queue.toArray();
    }
    // prints all the items in the queue
    @Override
    public void print() {
       this.Queue.print();
    }
    //clears the queue
    @Override
    public boolean clear(){
        this.Queue = new mLinkedList<T>();
        return true;
    }

    //these methods are not used in this class and will always return false or null where needed
    @Override
    public boolean addAt(T item, int position) { return false; }

    @Override
    public boolean remove(T item) { return false; }

    @Override
    public boolean removeAt(int position) { return false; }

    @Override
    public T grabAt(int position) { return null; }


}
