package com.data.list;

import java.util.Arrays;
//linkedlist class implementation
public class mLinkedList <T>implements ListInterface<T> {
    private mNode<T> head;

    //for adding new items
    @Override
    public boolean add(T item) {
        //moves between nodes to find the next emty node
        mNode<T> newNode = new mNode<T>();
        newNode.setItem(item);
        if(this.head==null)
            this.head = newNode;
        else{
             mNode<T> n = this.head;
             while(n.getNext()!=null){
                 n = n.getNext();
             }
             n.setNext(newNode);
        }
        return true;
    }
    //move between nodes to add item at specific index if the index can be reached
    @Override
    public boolean addAt(T item, int position) {
        mNode<T> n = new mNode<T>();
        n.setItem(item);
        n.setNext(null);

        if(position==0){
            n.setNext(this.head);
            this.head = n;
            return true;
        }
        if(position>numItems())
            return false;
        else {
            mNode<T> n2 = this.head;
            for(int i=0;i<position-1;i++){
                n2 = n2.getNext();
            }
            n.setNext(n2.getNext());
            n2.setNext(n);
            return true;
        }

    }

    //removes given item from the list if available
    @Override
    public boolean remove(T item) {
        mNode<T> n = head;
        mNode<T> n2 = null;
        while(n.getNext()!=null){
            if(n.getItem()==item){
                if(n==head) {
                    this.head = this.head.getNext();
                    return true;
                }
                else{
                  n2.setNext(n.getNext());
                  return true;
                }
            }
            n2 = n;
            n = n.getNext();
        }
        if(n.getItem()==item){
            n2.setNext(null);
            return true;
        }
        return false;
    }
    //removes given object at specific index if available
    @Override
    public boolean removeAt(int position) {
        if(position>=numItems())
            return false;
        if(position==0)
            this.head = this.head.getNext();
        else{
            mNode<T> n = this.head;
            mNode<T> n2 = null;
            for(int i=0;i<position-1;i++)
                n = n.getNext();
            n2 = n.getNext();
            n.setNext(n2.getNext());
        }


        return true;
    }

    //searches the list for specific item
    @Override
    public boolean contains(T item) {
        mNode<T> n = this.head;
        if(this.head ==null)
            return false;
        while(n.getNext()!=null){
            if(n.getItem()==item)
                return true;
            n = n.getNext();
        }
            if(n.getItem()==item)
                return true;
        return false;
    }
    //returns the number items in list
    @Override
    public int numItems() {
        mNode<T> n = this.head;
        int count =0;
        if(this.head == null)
            return 0;
        while (n.getNext()!=null){
            count ++;
            n = n.getNext();
        }
        count++;
        return count;
    }

    //returns specific item at given index if available
    @Override
    public T grabAt(int position) {

        if(position>=numItems())
            return null;
        if(position==0)
            return this.head.getItem();
        else{
            mNode<T> n = this.head;
            for(int i=0;i<position;i++)
                n = n.getNext();
            return  n.getItem();
        }
    }

    //returns an array of all the items in the list
    @Override
    public T[] toArray() {
        T[] mArray  =  (T[]) new Object[this.numItems()];
        mNode<T> n = this.head;
        for (int i=0; i<numItems();i++){
            mArray[i] = n.getItem();
            n = n.getNext();
        }
        return mArray;
    }
    //prints all the items in the list
    @Override
    public void print() {
        System.out.print(Arrays.toString(toArray())+"\n");
    }
        //clears the list
        @Override
        public boolean clear(){
        this.head = new mNode<T>();
        return true;
    }

}
