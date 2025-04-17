
package infixtopostfix;

public class Stack {
    private int size;
    private int top;
    private char[] s;

    public Stack(int size) {
        top = -1;
        this.size = size;
        s = new char[this.size];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void Push(char val) {
        if (isFull()) {
            System.out.println("Stack Overflow!!!");
            return;
        }
        s[++top] = val;
    }

    public char Pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return '\0';
        }
        return s[top--];
    }

    public char peek() {
        if (!isEmpty()) {
            return s[top];
        }
        return '\0';
    }

    public boolean isOperand(char ch) {
        return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9');
    }

    public int getPriority(char ch) {
        switch (ch) {
            case '$':
                return 4;
            case '*':
            case '/':
            case '%':
                return 3;
            case '+':
            case '-':
                return 2;
            case '^':
                return 1;
        }
        return 0;
    }

    public String convert(String str) {
        String postfix = "";
        char ch2;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (isOperand(ch)) {
                postfix += ch; 
            } else if (ch == '(') {
                Push(ch); 
            } else if (ch == ')') {
                while (!isEmpty() && peek() != '(') {
                    ch2 = Pop();
                    postfix += ch2; 
                }
                Pop(); 
            } else {
                while (!isEmpty() && getPriority(peek()) >= getPriority(ch) && peek() != '(') {
                    postfix += Pop(); 
                }
                Push(ch);
            }
        }

        while (!isEmpty()) {
            postfix += Pop();
        }

        return postfix;
    }
}
