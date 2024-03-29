package Practice;

public class Stack {

    private int[] arr;
    private int top;

    public Stack(){
        this.arr = new int[5];
        this.top = -1;
    }

    public Stack(int n){
        this.arr = new int[n];
        this.top = -1;
    }

    public void push(int data) throws Exception{

        if(top==arr.length-1) throw new RuntimeException("Bhai Stack Full Hai");

        arr[++top] = data;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public int size(){
        return top+1;
    }

    public int pop() throws Exception{

        if(top==-1) throw new RuntimeException("Bhai Stack Empty Hai");

        return arr[top--];
    }

    public void display(){

        for(int i=0;i<=top;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
