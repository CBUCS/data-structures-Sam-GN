package com.data.list;

public class mDequeue<T> implements ListInterface<T> {


    private mLinkedList<T> dequeue;

    public mDequeue (){
        dequeue = new mLinkedList<T>();
    }


    //adds item from the tail
    public boolean addFromTail(T item) {

        this.dequeue.addAt(item,0);
        return true;
    }
    //add item from the head
    public boolean addFromHead(T item) {

        this.dequeue.addAt(item,dequeue.numItems());
        return true;
    }
    //removes item from the head
    public T dequeueFromHead (){
        mNode<T> n = new mNode<T>();
        n.setItem(this.dequeue.grabAt(numItems()-1));
        this.dequeue.removeAt(numItems()-1);
        return n.getItem();
    }
    //removes item from the tail
    public T dequeueFromTail (){
        mNode<T> n = new mNode<T>();
        n.setItem(this.dequeue.grabAt(0));
        this.dequeue.removeAt(0);
        return n.getItem();
    }

    //searches the the queue for specific item
    @Override
    public boolean contains(T item) {
        return this.dequeue.contains(item);
    }
    //returns the number of items in queue
    @Override
    public int numItems() {
        return this.dequeue.numItems();
    }
    //returns an array of all the items in the queue
    @Override
    public T[] toArray() {
        return this.dequeue.toArray();
    }
    //prints the items in the queue
    @Override
    public void print() {
        this.dequeue.print();
    }
    //clears the queue
    @Override
    public boolean clear(){
        dequeue = new mLinkedList<T>();
        return true;
    }

    //these methods are not used in this class and will always return false or null where needed
    @Override
    public boolean add(T item) { return  false; }

    @Override
    public boolean addAt(T item, int position) { return false; }

    @Override
    public boolean remove(T item) { return false; }

    @Override
    public boolean removeAt(int position) { return false; }

    @Override
    public T grabAt(int position) { return null; }



}
