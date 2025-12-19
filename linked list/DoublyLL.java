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
public class DoublyLL{
    static Node head=null;
    static Node tail=null;
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    
    
    insertAtBeginning(4);
    InsertAtEnd(7);
    insertAtBeginning(9);
    insertAtBeginning(5);
    
    Printing();
    deleteAtBeginning();
    deleteAtEnd();
    Printing();
    insertAtPosition(10,2 );
    Printing();
    deleteAtPosition(3);

    }

    

    public static void insertAtBeginning(int data){
        if(head==null){
            head=new Node(data);
            tail=head;
        }
        else{
            Node newNode=new Node(data);
            head.prev=newNode;
            newNode.next=head;
            head=newNode;
        }
    }

    public static void insertAtPosition(int data,int pos){

        if(head==null){
             head=new Node(data);
             tail=head;

        }
        else{
            Node newNode=new Node(data);
            Node curr=head;
            for(int i=0;i<pos-1;i++){
                curr=curr.next;
            }

            newNode.next=curr.next;
            curr.next.prev=newNode;
            curr.next=newNode;
            newNode.prev=curr;
        }

    }

    public static void InsertAtEnd(int data){
        if(head==null){
            head=new Node(data);
            tail=head;
        }
        else{
            Node newNode=new Node(data);
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }
        static void deleteAtBeginning(){
            head=head.next;
            head.prev=null;
         }

         static void deleteAtPosition(int val){
            Node dummynode = new Node(0);
                dummynode.next=head;
                Node curr=dummynode;
                while(curr.next!=null){
                    if(curr.next.data==val){
                        curr.next=curr.next.next;
                        if(curr.next==null){
                            tail=curr;
                        }
                        else{
                            curr.next.prev=curr;
                        }
                    }
                    else{
                        curr=curr.next;
                    }
                }
                head=dummynode.next;
         }

        static void deleteAtEnd(){
            tail=tail.prev;
            tail.next=null;   
        }

        public static void Printing(){
        Node curr= head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }

    }
}
