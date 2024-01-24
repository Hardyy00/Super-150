package Lec62;

// [put, remove, get, containsKey] display, size

import java.util.ArrayList;
import java.util.List;

public class HashMap<K,V> {

    class Node{

        K key;
        V value;
        Node next;
    }

    private List<Node> ll;
    private int size = 0;

    public HashMap(int n ){

        ll = new ArrayList<>();

        for(int i=0;i<n;i++) ll.add(null);
    }

    public HashMap(){
        this(4);
    }

    public int hashFunction(K key){
        int bn = key.hashCode() % ll.size();

        if(bn < 0) bn = bn + ll.size();

        return bn;
    }

    public void put(K key, V value){

        int index = this.hashFunction(key);
        Node temp = ll.get(index);

        while(temp!=null){

            if(temp.key.equals(key)){
                temp.value = value;
                return;
            }

            temp = temp.next;
        }

        Node newNode = new Node();
        newNode.key = key;
        newNode.value  = value;

        temp = ll.get(index);
        newNode.next = temp;
        ll.set(index, newNode);
        this.size++;

        double thresholdFactor = 2.0;  // maximum number of value in the same bucket
        double loadFactor = (1.0 * size) / ll.size();   // current average number of elements per bucket

        if(loadFactor > thresholdFactor) {
            rehashing();
        }
    }

    private void rehashing(){

        // increase the size of map and reinitialize the map ,with the arraylist of size double
        List<Node> newList = new ArrayList<>();

        for(int i=0;i<2 * ll.size();i++) newList.add(null);

        List<Node> temp = ll;
        ll = newList;

        //  put every node in to the map again, so that collision doesn't occur too much
        for(Node node : temp){

            while(node!=null){
                this.put(node.key, node.value);
                node = node.next;
            }
        }

    }

    public V get(K key){

        int index = this.hashFunction(key);
        Node temp = ll.get(index);

        while(temp!=null){

            if(temp.key.equals(key)){
                return temp.value;
            }

            temp = temp.next;
        }

        return null;

    }

    public boolean containsKey(K key){

        int index = this.hashFunction(key);
        Node temp = ll.get(index);

        while(temp!=null){

            if(temp.key.equals(key)){
                return true;
            }

            temp = temp.next;
        }

        return false;

    }

    public V remove(K key){
        int index = hashFunction(key);
        Node curr = ll.get(index);

        Node pre = null;

        while(curr!=null){

            if(curr.key.equals(key)){
                break;
            }

            pre = curr;
            curr= curr.next;
        }

        if(curr == null) return null;



        if(pre== null){
            ll.set(index, curr.next);
            curr.next = null;
            size--;

            return curr.value;
        }

        pre.next = curr.next;
        curr.next = null;
        this.size--;
        return curr.value;


    }

    @Override
    public String toString(){

        String s= "{";
        for(Node node : ll){

            while(node!=null){
                s += node.key + "=" + node.value + ", ";
                node = node.next;
            }
        }

        return s + "}";
    }
}

