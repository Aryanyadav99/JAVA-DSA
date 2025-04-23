//given :- kth level
//objective:-- to have to find all the nodes on thats level
//appoach :- we can do iterative level or search or by recursion 
// for recursion :- by preorder traverssal check level all nodes if its same to required and pront that level 
package Binarytree;
 import java.util.*;
public class kthlevel {
    static class Node  {
        int data;
        Node left;
        Node right;
        Node(int data){
           this.data=data;
           this.left=null;
           this.right=null;
        }
     }
    public static void main(String[]args){
       Node root=new Node(1);
       root.left=new Node(2);
       root.right=new Node(3);
       root.left.left=new Node(4);
       root.left.right=new Node(5);
       root.right.left=new Node(6);
       root.right.right=new Node(7);
       Scanner sc=new Scanner (System.in);
       int kth=sc.nextInt();
       sc.close();

       int lvl=1;
       findkth(root,lvl,kth);
    }
    public static void findkth(Node root,int lvl,int k){
          if(root==null){
            return;
          }
          if(lvl==k){
            System.out.println(root.data);
          }
          findkth(root.left, lvl+1, k);
          findkth(root.right, lvl+1, k);

    }
}
