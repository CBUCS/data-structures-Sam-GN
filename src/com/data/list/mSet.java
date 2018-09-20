package com.data.list;

public class mSet implements ListInterface{
    private mLinkedList set;

    public mSet (){
        set = new mLinkedList();
    }


    //adds item to the set if not available
    @Override
    public boolean add(Object item) {
        if(!set.contains(item)) {
            set.add(item);
            return true;
        }
        else
            return false;
    }

    //removes specific item form the set if available
    @Override
    public boolean remove(Object item) {
        return set.remove(item);
    }

    //searches the set for specific item
    @Override
    public boolean contains(Object item) {
        return set.contains(item);
    }
    //returns the number items in set
    @Override
    public int numItems() {
        return set.numItems();
    }
    //returns the item at given index if available
    @Override
    public Object grabAt(int position) {
        mNode n =new mNode();
        n.item = set.grabAt(position);
        return n.item;
    }

    //returns an array of all the items in the set
    @Override
    public Object[] toArray() {
        return set.toArray();
    }
    // prints the items in the set
    @Override
    public void print() {
        set.print();
    }
    //clears the items in the set
    @Override
    public boolean clear(){
       set = new mLinkedList();
        return true;
    }
    //returns the union of two sets
    public mSet union ( mSet pSet1){

        mSet newSet = new mSet();
        for(int j = 0; j<set.numItems();j++){
            newSet.add(set.grabAt(j));
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
    public mSet intersection (mSet pSet){
        mSet newSet = new mSet();
        for (int i=0;i<set.numItems();i++)
            for(int j=0;j<pSet.numItems();j++)
        {
            if (set.grabAt(i)==pSet.grabAt(j))
            {
                newSet.add(set.grabAt(i));
            }

        }
        return newSet;
    }
    //returns the different items available in two given sets
    public mSet difference (mSet pSet){
        mSet intersection = intersection(pSet);
        mSet union = union(pSet);
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
    public boolean addAt(Object item, int position) { return false; }
}
