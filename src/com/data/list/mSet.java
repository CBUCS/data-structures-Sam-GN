package com.data.list;

public class mSet<T> implements ListInterface<T>{
    private mLinkedList<T> set;

    public mSet (){
        this.set = new mLinkedList<T>();
    }


    //adds item to the set if not available
    @Override
    public boolean add(T item) {
        if(!this.set.contains(item)) {
            this.set.add(item);
            return true;
        }
        else
            return false;
    }

    //removes specific item form the set if available
    @Override
    public boolean remove(T item) {
        return this.set.remove(item);
    }

    //searches the set for specific item
    @Override
    public boolean contains(T item) { return this.set.contains(item);
    }
    //returns the number items in set
    @Override
    public int numItems() {
        return this.set.numItems();
    }
    //returns the item at given index if available
    @Override
    public T grabAt(int position) {
        mNode<T> n =new mNode<T>();
        n.setItem(this.set.grabAt(position));
        return n.getItem();
    }

    //returns an array of all the items in the set
    @Override
    public T[] toArray() {
        return this.set.toArray();
    }
    // prints the items in the set
    @Override
    public void print() {
        this.set.print();
    }
    //clears the items in the set
    @Override
    public boolean clear(){
       this.set = new mLinkedList<T>();
        return true;
    }
    //returns the union of two sets
    public mSet<T> union ( mSet<T> pSet1){

        mSet<T> newSet = new mSet<T>();
        for(int j = 0; j<this.set.numItems();j++){
            newSet.add(this.set.grabAt(j));
        }
        for (int i=0;i<pSet1.numItems();i++)
            {
                if (!newSet.contains(pSet1.grabAt(i)))
                {
                    newSet.add(pSet1.grabAt(i));
                }

            }
        return newSet;
    }
    //returns the items available in both two given sets
    public mSet<T> intersection (mSet<T> pSet){
        mSet<T> newSet = new mSet<T>();
        for (int i=0;i<this.set.numItems();i++)
            for(int j=0;j<pSet.numItems();j++)
        {
            if (this.set.grabAt(i)==pSet.grabAt(j))
            {
                newSet.add(this.set.grabAt(i));
            }

        }
        return newSet;
    }
    //returns the different items available in two given sets
    public mSet<T> difference (mSet<T> pSet){
        mSet<T> intersection = intersection(pSet);
        mSet<T> union = union(pSet);
        for(int i=0;i<intersection.numItems();i++){
            if(union.contains(intersection.grabAt(i)));
            union.remove(intersection.grabAt(i));
        }
        return union;
    }




    //these methods are not used in this class and will always return false
    @Override
    public boolean removeAt(int position) { return false; }

    @Override
    public boolean addAt(T item, int position) { return false; }
}
