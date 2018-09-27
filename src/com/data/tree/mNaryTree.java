package com.data.tree;

import com.data.list.mLinkedList;
import com.data.list.mQueue;
import com.data.list.mStack;

//This time I used the hint you gave us in class and used my queue and stack classes to figure out
//the next place to add items. Unlike last time, I created this class on my own.

public class mNaryTree<T> implements TreeInterface<T> {

    private nAryTreeNode<T> root;
    private int MAXSIZE;


    public mNaryTree(int pMAXSIZE){
        MAXSIZE = pMAXSIZE;
    }


    @Override
    public boolean add(T pItem) {
        if(root == null){
            root = new nAryTreeNode<T>(pItem);
            return true;
        }
        //using a BFS like algorithm for finding the first empty node
        mQueue<nAryTreeNode<T>> queue= new mQueue<>();
        queue.add(root);
        while (queue.numItems()>0)
        {

            nAryTreeNode<T> tempNode = queue.dequeue();

            for(int i=0;i<MAXSIZE;i++){
                if (tempNode.getLeaves().grabAt(i) == null) {
                    tempNode.addItem(pItem);
                    return true;
                }
            }

            for(int i=0;i<MAXSIZE;i++){
                if (tempNode.getLeaves().grabAt(i) != null) {
                    queue.add(tempNode.getLeaves().grabAt(i));
                }
            }

        }
        return false;

    }
    //implementing BFS
    public void BFS() {
        //uses a queue to know which item to print
        System.out.print("BFS: ");
        mQueue<nAryTreeNode<T>> queue= new mQueue<>();
        queue.add(root);
        while (queue.numItems()>0)
        {

            nAryTreeNode<T> tempNode = queue.dequeue();
            System.out.print(tempNode.getItem() + " ");

            for(int i=0;i<MAXSIZE;i++){
                if (tempNode.getLeaves().grabAt(i) != null) {
                    queue.add(tempNode.getLeaves().grabAt(i));
                }
            }

        }
        System.out.println("");

    }

    // implementing a DFS
    public  void DFS(){
        //uses a stack to know which item to print.
        if(root == null)
            return;
        System.out.print("DFS: ");
        mStack<nAryTreeNode<T>> res = new mStack<nAryTreeNode<T>>();
        res.add(root);
        while(res.numItems()>0){
            nAryTreeNode<T> top = res.pop();
            System.out.print(top.getItem() + " ");
            for(int i=MAXSIZE-1;i>=0;i--){
                if (top.getLeaves().grabAt(i) != null) {
                    res.add(top.getLeaves().grabAt(i));
                }
            }

        }
        System.out.println("");

    }

    //searches the tree for specific item
    @Override
    public boolean contains(T item) {
        if(root == null)
            return false;

        mStack<nAryTreeNode<T>> res = new mStack<nAryTreeNode<T>>();
        res.add(root);
        //first check the last item in the stack, if item do not match, adds the node's children to the stack
        //and continue until either item is found or stack is empty
        while(res.numItems()>0){
            nAryTreeNode<T> top = res.pop();
            if(top.getItem().equals(item))
                return true;
            for(int i=MAXSIZE-1;i>=0;i--){
                if (top.getLeaves().grabAt(i) != null) {
                    res.add(top.getLeaves().grabAt(i));
                }
            }

        }
        return false;
    }

    //returns the  number of items in the tree
    @Override
    public int numItems() {
        mLinkedList<T> newList = new mLinkedList<T>();
        newList = toList(this.root,newList);

        return newList.numItems();
    }


    //prints all the items in the tree
    @Override
    public void print() {

        mLinkedList<T> newList = new mLinkedList<T>();
        newList = toList(this.root,newList);
        newList.print();
    }
    //creates a list of all the elements in the tree
    private mLinkedList<T> toList (nAryTreeNode<T> pNode1, mLinkedList<T> pNode2) {
        if (pNode1.getItem() != null)
            pNode2.add(pNode1.getItem());
        nAryTreeNode<T> n2;
        if (pNode1.getLeaves().numItems() != 0) {
            for (int i = 0; i < pNode1.getLeaves().numItems(); i++) {
                //adds the children of the node to the list.
                n2 = (nAryTreeNode<T>) pNode1.getLeaves().grabAt(i);
                pNode2 = toList(n2, pNode2);
            }

        }
        return pNode2;
    }






    //These methods are never used and will always return false


    @Override
    public boolean remove(T item) {
        return false;
    }

    @Override
    public int height() {
        mLinkedList<T> m = new mLinkedList<T>();

        return 0;
    }

}
