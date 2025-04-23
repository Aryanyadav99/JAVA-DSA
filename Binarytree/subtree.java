// given a tree and a subtree
// objective :- to check weather the subtree is vaild or not 
// approach -- check wheather the the root of sub tree is lies on th main tree root or not and also having a same  structure and value of all thats node
// approach.....step 1 -- find my subroot in tree 
//step 2---  check identicals (subtree,node subtree) //best to check non identicals because it contain less conditions
// four conditions are 
//1... node data!=root data  2...node==null|| subroot=null; 3...leftsubtree non identical  4...rightsubtree non identicals 
package Binarytree;

public class subtree {
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
        public static boolean isIdentical(Node node,Node subnode){
              //check all the non identical conditions 
              if(node==null&&subnode==null){//if both tree and subtree node are null then its true 
                return true ;
              }
              else if(node==null||subnode==null||node.data!=subnode.data){// if any one is true then retrun false both condition check above so its not counted here
                  return false;
              }
              if(!isIdentical(node.left, subnode.left)){
                return false ;
              }
              if(!isIdentical(node.right, subnode.right)){
                return false;
              }
              return true ;
        }
        public static boolean issubtree(Node root ,Node subroot){ //thats fubction only check is the subroot is preent in main tree or not 
            if(root==null){// then there is not any tree 
                return false ;
            }
            if(subroot==null){// the null always exist in a tree
                return true;
            }
            // for checking proper subtree we also have to use identical fun
            if(root.data==subroot.data){  // check is subroot is tree root
                if(isIdentical(root,subroot)){
                    return true;
                }
            }
            return issubtree(root.left, subroot)||issubtree(root.right, subroot);
            //check is subroot exist in left or right part of tree 
        }
    public static void main(String[]args){
          Node root =new Node(1);
          root.left=new Node(2);
          root.right=new Node(3);
          root.left.left=new Node(4);
          root.left.right=new Node(5);
          root.right.left=new Node(6);
          root.right.right=new Node(7);

          Node subroot=new Node(2);
          subroot.left=new Node(4);
          subroot.right=new Node(5);
          System.out.println(issubtree(root,subroot)); 
        }
}
