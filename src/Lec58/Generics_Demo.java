package Lec58;

public class Generics_Demo {

    public static void main(String[] args){

        Integer[] arr = {10,203, 45, 89, 18};

        Display(arr);


        String[] strs = {"Hardik", "Vaaraba", "Ossu", "Kayden"};

        Display(strs);


    }

    // add the type parameter before the datatype
    public static <E> void Display(E[] arr){

        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i] + " ");

        }
        System.out.println();

    }

//    public static void Display(Integer[] arr){
//
//        for(int i=0;i<arr.length;i++){
//
//            System.out.print(arr[i] + " ");
//        }
//    }
}
