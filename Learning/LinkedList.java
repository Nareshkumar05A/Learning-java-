import java.util.*;
class Naresh
{
    class Node
    {
        int data;
        Node next;
        Node(int val)
        {
            data=val;
            next=null;
        }
    }
    Node head;

    public void InsertAtBiggining(int val)
    {
        Node newNode=new Node(val);
        if(head==null)
        {
            head=newNode;
        }
        else {
            newNode.next=head;
            head=newNode;
        }
    }

    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }
        System.out.print("Null");
    }

    public void InsertPosSomeThing(int pos,int val)
    {
        if(pos==0)
        {
            InsertAtBiggining(val);
            return;
        }
        Node newNode=new Node(val);
        Node temp=head;
        for(int i=0;i<pos;i++)
        {
            temp=temp.next;
            if(temp==null)
            {
                System.out.println("Invalid posotion");
                return;
            }
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public static void main(String[] args) {
        Naresh list=new Naresh();

        list.InsertAtBiggining(30);
        list.InsertAtBiggining(20);
        list.InsertAtBiggining(10);
        list.display();

        System.out.println("");
        list.InsertPosSomeThing(10,40);
        list.display();
    }
}