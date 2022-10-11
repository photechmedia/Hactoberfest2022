/* 
 *  A sample Java Program to Implement the Red-Black Tree Data Structure 
 */   
 // The Scanner class from the util is imported to take input from the user   
 import java.util.Scanner;  
   
  
 // A class named Node_Red_Black_Tree is created whose each object will work as a Node of the Red-Black Tree  
 class Node_Red_Black_Tree  
 {      
  
    // Each element of the Red Black tree node has four members.  
    // Out of these four members two variables are of Node_Red_Black_Tree class type named left_node_addr and right_node_addr storing the left and right nodes of the previous node   
    Node_Red_Black_Tree left_node_addr, right_node_addr;  
    // The node_data Integer variable is used to store the data present in that particular node  
    int node_data;  
    // The node_data Integer variable is used to store the color of that particular node  
    int colour_of_node;  
   
     /* Constructor of Node_Red_Black_Tree class */  
     public Node_Red_Black_Tree(int thenode_data)  
     {  
         this( thenode_data, null, null );  
     }   
     /* Constructor of Node_Red_Black_Tree class */  
     public Node_Red_Black_Tree(int thenode_data, Node_Red_Black_Tree lt, Node_Red_Black_Tree rt)  
     {  
         left_node_addr = lt;  
         right_node_addr = rt;  
         node_data = thenode_data;  
         colour_of_node = 1;  
     }      
 }  
   
 // A class named Node_Red_Black_Tree is created whose each object will work as the Red-Black Tree  
 class Red_Black_Tree  
 {  
     private Node_Red_Black_Tree current_node;  
     private Node_Red_Black_Tree parent_node;  
     private Node_Red_Black_Tree grand_node;  
     private Node_Red_Black_Tree great_node;  
     private Node_Red_Black_Tree header_node;      
     private static Node_Red_Black_Tree node_null;  
       
     /* static block to initialize the data */  
     static   
     {  
         node_null = new Node_Red_Black_Tree(0);  
         node_null.left_node_addr = node_null;  
         node_null.right_node_addr = node_null;  
     }  
       
     // color coding  
     /* Black - 1  RED - 0 */  
     static final int BLACK = 1;      
     static final int RED   = 0;  
   
     /* Constructor of the Red_Black_Tree class  */  
     public Red_Black_Tree(int negInf)  
     {  
         header_node = new Node_Red_Black_Tree(negInf);  
         header_node.left_node_addr = node_null;  
         header_node.right_node_addr = node_null;  
     }  
     /* Function to check if tree is empty */  
     public boolean isEmpty()  
     {  
         return header_node.right_node_addr == node_null;  
     }  
     /* Make the tree logically empty */  
     public void makeEmpty()  
     {  
         header_node.right_node_addr = node_null;  
     }  
     /* Function to insert item in the Red_Black_Tree class object */  
     public void insert(int item )  
     {  
         current_node = parent_node = grand_node = header_node;  
         node_null.node_data = item;  
         while (current_node.node_data != item)  
         {              
             great_node = grand_node;   
             grand_node = parent_node;   
             parent_node = current_node;  
             current_node = item < current_node.node_data ? current_node.left_node_addr : current_node.right_node_addr;  
             // Check if two red children and fix if so              
             if (current_node.left_node_addr.colour_of_node == RED && current_node.right_node_addr.colour_of_node == RED)  
                 handleReorient( item );  
         }  
         // Insertion fails if already present  
         if (current_node != node_null)  
             return;  
         current_node = new Node_Red_Black_Tree(item, node_null, node_null);  
         // Attach to parent_node  
         if (item < parent_node.node_data)  
             parent_node.left_node_addr = current_node;  
         else  
             parent_node.right_node_addr = current_node;          
         handleReorient( item );  
     }  
     private void handleReorient(int item)  
     {  
         // Do the colour_of_node flip  
         current_node.colour_of_node = RED;  
         current_node.left_node_addr.colour_of_node = BLACK;  
         current_node.right_node_addr.colour_of_node = BLACK;  
   
         if (parent_node.colour_of_node == RED)     
         {  
             // Have to rotate  
             grand_node.colour_of_node = RED;  
             if (item < grand_node.node_data != item < parent_node.node_data)  
                 parent_node = rotate( item, grand_node );  // Start dbl rotate  
             current_node = rotate(item, great_node );  
             current_node.colour_of_node = BLACK;  
         }  
         // Make root black  
         header_node.right_node_addr.colour_of_node = BLACK;   
     }        
     private Node_Red_Black_Tree rotate(int item, Node_Red_Black_Tree parent_node)  
     {  
         if(item < parent_node.node_data)  
             return parent_node.left_node_addr = item < parent_node.left_node_addr.node_data ? rotateWithleft_node_addrChild(parent_node.left_node_addr) : rotateWithright_node_addrChild(parent_node.left_node_addr) ;    
         else  
             return parent_node.right_node_addr = item < parent_node.right_node_addr.node_data ? rotateWithleft_node_addrChild(parent_node.right_node_addr) : rotateWithright_node_addrChild(parent_node.right_node_addr);    
     }  
     /* Rotate binary tree node with left_node_addr child */  
     private Node_Red_Black_Tree rotateWithleft_node_addrChild(Node_Red_Black_Tree k2)  
     {  
         Node_Red_Black_Tree k1 = k2.left_node_addr;  
         k2.left_node_addr = k1.right_node_addr;  
         k1.right_node_addr = k2;  
         return k1;  
     }  
     /* Rotate binary tree node with right_node_addr child */  
     private Node_Red_Black_Tree rotateWithright_node_addrChild(Node_Red_Black_Tree k1)  
     {  
         Node_Red_Black_Tree k2 = k1.right_node_addr;  
         k1.right_node_addr = k2.left_node_addr;  
         k2.left_node_addr = k1;  
         return k2;  
     }  
  
/* Functions to count number of nodes */  
     public int countNodes()  
     {  
         return countNodes(header_node.right_node_addr);  
     }  
     private int countNodes(Node_Red_Black_Tree r)  
     {  
         if (r == node_null)  
             return 0;  
         else  
         {  
             int l = 1;  
             l += countNodes(r.left_node_addr);  
             l += countNodes(r.right_node_addr);  
             return l;  
         }  
     }  
     /* Functions to search for an node_data */  
     public boolean search(int val)  
     {  
         return search(header_node.right_node_addr, val);  
     }  
     private boolean search(Node_Red_Black_Tree r, int val)  
     {  
         boolean found = false;  
         while ((r != node_null) && !found)  
         {  
             int rval = r.node_data;  
             if (val < rval)  
                 r = r.left_node_addr;  
             else if (val > rval)  
                 r = r.right_node_addr;  
             else  
             {  
                 found = true;  
                 break;  
             }  
             found = search(r, val);  
         }  
         return found;  
     }  
     /* Function for in order traversal of the Red_Black_Tree class object*/   
     public void inorder()  
     {  
         inorder(header_node.right_node_addr);  
     }  
     private void inorder(Node_Red_Black_Tree r)  
     {  
         if (r != node_null)  
         {  
             inorder(r.left_node_addr);  
             char c = 'B';  
             if (r.colour_of_node == 0)  
                 c = 'R';  
             System.out.print(r.node_data +""+c+" ");  
             inorder(r.right_node_addr);  
         }  
     }  
     /* Function for pre-order traversal of the Red_Black_Tree class object*/   
     public void preorder()  
     {  
         preorder(header_node.right_node_addr);  
     }  
     private void preorder(Node_Red_Black_Tree r)  
     {  
         if (r != node_null)  
         {  
             char c = 'B';  
             if (r.colour_of_node == 0)  
                 c = 'R';  
             System.out.print(r.node_data +""+c+" ");  
             preorder(r.left_node_addr);               
             preorder(r.right_node_addr);  
         }  
     }  
     /* Function for post-order traversal of the Red_Black_Tree class object*/  
     public void postorder()  
     {  
         postorder(header_node.right_node_addr);  
     }  
     private void postorder(Node_Red_Black_Tree r)  
     {  
         if (r != node_null)  
         {  
             postorder(r.left_node_addr);               
             postorder(r.right_node_addr);  
             char c = 'B';  
             if (r.colour_of_node == 0)  
                 c = 'R';  
             System.out.print(r.node_data +""+c+" ");  
         }  
     }       
 }  
   
 /* Class Red_Black_Tree_Run */  
