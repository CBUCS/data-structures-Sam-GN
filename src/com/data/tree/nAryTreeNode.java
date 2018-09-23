package com.data.tree;

import com.data.list.mLinkedList;
//I was not familiar with N-Ary Trees. After reading about them I tried for many hours to implement it on my own but I couldn't.
//I found this algorithm on stackoverflow
//Source https://stackoverflow.com/questions/30460565/k-ary-tree-implementation-in-java-how-to
// Code by: L Petre
// I modified the code

public class nAryTreeNode<T> {
    T item;
     mLinkedList<T> leaves;
     nAryTreeNode parrent;
     int MAXSIZE;
    public nAryTreeNode(T pItem,int pMAXSIZE){
        this.MAXSIZE = pMAXSIZE;
        this.item = pItem;
        this.leaves = new mLinkedList<T>();
    }
    //this method adds a new node to the previous node
    public boolean addchild (nAryTreeNode<T> child, int position){
        if(position>=this.MAXSIZE-1){
            System.out.println("exceeded max number ");
            return false;
        }
        else {
            if(this.leaves.grabAt(position)!=null) {
                System.out.println("This node has a child");
                return false;
            }
            else{
                child.parrent=this;
                this.leaves.addAt((T)child,position);
                return true;
            }

        }
    }
    //this method removes a child at specific index and its decedents if available
    public boolean removeChildAtIndex (int position){
        if(this.leaves.numItems()<position){
            System.out.println("No child with this index found");
            return false;
        }
        if(position>=this.MAXSIZE-1){
            System.out.println("exceeded max number ");
            return false;
        }
        else{
            this.leaves.removeAt(position);
            return true;
        }
    }
    //this method removes a specific child and its decedents if available
    public boolean removeChild (nAryTreeNode<T> child){
        if(this.leaves.contains((T)child))
        {
            this.leaves.remove((T)child);
            return true;
        }
        else{
            return false;
        }

    }
}
