// print all the nodes between root to leaves path from all pathes
//aproach :-- for storing data take a flexible ds like al 
package binarysearchtrees;
import java.util.*;
public class roottoleaf {
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
    public static void rtl(Node root,ArrayList<Integer>al){
        if(root==null){
           return;
        }
        al.add(root.data);
        if(root.left==null &&root.right==null){
            System.out.println(al);
        }
        rtl(root.left, al);
        rtl(root.right, al);
        al.remove(al.size()-1);
   
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
        ArrayList<Integer>al=new ArrayList<>();
        rtl(root,al);
    }
}
