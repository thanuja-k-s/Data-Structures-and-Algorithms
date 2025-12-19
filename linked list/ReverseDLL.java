import java.util.*;
class  Node{
    int data;
    Node next;
    Node prev;
    Node(int d){
        this.data=d;
        this.next=null;
        this.prev=null;
    }
}
public class ReverseDLL{
    static Node head=null;
    static Node tail=null;
     public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        
        head = reverse(head);
        printList(head);
    }

    static Node reverse(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node curr=head;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=curr.prev;
            curr.prev=temp;

            curr=curr.prev;
        }
        Node temp=head;
        head=tail;
        tail=temp;


    }

     static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            if(node.next != null){
                System.out.print(" <-> ");
            }
            node = node.next;
        }
        System.out.println();
    }

    
}
