package Binarytree;

import java.util.Scanner;

public class treeanalysisi {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    // we are taking normal input  
    public static Node inputtree(Scanner sc){
       System.out.println("ENter the root");
      
       int data=sc.nextInt();

       if(data==-1){
        return null;
       }
       Node root=new Node(data);
       root.left=inputtree(sc);
       root.right=inputtree(sc);
       return root;
    }
    public static void print(Node root){
        if(root==null){
            System.out.print(-1+" ");
            return;
        }
        System.out.print(root.data+" ");
        print(root.left);
        print(root.right);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node root=inputtree(sc);// we can normally apply scanner at function also but unablr to close in the function so send from here 
        print(root);
        System.out.println();
        standardprint(root);
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

}
