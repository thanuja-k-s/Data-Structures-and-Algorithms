import java.util.*;
class  Node{
    int data;
    Node next;
    Node(int d){
        this.data=d;
        this.next=null;
    }
}
public class LinkedList{
    static Node head=null;
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int []arr={1,2,3,4,5};
    for(int i:arr){
        insertAtBeginning(i);
    }
    Printing();

    }


public static void insertAtBeginning(int value){
    if(head==null){
        head=new Node(value);
    }
    else{
        Node newnode = new Node(value);
        newnode.next=head;
        head=newnode;
    }
}

static void deleteAtBeginning(){
    head=head.next;
}

static void deleteAtEnd(){
    Node curr=head;
    while(curr.next.next!=null){
        curr=curr.next;

    }
    curr.next=null;
}

public static void Printing(){
    Node curr= head;
    while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }

    }

    public static void insertAtEnd(int val){
        if(head==null){
            head=new Node(val);
        }
        else{
            Node newNode=new Node(val);
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newNode;
        }
    }
    
}
