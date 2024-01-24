package Lec60;

import java.util.ArrayList;

public class Heap {

    private ArrayList<Integer> list;

    public Heap(){
        list = new ArrayList<>();
    }

    public void add(int item){
        list.add(item);
        upheapify(list.size()-1);
    }

    private void upheapify(int index){

        int parentIndex = (index -1)/2;

        if(list.get(parentIndex) > list.get(index) ){
            swap(parentIndex, index);
            upheapify(parentIndex);
        }
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void swap(int parentIndex, int childIndex){

        int parentData = list.get(parentIndex);
        list.set(parentIndex, list.get(childIndex));
        list.set(childIndex, parentData);
    }

    public int get(){
        return list.get(0);
    }

    public void display(){
        System.out.println(list);
    }

    public int remove(){
        int rv = list.get(0);
        swap(0, list.size()-1);
        list.remove(list.size()-1);

        downHeapify(0);
        return rv;
    }

    private void downHeapify(int parentIndex){


        /// change the parent element with the minimum of the children, and do it recursively
        int lci = 2*parentIndex + 1;
        int rci = 2*parentIndex + 2;
        int mini = parentIndex;

        if(lci < list.size() && list.get(lci) < list.get(mini)){
            mini = lci;
        }

        if(rci < list.size() && list.get(rci) < list.get(mini)){
            mini = rci;
        }

        if(mini != parentIndex){
            swap(parentIndex, mini);
            downHeapify(mini);
        }


    }




}
