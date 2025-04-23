package binarysearchtrees;
//convert the bst to balanced bst 
//way 1 convert the bst to an inorder array and then convert it to balanced bst of min height
// we didnt have the size so use arraylist
// here i made logic and directly store the node so no extra space created for node creation
import java.util.*;
public class bsttobbstopt {
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
    static ArrayList<Node>al=new ArrayList<>();
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        al.add(root);
        inorder(root.right);
    }
    public static Node bbst(Node root2,ArrayList<Node>al,int lp,int rp){
      if(lp>rp){
        return null;
      }
      int mid=(lp+rp)/2;
      root2=al.get(mid);
      root2.left=bbst(root2, al, lp, mid-1);
      root2.right=bbst(root2, al, mid+1, rp);
      return root2;
    }
    public static void priinorder(Node root){
        if(root==null){
            return ;
        }
        priinorder(root.left);
        System.out.print(root.data+" ");
        priinorder(root.right);
        
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[]args){
        Node root=new Node(8);
        root.left=new Node(6);
        root.right=new Node(10);
        root.left.left=new Node(5);
        root.right.right=new Node(11);
        root.left.left.left=new Node(3);
        root.right.right.right=new Node(12);
        inorder(root);
       Node root2= bbst(root, al,0,al.size()-1);
       //check for bst
       priinorder(root2);
       System.out.println();
       //check for balanced 
       preorder(root2);
    }
}