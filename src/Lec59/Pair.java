package Lec59;

// a generic class
public class Pair<E,T> {

    E x;
    T y;


    public static void main(String[] args) {

        Pair<Integer, String> pair= new Pair<>();


        pair.x = 2;
        pair.y = "Hardik";

    }
}
