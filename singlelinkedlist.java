import java.io.*;
public class singlelinkedlist {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    void deleteNode(int key)
    {
        Node temp = head, prev = null;
        if (temp != null && temp.data == key) {

            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null)
        return;

    prev.next = temp.next;
 }
public void push(int new_data)
{
    Node new_node = new Node(new_data);
    new_node.next = head;
    head = new_node;
}
public void printList()
{
    Node tnode = head;
    while (tnode != null) {
        System.out.print(tnode.data + " ");
        tnode = tnode.next;
    }
}
    public static void main(String[] args){
    
        singlelinkedlist llist = new singlelinkedlist();

        llist.push(9);
        llist.push(12);
        llist.push(9);
        llist.push(7);

        System.out.println("Created Linked List:");
        llist.printList();
        llist.deleteNode(12);
        System.out.println(
            "\nLinked List after Deletion of 1:");
        llist.printList();
    }
}




    

