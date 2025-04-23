// aim:- we have to return diameter with height means return a infofrrmation coantaing diamater and height
// benefit:-- if we make a code to find dia and ht individually then the tc 0(n2);
// so creting height and diamter through a singlr recursive fun make tc 0(n);
package Binarytree;

public class diameteropt {
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
    static class info{
        int ht;
        int dia;
        info(int dia,int ht){
            this.ht=ht;
            this.dia=dia;
        }
    }
    public static info diameter(Node root){// we have to return the object of indo calls thats why return typr is class info
       if(root==null){
        // we can directly retrurn objrct 
        return new info(0,0);
        // ht and dia both are 0 for leaf node
       }
       //firstly take the info for the left
       info li=diameter(root.left);
       //then for right
       info ri=diameter(root.right);
       // now find the dia  
       int ht=Math.max(li.ht,ri.ht)+1;
       int dia=Math.max(Math.max(li.dia, ri.dia),li.ht+ri.ht+1);
      
       // now we have to return object int fo class 
       return new info(dia,ht);
      
    }
    public static void main(String[]args){
        Node root= new Node(1);
         root.left=new Node(2);
         root.right=new Node(3);
         root.left.left=new Node (4);
         root.left.right=new Node(5);
         root.right.left=new Node(6);
         root.right.right=new Node(7);
         System.out.println(diameter(root).dia);
        System.out.println(diameter(root).ht);
    }
}
