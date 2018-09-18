package com.data.data;

public class mSet implements ListInterface{
    private mLinkedList set;

    public mSet (){
        set = new mLinkedList();
    }


    @Override
    public boolean add(Object item) {
        if(!set.contains(item)) {
            set.add(item);
            return true;
        }
        else
            return false;
    }


    @Override
    public boolean remove(Object item) {
        return set.remove(item);
    }


    @Override
    public boolean contains(Object item) {
        return set.contains(item);
    }

    @Override
    public int numItems() {
        return set.numItems();
    }

    @Override
    public Object grabAt(int position) {
        mNode n =new mNode();
        n.item = set.grabAt(position);
        return n.item;
    }


    @Override
    public Object[] toArray() {
        return set.toArray();
    }

    @Override
    public void print() {
        set.print();
    }
    @Override
    public boolean clear(){
       set = new mLinkedList();
        return true;
    }

    public mSet union ( mSet pSet1){

      /* for (int i=0;i<pSet1.numItems();i++)
       {
           if (!set.contains(pSet1.grabAt(i)))
           {
               set.add(pSet1.grabAt(i));
           }

       }*/
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

    public mSet difference (mSet pSet){
        mSet intersection = intersection(pSet);
        mSet union = union(pSet);
        for(int i=0;i<intersection.numItems();i++){
            if(union.contains(intersection.grabAt(i)));
            union.remove(intersection.grabAt(i));
        }
        return union;
    }





    @Override
    public boolean removeAt(int position) { return false; }

    @Override
    public boolean addAt(Object item, int position) { return false; }
}
