
class MyStack
{
    private int[] stack;
    private int capacity;
    private int top;

    public MyStack(int size)
    {
         stack = new int[size];
         capacity = size;
         top = -1;
    }
    public void push(int value)
    {
        if(top == capacity - 1)
        {
            System.out.println("Stack overflow");
            return;
        }
        stack[++top] = value;
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top--];
    }
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is overflow");
            return -1;
        }
        return stack[top];
    }
    public int size()
    {
        return top + 1;
    }
    public boolean isEmpty()
    {
        return top == -1;
    }

    public static void main(String[] args) {
        MyStack s = new MyStack(5);
        s.push(10);
        s.push(20);
        s.push(50);
        s.push(30);

        System.out.println(s.peek());
        System.out.println( s.pop());
        System.out.println(s.peek());
        s.push(20);

    }
} {
    
}
