/*Stack Array Implementation */

import java.util.*;
class StackArray<T>
{
    int size=20;
    T[] arr=(T[])new Object[size];
    int top;
    StackArray()
    {
         top=-1;
    }
    void push(T val)
    {
        if(top==size-1)
            throw new IndexOutOfBoundsException("Stack is Full");
        arr[++top]=val;
        System.out.println(val+" ");
    }
    public T pop()
    {
        if(top>=0)
        {
           return arr[top--];
        }
        else {
            throw new IndexOutOfBoundsException("Sack is empty");
        }
    }
    public boolean isEmpty()
    {
        if(top==-1)
        {
            return true;
        }
        else {
            return false;
        }
    }
    public T peek()
    {
        if(top==-1)
        {
           throw new IndexOutOfBoundsException("Full");
        }
        else {
            return arr[top];
        }
    }
    public static void main(String[] args) {
        StackArray<Integer> S=new StackArray<>();
        S.push(10);
        S.push(20);
        S.push(30);
        S.push(40);
        System.out.println(S.peek());
        System.out.println(S.pop());
    }
}