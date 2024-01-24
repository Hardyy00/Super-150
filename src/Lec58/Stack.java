package Lec58;

/// we use the implement keyword

// final : if a method has a final keyword then that method cannot be overridden
// if class has final then it cannot be inherited
// if a variable has final then it cannot be changed


/// we implement all the methods , i.e methods of stack_interface and also methods of interface that the stack_interface extends
// dynamic_stack and data_structure
public class Stack implements Stack_Interface {

    @Override
    public void push(int item) {
        System.out.println(Stack_Interface.i);
    }

    @Override
    public int pop() {
        return 0;
    }

    @Override
    public int peek() {
        return 0;
    }

    @Override
    public int get() {
        return 0;
    }

    @Override
    public int fun() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void display() {

    }
}
