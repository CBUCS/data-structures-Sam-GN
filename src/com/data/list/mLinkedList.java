package com.data.list;

import java.util.Arrays;
//linkedlist class implementation
public class mLinkedList implements ListInterface {
    private mNode head;

    //for adding new items
    @Override
    public boolean add(Object item) {
        //moves between nodes to find the next emty node
        mNode newNode = new mNode();
        newNode.item = item;
        if(head==null)
            head = newNode;
        else{
             mNode n = head;
             while(n.next!=null){
                 n = n.next;
             }
             n.next = newNode;
        }
        return true;
    }
    //move between nodes to add item at specific index if the index can be reached
    @Override
    public boolean addAt(Object item, int position) {
        mNode n = new mNode();
        n.item = item;
        n.next = null;

        if(position==0){
            n.next = head;
            head = n;
            return true;
        }
        if(position>numItems())
            return false;
        else {
            mNode n2 = head;
            for(int i=0;i<position-1;i++){
                n2 = n2.next;
            }
            n.next = n2.next;
            n2.next = n;
            return true;
        }

    }

    //removes given item from the list if available
    @Override
    public boolean remove(Object item) {
        mNode n = head;
        mNode n2 = null;
        while(n.next!=null){
            if(n.item==item){
                if(n==head) {
                    head = head.next;
                    return true;
                }
                else{
                  n2.next = n.next;
                  return true;
                }
            }
            n2 = n;
            n = n.next;
        }
        if(n.item==item){
            n2.next = null;
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
            head = head.next;
        else{
            mNode n = head;
            mNode n2 = null;
            for(int i=0;i<position-1;i++)
                n = n.next;
            n2 = n.next;
            n.next = n2.next;
        }


        return true;
    }

    //searches the list for specific item
    @Override
    public boolean contains(Object item) {
        mNode n = head;
        if(head ==null)
            return false;
        while(n.next!=null){
            if(n.item==item)
                return true;
            n = n.next;
        }
            if(n.item==item)
                return true;
        return false;
    }
    //returns the number items in list
    @Override
    public int numItems() {
        mNode n = head;
        int count =0;
        if(head == null)
            return 0;
        while (n.next!=null){
            count ++;
            n = n.next;
        }
        count++;
        return count;
    }

    //returns specific item at given index if available
    @Override
    public Object grabAt(int position) {

        if(position>=numItems())
            return null;
        if(position==0)
            return head.item;
        else{
            mNode n = head;
            for(int i=0;i<position;i++)
                n = n.next;
            return n.item;
        }
    }

    //returns an array of all the items in the list
    @Override
    public Object[] toArray() {
        Object mArray [] = new Object[numItems()];
        mNode n = head;
        for (int i=0; i<numItems();i++){
            mArray[i] = n.item;
            n = n.next;
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
        head = new mNode();
        return true;
    }

}
