/*Insert a node at the head of a linked list */

/*STDIN   Function
-----   --------
5       n = 5
383     data items to insert 383 ... 321
484
392
975
321
Sample Output

321
975
392
484
383 */

static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
    SinglyLinkedListNode newNode=new SinglyLinkedListNode(data);
  newNode.next=llist;
return newNode;

}


/*Insert a Node at the Tail of a Linked List */
/*Sample Input

STDIN   Function
-----   --------
5       size of linked list n = 5
141     linked list data values 141..474
302
164
530
474
Sample Output

141
302
164
530
474 */

static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
    SinglyLinkedListNode newNode=new SinglyLinkedListNode(data);
if(head==null)
{
 return newNode;
}
SinglyLinkedListNode current=head;
while(current.next!=null)
{
current=current.next;
}
current.next=newNode;
return head;

}

/*Print the Elements of a Linked List */
/*Sample Input

STDIN   Function
-----   --------
2       n = 2
16      first data value = 16
13      second data value = 13
Sample Output

16
13 */

static void printLinkedList(SinglyLinkedListNode head) {
    SinglyLinkedListNode current=head;
 while (current!=null) {
     System.out.println(current.data);
     current=current.next;
 }
}