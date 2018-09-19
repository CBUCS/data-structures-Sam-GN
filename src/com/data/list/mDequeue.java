package com.data.list;

public class mDequeue implements ListInterface {


    private mLinkedList dequeue;

    public mDequeue (){
        dequeue = new mLinkedList();
    }


    public boolean addFromTail(Object item) {

        dequeue.addAt(item,0);
        return true;
    }
    public boolean addFromHead(Object item) {

        dequeue.addAt(item,dequeue.numItems());
        return true;
    }
    public Object dequeueFromHead (){
        mNode n = new mNode();
        n.item = dequeue.grabAt(numItems()-1);
        dequeue.removeAt(numItems()-1);
        return n.item;
    }
    public Object dequeueFromTail (){
        mNode n = new mNode();
        n.item = dequeue.grabAt(0);
        dequeue.removeAt(0);
        return n.item;
    }

    @Override
    public boolean contains(Object item) {
        return dequeue.contains(item);
    }

    @Override
    public int numItems() {
        return dequeue.numItems();
    }

    @Override
    public Object[] toArray() {
        return dequeue.toArray();
    }

    @Override
    public void print() {
        dequeue.print();
    }

    @Override
    public boolean clear(){
        dequeue = new mLinkedList();
        return true;
    }

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
