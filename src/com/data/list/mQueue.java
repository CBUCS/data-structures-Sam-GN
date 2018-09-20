package com.data.list;

public class mQueue implements ListInterface {


    private mLinkedList Queue;

    public mQueue (){
       Queue = new mLinkedList();
    }
    //adds item to the queue
    @Override
    public boolean add(Object item) {

       Queue.addAt(item,0);
            return true;
    }
    //removes item from queue
    public Object dequeue (){
        mNode n = new mNode();
        n.item = Queue.grabAt(numItems()-1);
        Queue.removeAt(numItems()-1);
        return n.item;
    }
    //searches the queue for specific item
    @Override
    public boolean contains(Object item) {
        return Queue.contains(item);
    }
    //returns the number of items in the queue
    @Override
    public int numItems() {
        return Queue.numItems();
    }
    //returns an array of all the items in the queue
    @Override
    public Object[] toArray() {
        return Queue.toArray();
    }
    // prints all the items in the queue
    @Override
    public void print() {
       Queue.print();
    }
    //clears the queue
    @Override
    public boolean clear(){
        Queue = new mLinkedList();
        return true;
    }
    //these methods are not used in this class and will always return false or null where needed
    @Override
    public boolean addAt(Object item, int position) { return false; }

    @Override
    public boolean remove(Object item) { return false; }

    @Override
    public boolean removeAt(int position) { return false; }

    @Override
    public Object grabAt(int position) { return null; }


}
