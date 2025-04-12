package stackpackage;
import java.util.*;

public class Stack<T> {
    private int size;
    private int top;
    private T[] s; 
    private Scanner sc = new Scanner(System.in);

    public Stack() {
        top = -1;
    }

    @SuppressWarnings("unchecked")
    public void init() {
        System.out.println("Enter size of stack:");
        size = sc.nextInt();
        s = (T[]) new Object[size]; 
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void Push(T val) {
        if (isFull()) {
            System.out.println("Stack Overflow!!!");
            return;
        }
        s[++top] = val;
    }

    public T Pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return null; 
        }
        return s[top--];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
    }
}