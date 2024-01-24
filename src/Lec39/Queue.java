package Lec39;

public class Queue<E> {

    protected E[] arr;
    protected int front;
    protected int size;

    @SuppressWarnings("unchecked warning")
    public Queue(){
        this.arr = (E[])(new Object[5]);
        this.front  = 0;
        this.size = 0;
    }

    @SuppressWarnings("unchecked warning")
    public Queue(int capacity){
        this.arr = (E[])(new Object[capacity]);
        this.front  = 0;
        this.size = 0;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isFull(){
        return size== arr.length;
    }

    public int size(){
        return this.size;
    }

    public void enqueue(E data) throws Exception {

        if(isFull()) throw new Exception("Chutiye Queue Full ho gya hai");
        int index = (front+size)%arr.length;
        arr[index] = data;
        size++;
    }

    public E dequeue() throws Exception{

        if(isEmpty()) throw new Exception("Queue is Empty Biro");
        E rv = arr[front];
        front = (front+1)%arr.length;
        size--;
        return rv;
    }

    public E getFront() throws  Exception{

        if(isEmpty()) throw new Exception("Queue is Empty Biro");

        return arr[front];
    }

    public void display(){

        if(size==0){
            System.out.println("Queue is Empty");
            return;
        }

        for (int i=0;i<size;i++){
            System.out.print(arr[(front+i)%arr.length] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) throws Exception {

        Queue<Character> queue= new Queue<>(5);

        queue.enqueue('c');
        queue.enqueue('d');
        queue.enqueue('e');
        queue.enqueue('e');
        queue.enqueue('e');
//        queue.enqueue('e');

        queue.display();
    }




}
