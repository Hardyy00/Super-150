package Lec58;

public class Abstract_Class_Client {

    public static void main(String[] args) {


        // Anonymous way to instantiate an abstract class

        Abstract_Class ac = new Abstract_Class() {     // defining the unimplemented methods at the time of object instantiation
            @Override
            public void Payment() {

            }
        };
    }
}
