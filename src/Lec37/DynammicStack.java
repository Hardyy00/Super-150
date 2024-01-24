package Lec37;

import java.util.List;

public class DynammicStack  extends Stack {

    @Override
    public void push(int data) throws Exception {
        if(isfull()){
            int[] a = new int[2*arr.length];
            for(int i=0;i<arr.length;i++){
                a[i] = arr[i];
            }

            arr = a;
        }

        super.push(data);
    }
}
