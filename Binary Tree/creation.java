import java.util.*;
class Node{
    int val;
    Node left;
    Node right;
    Node(int data){
        this.val=data;
        this.left=null;
        this.right=null;
    }
}



public class creation {


    static List<Integer> list=new ArrayList<>();
    public static List<Integer> postorderTraversal(Node root) {

        postorder(root);
        return list;
        
    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        list.add(root.val);
    }

    public static void bfs(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node x=q.poll();
            System.out.print(x.val+" ");
            if(x.left!=null){
                q.add(x.left);
            }
            if(x.right!=null){
                q.add(x.right);
            }
        }

    }


    
    public static void main(String [] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        List<Integer> list1=new ArrayList<>(postorderTraversal(root));

        for(int num:list1){
            System.out.print(num+" ");

        }

        bfs(root);

        
    }


    
}
