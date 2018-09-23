package com.data.tree;

import com.data.list.mLinkedList;
//I was not familiar with N-Ary Trees. After reading about them I tried for many hours to implement it on my own but I couldn't.
//I found this algorithm on stackoverflow
//Source https://stackoverflow.com/questions/30460565/k-ary-tree-implementation-in-java-how-to
// Code by: L Petre
//I modified it
public class mNaryTree<T> implements TreeInterface<T> {

    private nAryTreeNode<T> root;
    private int MAXSIZE;


    public mNaryTree(int pMAXSIZE){
        MAXSIZE = pMAXSIZE;
    }
    //returns the root of the tree
    public nAryTreeNode<T> getRoot (){
        return this.root;
    }
    //adds new item as root of the tree
    public void addRoot (T pItem){
        root = new nAryTreeNode<T>(pItem,MAXSIZE);
        root.parrent = null;
        root.leaves = new mLinkedList<T>();
    }
    //adds new child at any given specific index of a node's children
    public void addNewNodeAtIndexChildOfNodeU (nAryTreeNode<T> u, T pItem, int i){
        nAryTreeNode<T> child = new nAryTreeNode<T>(pItem,MAXSIZE);
        u.addchild(child,i);
    }
    //returns the number of nodes in tree
    private int numberOfNodesInTree (nAryTreeNode<T> n){
        int count = 0;
        count++;
        nAryTreeNode<T> n2;
        if(n.leaves.numItems()!=0){
            //searches each node for its children and calculates their size too
            for(int i=0;i<n.leaves.numItems();i++){
                n2= (nAryTreeNode<T>) n.leaves.grabAt(i);
                count += numberOfNodesInTree(n2);
            }
        }
        return count;
    }
    //changes the root of the tree to a new node
    public void changeRoot (nAryTreeNode<T> newRoot, int i){
        nAryTreeNode<T> oldRoot = this.root;
        newRoot.parrent = null;
        newRoot.addchild(oldRoot,i);
        oldRoot.parrent=newRoot;
        this.root=newRoot;
    }
    //calculates the number of nodes in the tree
    @Override
    public int numItems() {
        return numberOfNodesInTree(this.root);
    }
    //searches the tree for specific item
    @Override
    public boolean contains(T item) {
        if(root.item==item)
            return true;
        else return searchTree(this.root,item);

    }
    //this method goes through all the nodes and returns true if it found the specific item
    private boolean searchTree (nAryTreeNode<T> n,T pItem){
        nAryTreeNode<T> n2;
        if(n.leaves.numItems()!=0){
            for(int i=0;i<n.leaves.numItems();i++){
                n2= (nAryTreeNode<T>) n.leaves.grabAt(i);
                if(n2.item==pItem)
                    return true;
                return  searchTree(n2,pItem);
            }
        }
        return false;
    }

    //prints all the items in the tree
    @Override
    public void print() {

        mLinkedList<T> newList = new mLinkedList<T>();
        newList = toList(this.root,newList);
        newList.print();
    }
    //creates a list of all the elements in the tree
    private mLinkedList<T> toList (nAryTreeNode<T> n, mLinkedList<T> m) {
        if (n.item != null)
            m.add(n.item);
        nAryTreeNode<T> n2;
        if (n.leaves.numItems() != 0) {
            for (int i = 0; i < n.leaves.numItems(); i++) {
                n2 = (nAryTreeNode<T>) n.leaves.grabAt(i);
                m = toList(n2, m);
            }

        }
        return m;
    }





/*    private mLinkedList calculateHeight (nAryTreeNode n,mLinkedList m){
        int count = 0;
        count++;
        nAryTreeNode n2;

        if(n.leaves.numItems()!=0){
            for(int i=0;i<n.leaves.numItems();i++){
                n2= (nAryTreeNode) n.leaves.grabAt(i);
                m = calculateHeight(n2,m);
            }
        }

        return m;
    }*/
    //These methods are never used and will always return false
    @Override
    public boolean add(T item) {
        return false;
    }

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
