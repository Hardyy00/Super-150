package Lec44;


import Lec42.LinkedList;

public class CycleRemoval {

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

    public static void main(String[] args) {

        CycleRemoval ll = new CycleRemoval();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.add(8);
        ll.display();
        ll.cycleRemoval3();
        ll.display();
    }

    public Node hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return slow;
            }
        }
        return null;

    }

    public void createCycle(){
        Node temp = getNode(2);
        this.tail.next = temp;
    }

    public void cycleRemoval1(){
        Node meet = hasCycle(head);

        if(meet==null) return;
        Node curr = head;
        while(curr!=null){
            Node temp = meet;
            while(temp.next!=meet){

                if(temp.next==curr){
                    temp.next = null;
                    return;
                }

                temp = temp.next;
            }
            curr = curr.next;
        }
    }

    private void cyvleRemoval2(){

        Node meet = hasCycle(head);
        if(meet==null) return;
        int count = 1;

        Node curr = meet;
        while(curr.next!=meet){
            count++;
            curr = curr.next;
        }

        Node slow = head,fast = head;
        for(int i=0;i<count;i++) fast = fast.next;

        while(slow.next!=fast.next){
            slow = slow.next;
            fast = fast.next;
        }

        fast.next  = null;
    }

    private void cycleRemoval3(){

        Node meet = hasCycle(head);
        if(meet==null) return;

        Node slow = head,fast = meet;
        while(slow.next!=fast.next){
            fast = fast.next;
            slow = slow.next;
        }

        fast.next  = null;
    }
}
