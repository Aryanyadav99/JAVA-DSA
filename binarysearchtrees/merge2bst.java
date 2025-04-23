// we have to make a balanced bst by merging two bst 
// we know by sorted array we can create a balaced bst 
// find inorder sequence of bst 1 and bst 2 
// merge inorder sequemmce and form a big sorted array
package binarysearchtrees;

import java.util.*;

public class merge2bst {
    static class Node {
      int data;
      Node left;
      Node right;
      Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
      }
    }
    public static ArrayList<Integer>al=new ArrayList<>();
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        al.add(root.data);
        inorder(root.right);
    }
    public static void makesort(ArrayList<Integer>al){
        Collections.sort(al);
    }
    public static Node buildbst(ArrayList<Integer>al,int lp,int rp){
     if(lp>rp){
        return null;
     }
     int mid=(lp+rp)/2;
     Node root3=new Node(al.get(mid));
     root3.left=buildbst(al, lp, mid-1);
     root3.right=buildbst(al, mid+1, rp);
     return root3;
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
        Node root1=new Node(2);
        root1.left=new Node(1);
        root1.right=new Node (4);
        Node root2=new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(14);
        inorder(root1);
        inorder(root2);
        makesort(al);
        Node root3=buildbst(al,0,al.size()-1);
        preorder(root3);
    }
}
