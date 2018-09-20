package com.data.tree;

import com.data.list.mLinkedList;
//I was not familiar with N-Ary Trees. After reading about them I tried for many hours to implement it on my own but I couldn't.
//I found this algorithm on stackoverflow
//Source https://stackoverflow.com/questions/30460565/k-ary-tree-implementation-in-java-how-to
// Code by: L Petre
// I modified the code

public class nAryTreeNode {
    Object item;
    mLinkedList leaves;
    nAryTreeNode parrent;
    int MAXSIZE;
    public nAryTreeNode(Object pItem,int pMAXSIZE){
        MAXSIZE = pMAXSIZE;
        item = pItem;
        leaves = new mLinkedList();
    }
    //this method adds a new node to the previous node
    public boolean addchild (nAryTreeNode child, int position){
        if(position>=MAXSIZE-1){
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
                this.leaves.addAt(child,position);
                return true;
            }

        }
    }
    //this method removes a child at specific index and its decedents if available
    public boolean removeChildAtIndex (int position){
        if(leaves.numItems()<position){
            System.out.println("No child with this index found");
            return false;
        }
        if(position>=MAXSIZE-1){
            System.out.println("exceeded max number ");
            return false;
        }
        else{
            leaves.removeAt(position);
            return true;
        }
    }
    //this method removes a specific child and its decedents if available
    public boolean removeChild (nAryTreeNode child){
        if(leaves.contains(child))
        {
            leaves.remove(child);
            return true;
        }
        else{
            return false;
        }

    }
}
