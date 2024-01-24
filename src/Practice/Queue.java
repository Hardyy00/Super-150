package Practice;

public class Queue {

    private int[] arr;;
    private int front;
    private int size;

    public Queue(){
        this.arr= new int[5];
        this.front = 0;
        this.size =0;
    }

    public Queue(int n){
        this.arr= new int[n];
        this.front = 0;
        this.size =0;
    }

    public boolean isEmpty(){

        return size==0;
    }

    public int size(){
        return size;
    }

    public void enqueue(int data) throws Exception{

        if(size==arr.length) throw new Exception("Bhai Queue Full Hai");

        arr[(front+size)%arr.length] = data;
        size++;
    }

    public int dequeue(int data) throws Exception{

        if(this.isEmpty()) throw new Exception("Queue is Empty");

        int pop = arr[front];
        front = (front+1)% arr.length;
        size--;
        return pop;
    }

    public void display(){

        for(int i=0;i<size;i++){
            System.out.print(arr[(front+i)%arr.length] + " ");
        }

        System.out.println();
    }
}
