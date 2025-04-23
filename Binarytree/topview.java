//  here maps datastructure used which is used later
//  for the top view we have to find the horizontal distance and store in hash map set 
//  store from top and store horizontal distance  only one time means make it as a key value
//approach ....  we have to traverse level wise(level order traversal)  in tree
//reason .. those node thats come with unique horizontal distance traced levle wise are comes under top view 
// we also have to tace distance by two value min hd and max hd and at final when we have to print we can print it normally  
package Binarytree;
import java.util.*;
public class topview {
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
    static class Info{
        Node node;
        int hd;
        Info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public static void  topView(Node root){
        // level order traversal 
        Queue<Info>q=new LinkedList<>();
        // in queue we didnot only have to store node we have to store node with hd so we have to store information
         // create a hash map
         HashMap<Integer,Node>map=new HashMap<>();// hd,node
         int min=0;int max=0;
         q.add(new Info(root,0));
         q.add(null);//for next line
         while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr==null){
               if(q.isEmpty()){
                break;
               }
               else{
                q.add(null);
               }
            }
            else{
                if(!map.containsKey(curr.hd)){//it not exist so it comes first time so include in top view 
                    map.put(curr.hd,curr.node);
               }
               if(curr.node.left!=null){
                   q.add(new Info(curr.node.left,curr.hd-1));
                   min=Math.min(min,curr.hd-1);
               }
               if(curr.node.right!=null){
                   q.add(new Info(curr.node.right, curr.hd+1));
                   max=Math.max(max,curr.hd+1);
               }
            }

         }
         for(int i=min;i<=max;i++){
            System.out.println(map.get(i).data+" ");
         }
    }
    public static void main(String[]args){
        Node root =new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
         topView(root);

    }
}
