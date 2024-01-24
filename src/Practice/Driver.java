package Practice;

public class Driver {

    public static void main(String[] args) throws Exception {

        Stack stack = new Stack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push(10);
        stack.push(11);
        stack.display();

    }
}
