package Lec58;


/// we can also extend multiple interface within  an interface
public interface Stack_Interface extends Dynammic_Stack, Data_Structute {

    // in interface the methods are by default public

    // if we want to make the methods default access, then we add 'default' modifier

    // the variable is : public static final i=1

    // after java 8 we can give a body to the interface methods

    int i = 1;
    void push(int item);

    int pop();

    int peek();

    // we can give function body to the default methods (default is package-private)  (java -8 feature)
//    default void fun(){
//    }

    // we can also give function body to static methods

//    public static void foo(){
//
//    }

    // from java 9 we can also give function body to private and private static methods

}
