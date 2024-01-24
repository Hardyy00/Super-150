package Lec60;

public class Heap_Client {

    public static void main(String[] args) {

        Heap pq = new Heap();

        pq.add(5);
        pq.add(7);
        pq.add(2);
        pq.add(9);
        pq.add(0);
        pq.add(3);
        pq.add(4);

        while(!pq.isEmpty()) System.out.println(pq.remove());
    }
}
