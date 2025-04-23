package Binarytree;

import java.util.Scanner;

public class treeanalysisadv {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    // taking adv input
    public static Node input(boolean isroot,boolean isleft,Scanner sc,int parentdata){
        if(isroot){
            System.out.println("ENTERS ROOT DATA");
        }
        else{
            if(isleft){
                System.out.println("ENTERS LEFT CHILD OF " +parentdata+":");
            }
            else{
                System.out.println("ENTERS RIGHT CHILD OF " +parentdata+":");
            }
        }
        int data=sc.nextInt();
        Node root=new Node(data);
        if(root.data==-1){
            return null;
        }
        root.left=input(false, true, sc, data);
        root.right=input(false, false, sc, data);
        return root;
    }
    public static void standardprint(Node root){
        if(root==null){
           return;
        }
        System.out.print("root"+root.data+":");
        if(root.left!=null){
           System.out.print("l"+root.left.data+" ");
        }
        if(root.right!=null){
           System.out.print("r"+root.right.data+" ");
        }
        System.out.println();
        standardprint(root.left);
       
        standardprint(root.right);
   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      Node root=  input(true, false, sc, 0);
      standardprint(root);
    }
}
