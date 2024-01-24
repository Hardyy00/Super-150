package Lec59;

import java.util.Arrays;
import java.util.Comparator;

public class CarsClient {

    public static void main(String[] args) {

        Cars[] arr = new Cars[4];

        arr[0] = new Cars(2,9,"blue");
        arr[1] = new Cars(3,4,"red");
        arr[2] = new Cars(1,8,"pink");
        arr[3] = new Cars(4,1,"yellow");

//        bubbleSort(arr);
        display(arr);


        Arrays.sort(arr, new Comparator<Cars>() {
            @Override
            public int compare(Cars o1, Cars o2) {
                return o1.speed - o2.speed;
            }
        });



    }

    public static void display(Cars[] arr){

        for(Cars car : arr){

            System.out.println(car);
        }
    }

    private static <T extends Comparable<T>> void bubbleSort(T[] arr) {

        for(int i=1; i<arr.length;i++) {

            for(int j=0;j<arr.length-i;j++) {

                if(arr[j].compareTo(arr[j+1]) > 0) {

                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }
    }
}
