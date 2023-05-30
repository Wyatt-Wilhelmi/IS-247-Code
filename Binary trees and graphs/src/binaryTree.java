
public class binaryTree  
{ 
 
 Node root; 
    
int getCount()  
 { 
     return getCount(root); 
 } 

 int getCount(Node node)  
 { 
     if (node == null) 
         return 0; 
     if (node.left == null && node.right == null) 
         return 1; 
     else
         return getCount(node.left) + getCount(node.right); 
 }
 
  
}