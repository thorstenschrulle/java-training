// http://www.codeadventurer.de/?p=3277
import stack.StackLike;

public class TestStack {
    public static void main(String[] args) {
        StackLike stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }
}
