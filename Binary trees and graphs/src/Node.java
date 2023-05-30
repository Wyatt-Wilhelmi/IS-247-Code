
class Node  
{ 
 int data; 
 Node left, right; 

 public Node(int item)  
 { 
     data = item; 
     left = right = null; 
 }
 public static void main(String args[])  
 { 
     binaryTree tree = new binaryTree(); 
     tree.root = new Node(32); 
     tree.root.left = new Node(17); 
     tree.root.right = new Node(28); 
     tree.root.left.left = new Node(37); 
     tree.root.left.right = new Node(54); 
     tree.root.left.left.left = new Node (21);
     tree.root.left.left.right = new Node (8);
     tree.root.left.right.left = new Node(40);
     tree.root.left.right.right = new Node(29);
     tree.root.left.right.right.right = new Node(13); 
     System.out.println(tree.getCount()); 
 }
}
 


