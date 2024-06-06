package com.ajith.tree;

class Node {
    int data;
    Node left;
    Node right;

    public Node (int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class BinarySearchTree {

    private Node root;

    public BinarySearchTree (){
        root = null;
    }
    public void insert(int data){
        Node node = new Node(data);
        if(root == null){
            root = node;
            return;
        }
        Node currentNode = root;

        while(true){
            if(data < currentNode.data){
                if(currentNode.left == null){
                    currentNode.left = node;
                    break;
                }
                else{
                    currentNode = currentNode.left;
                }
            }
            if(data > currentNode.data){
                if(currentNode.right == null){
                    currentNode.right = node;
                    break;
                }
                else{
                    currentNode = currentNode.right;
                }
            }
        }
    }

    public void insertRecursive(int data){
      root =  insertHelper ( root, data );
    }

    public Node insertHelper(Node root, int data){

        if(root == null){
            root = new Node(data);
        }
        else if (data < root.data){
            root.left = insertHelper ( root.left , data );
        }
        else if (data > root.data){
            root.right = insertHelper ( root.right , data );
        }
        return root;
    }

    public void  inOrder (){
        inOrderHelper (root);
    }
    private static void inOrderHelper (Node root){

      if(root != null){
          inOrderHelper ( root.left );
          System.out.print (root.data + " " );
          inOrderHelper ( root.right );
      }
    }
}
