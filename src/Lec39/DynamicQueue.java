package Lec39;

public class DynamicQueue<E> extends Queue {

    @SuppressWarnings("unchecked warning")
    @Override
    public void enqueue(Object data) throws Exception {

        if(isFull()){

            E[] a = (E[])new Object[2*arr.length];
            for(int i=0;i<arr.length;i++){

                a[i] = (E) arr[(front + i)%arr.length];
            }

            front = 0;
            arr = a;
        }

        super.enqueue(data);



    }
}