class Red_Black_Tree_Run  
 {  
     public static void main(String[] args)  
     {              
        Scanner scannner_object = new Scanner(System.in);  
        /* Creating object of RedBlack Tree */  
        Red_Black_Tree red_black_tree_object = new Red_Black_Tree(Integer.MIN_VALUE);   
        System.out.println("Red Black Tree Test\n");            
        char ch;  
        /*  Perform tree operations  */  
        do      
        {  
            System.out.println("\nThe options list for Red Black Tree::\n");  
            System.out.println("1. To add a new node in the Red-Black Tree");  
            System.out.println("2. To search the Red-Black Tree for a node");  
            System.out.println("3. To get node count of nodes in Red Black Tree");  
            System.out.println("4. To check if the Red_Black_Tree is Empty or not?");  
            System.out.println("5. To Clear the Red_Black_Tree.");  
   
            int option_list_choice = scannner_object.nextInt();              
            switch (option_list_choice)  
            {  
            case 1 :   
                System.out.println("Enter integer node_data to insert");  
                red_black_tree_object.insert( scannner_object.nextInt() );                       
                break;                            
            case 2 :   
                System.out.println("Enter integer node_data to search");  
                System.out.println("Search result : "+ red_black_tree_object.search( scannner_object.nextInt() ));  
                break;                                            
            case 3 :   
                System.out.println("Nodes = "+ red_black_tree_object.countNodes());  
                break;       
            case 4 :   
                System.out.println("Empty status = "+ red_black_tree_object.isEmpty());  
                break;       
            case 5 :   
                System.out.println("\nTree Cleared");  
                red_black_tree_object.makeEmpty();  
                break;           
            default :   
                System.out.println("Wrong Entry \n ");  
                break;      
            }  
              
            System.out.print("\nRBT in Post-order: ");  
            red_black_tree_object.postorder();  
            System.out.print("\nRBT in Pre-order: ");  
            red_black_tree_object.preorder();  
            System.out.print("\nRBT in In-order: ");  
            red_black_tree_object.inorder();   
   
            System.out.println("\nWanna proceed further(Type y or n)? \n");  
            ch = scannner_object.next().charAt(0);                          
        } while (ch == 'Y'|| ch == 'y');                 
     }  
 } 
