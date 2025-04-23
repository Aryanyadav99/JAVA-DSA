// objective to find the mirror binary search tree
//left subtrrree become right subtree and right subtree become left subtree for each and every  node 
package binarysearchtrees;

public class mirrorbst {
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
    public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public static Node mirror(Node root){
            if(root==null){
                return root;
            }
           Node ls= mirror(root.left);
           Node rs=mirror(root.right);
           root.left=rs;
           root.right=ls;
           return root;
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
        inorder(root);
        mirror(root);
        System.out.println();
        inorder(root);
    }
}
