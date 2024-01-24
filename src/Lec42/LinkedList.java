package Lec42;

public class LinkedList {

    private Node head;
    private int size;
    private Node tail;

    private class Node{

        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data){

        this.size++;
        if(head==null){
            head = new Node(data);
            tail = head;
            return;
        }

        Node temp = new Node(data);
        temp.next = head;
        this.head = temp;

    }

    public void add(int data){

        this.size++;
        if(head==null){
            head = new Node(data);
            tail = head;
            return;
        }

        tail.next =  new Node(data);
        tail = tail.next;
    }

    public void add(int index,int data){

        if(index < 0 || index >size){
            throw new RuntimeException("Out of Bound");
        }

        if(index==0){
            this.addFirst(data);
            return;
        }

        if(index==size){
            this.add(data);
            return;
        }

        Node temp = getNode(index-1);
        Node add = new Node(data);
        add.next = temp.next;
        temp.next = add;
    }

    public int removeFirst(){

        if(head==null) throw new RuntimeException("Linked List is empty");

        size--;

        if(head.next ==null){
           int data = head.data;
           head= null;
           tail = null;
           return data;
        }

        Node temp = head;
        head = head.next;
        int data  = temp.data;
        temp.next = null;
        return data;
    }

    public int removeLast() throws Exception{

        if(size==0){
            throw new RuntimeException("Empty List");
        }

        if(size==1){
            return removeFirst();
        }

        int data = tail.data;

        Node temp = getNode(size-2);
        tail = temp;
        tail.next = null;
        size--;
        return data;

    }

    private int remove(int index) throws Exception {

        if(size==0) throw new RuntimeException("Bhai List Khali hai");

        if(index==0) return removeFirst();

        if(index==size-1) return removeLast();


        Node back = getNode(index-1);
        Node temp = back.next;
        back.next =temp.next;
        int data = temp.data;
        temp.next = null;

        return data;

    }

    public int getFirst(){

        if(head==null){
            throw new RuntimeException("Empty List");
        }

        return head.data;
    }

    public int getLast(){

        if(head==null){
            throw new RuntimeException("Empty List");
        }

        return tail.data;
    }

    public int get(int k){

        return getNode(k).data;
    }

    public void display(){

        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    private Node getNode(int k){

        if(k<0 || k>=size){
            throw new RuntimeException("Out of Bound is the");
        }

        Node curr = head;
        for(int i=0;i<k;i++){
            curr = curr.next;
        }

        return curr;
    }

    public int size(){
        return this.size;
    }

    public static void main(String[] args) throws Exception {

        LinkedList ll = new LinkedList();

        System.out.println(ll.size());
        ll.addFirst(1);
        ll.add(2);
        ll.add(9);
        ll.display();
        System.out.println(ll.size());
        ll.add(1,10);
        ll.display();
        System.out.println(ll.remove(1));
        ll.display();
//        System.out.println();

        ll.removeFirst();
        ll.removeLast();
        ll.display();

        ll.remove(0);
        ll.size();
        ll.display();
    }
}
