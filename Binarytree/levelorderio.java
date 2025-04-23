package Binarytree;

import java.util.*;

public class levelorderio {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node input(Scanner sc){
        System.out.println("Eneter the root data");
        int data=sc.nextInt();
        Node root=new Node(data);
        if(root.data==-1){
             return null;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node front=q.remove();
            System.out.println("Enter the left value of"+front.data);
            int left=sc.nextInt();
            if(left!=-1){
                Node leftchild=new Node(left);
                front.left=leftchild;
                q.add(leftchild);
            }
            System.out.println("ENter the right value of "+front.data);
            int right=sc.nextInt();
            if(right!=-1){
              Node rightchild=new Node(right);
              front.right=rightchild;
              q.add(rightchild);
            }
        }
        return root;
    }
    public static void levelprint(Node root){
        if(root==null){
            return;
        }
       Queue<Node>q=new LinkedList<>();
       q.add(root);
       q.add(null);
       while(!q.isEmpty()){
        Node temp=q.remove();
        if(temp==null){
            System.out.println();
            if(q.isEmpty()){
                break;
            }
            else{
                q.add(null);
            }
        }
        else{
            System.out.print(temp.data+" ");
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
       }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node root=input(sc);
        levelprint(root);
    }
}
