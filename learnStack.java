import java.util.Stack;

public class learnStack {
    public static void main(String[] args) {
        Stack<String> newStack= new Stack<>();
        //add elements to stack- push()
        newStack.push("basu");
        newStack.push("kallapur");
        newStack.push("BMS College of Engineering");
        System.out.println(newStack);
        // to get topmost element- peek()
        System.out.println("topmost value of stack is: " + newStack.peek());
        // to remove topmost elemet- pop()
        newStack.pop();
        System.out.println("newStack after taking out topmost element : " + newStack);



    }
}
