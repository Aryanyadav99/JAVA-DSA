//approach:-- firstly find my node  and use min dis strategy with modifications 
//check dis+1 ==k then its a kth ansesotor
package Binarytree;

public class kthansestor {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int kans(Node root,int n,int k){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftdis=kans(root.left, n, k);
        int rightdis=kans(root.right, n, k);
        if(leftdis==-1 && rightdis==-1){
            return-1;
        }
        int max=Math.max(leftdis,rightdis);
        if(max+1==k){
            System.out.println(root.data);
        }
        return max+1;
    }
public static void main(String[]args){
    Node root=new Node(1);
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node (4);
    root.left.right=new Node(5);
    root.right.left=new Node(6);
    root.right.right=new Node(7);
    kans(root,5,2);
}    
}
