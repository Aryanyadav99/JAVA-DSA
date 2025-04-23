// Given a range in which we hahve to pritn the no 
package binarysearchtrees;

public class printrange {
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
    public static void range(Node root,int a, int b){
        if(root==null){
            return;
        }
        // since this is bst so use property to reduce time complexity 
        if(root.data>=a && root.data<=b){
            range(root.left, a, b);
            System.out.print(root.data+" ");
            range(root.right, a, b);
        }
        if(root.data<a){
            range(root.left,a,b);
        }
        else if(root.data>b){
            range(root.right, a, b);
        }
    }
    public static void main(String[]args){
        Node root=new Node(8);
        root.left=new Node(5);
        root.right=new Node(10);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right.right=new Node(11);
        root.left.left.left=new Node(1);
        root.left.left.right=new Node(4);
        root.right.right.right=new Node(14);
        range(root, 5, 12);
    }
}
