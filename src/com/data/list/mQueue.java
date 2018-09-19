package com.data.list;

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
        n.item = Queue.grabAt(numItems()-1);
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
    public boolean clear(){
        Queue = new mLinkedList();
        return true;
    }
    @Override
    public boolean addAt(Object item, int position) { return false; }

    @Override
    public boolean remove(Object item) { return false; }

    @Override
    public boolean removeAt(int position) { return false; }

    @Override
    public Object grabAt(int position) { return null; }


}
