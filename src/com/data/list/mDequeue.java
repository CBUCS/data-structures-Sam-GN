package com.data.list;

public class mDequeue implements ListInterface {


    private mLinkedList dequeue;

    public mDequeue (){
        dequeue = new mLinkedList();
    }


    //adds item from the tail
    public boolean addFromTail(Object item) {

        dequeue.addAt(item,0);
        return true;
    }
    //add item from the head
    public boolean addFromHead(Object item) {

        dequeue.addAt(item,dequeue.numItems());
        return true;
    }
    //removes item from the head
    public Object dequeueFromHead (){
        mNode n = new mNode();
        n.item = dequeue.grabAt(numItems()-1);
        dequeue.removeAt(numItems()-1);
        return n.item;
    }
    //removes item from the tail
    public Object dequeueFromTail (){
        mNode n = new mNode();
        n.item = dequeue.grabAt(0);
        dequeue.removeAt(0);
        return n.item;
    }

    //searches the the queue for specific item
    @Override
    public boolean contains(Object item) {
        return dequeue.contains(item);
    }
    //returns the number of items in queue
    @Override
    public int numItems() {
        return dequeue.numItems();
    }
    //returns an array of all the items in the queue
    @Override
    public Object[] toArray() {
        return dequeue.toArray();
    }
    //prints the items in the queue
    @Override
    public void print() {
        dequeue.print();
    }
    //clears the queue
    @Override
    public boolean clear(){
        dequeue = new mLinkedList();
        return true;
    }

    //these methods are not used in this class and will always return false or null where needed
    @Override
    public boolean add(Object item) { return  false; }

    @Override
    public boolean addAt(Object item, int position) { return false; }

    @Override
    public boolean remove(Object item) { return false; }

    @Override
    public boolean removeAt(int position) { return false; }

    @Override
    public Object grabAt(int position) { return null; }



}
