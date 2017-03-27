 import java.util.*;
 class Node
 {
     Node left, right, root;
     int data;
     public Node()
     {
         left = null;
         right = null;
         data = 0;
     }
     public Node(int n)
     {
         left = null;
         right = null;
         data = n;
     }
     public void setLeft(Node n)
     {
         left = n;
     }
     public void setRight(Node n)
     {
         right = n;
 }
     public Node getLeft()
     {
         return left;
     }
     public Node getRight()
     {
         return right;
     }
  
     public int getData()
     {
         return data;
     }     
 }
 
 
 class BST extends Node
 {

     public BST()
     {
         root = null;
         
     }
     public boolean isEmpty()
     {
         return root == null;
     }
     
     public void insert(int data)
     {
         root = insert(root, data);
     }
   
     private Node insert(Node node, int data)
     {
         if (node == null)
             node = new Node(data);
         else
         {
             if (data <= node.getData())
                 node.left = insert(node.left, data);
             else
                 node.right = insert(node.right, data);
         }
         return node;
     }
    
    public void delete(int k)
     {
         if (isEmpty())
             System.out.println("Tree Empty");
         else if (search(k) == false)
             System.out.println("Sorry "+ k +" is not present");
         else
         {
             root = delete(root, k);
             System.out.println(k+ " deleted from the tree");
         }
     }
     private Node delete(Node root, int k)
     {
         Node p, p2, n;
         if (root.getData() == k)
         {
             Node lt, rt;
             lt = root.getLeft();
             rt = root.getRight();
             if (lt == null && rt == null)
                 return null;
             else if (lt == null)
             {
                 p = rt;
                 return p;
             }
             else if (rt == null)
             {
                 p = lt;
                 return p;
             }
             else
             {
                 p2 = rt;
                 p = rt;
                 while (p.getLeft() != null)
                     p = p.getLeft();
                 p.setLeft(lt);
                 return p2;
             }
  }
         if (k < root.getData())
         {
             n = delete(root.getLeft(), k);
             root.setLeft(n);
         }
         else
         {
             n = delete(root.getRight(), k);
             root.setRight(n);             
         }
         return root;
     }
    
     public int NoOfNodes()
     {
         return NoOfNodes(root);
     }
    
     private int NoOfNodes(Node r)
     {
         if (r == null)
             return 0;
         else
         {
             int l = 1;
             l += NoOfNodes(r.getLeft());
             l += NoOfNodes(r.getRight());
             return l;
          }
     }
    
     public boolean search(int val)

 {
         return search(root, val);
     }
     
     private boolean search(Node r, int val)
     {
         boolean found = false;
         while ((r != null) && !found)
         {
             int rval = r.getData();
             if (val < rval)
                 r = r.getLeft();
             else if (val > rval)
                 r = r.getRight();
             else
             {
                 found = true;
                 break;
             }
             found = search(r, val);
         }
         return found;
     }
    
    
  
     public void inorder()
     {
         inorder(root);
     }
     private void inorder(Node r)
     {
         if (r != null)
         {
             inorder(r.getLeft());
             System.out.print(r.getData() +" ");
  inorder(r.getRight());
         }
     }
   
     public void preorder()
     {
         preorder(root);
     }
     private void preorder(Node r)
     {
         if (r != null)
         {
             System.out.print(r.getData() +" ");
             preorder(r.getLeft());             
             preorder(r.getRight());
         }
     }
    
     public void postorder()
     {
         postorder(root);
     }
     private void postorder(Node r)
     {
         if (r != null)
         {
             postorder(r.getLeft());             
             postorder(r.getRight());
             System.out.print(r.getData() +" ");
         }
     } 
 }
 
 public class tree1
 {
     public static void main(String[] args)
    {      
     char ch,ch1;
     Scanner scan = new Scanner(System.in);
     Random t = new Random();
      do{           
        BST bst = new BST(); 
        System.out.println("Binary Search Tree Test\n");          
           
        System.out.println("Do you want to enter the data randomly or by user \n"); 
        System.out.println("Press1 for random input\n"); 
        System.out.println("Press2 for usre input \n");     
          int choice1 = scan.nextInt();    
           System.out.println("How many nodes initially u want to insert");
         int n = scan.nextInt(); 
        switch(choice1)
        {
         
          case 2 : 
                for(int i=0;i<n;i++)
                bst.insert( scan.nextInt() );                     
                break;                          
            case 1 : 
               for(int i=0;i<n;i++)
                 bst.insert( t.nextInt(200) );                            
                break;                     
                }   
                 System.out.print("\nPost order : ");
            bst.postorder();
            System.out.print("\nPre order : ");
            bst.preorder();
            System.out.print("\nIn order : ");
            bst.inorder();
        do    
        {
            System.out.println("\nBinary Search Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. delete");
            System.out.println("3. search");
            System.out.println("4. count nodes");
            System.out.println("5. check empty"); 
 
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                bst.insert( scan.nextInt() );                     
                break;                          
            case 2 : 
                System.out.println("Enter integer element to delete");
               bst.delete( scan.nextInt() );                     
                break;                         
            case 3 : 
                  System.out.println("Enter integer element to search");
                System.out.println("Search result : "+ bst.search( scan.nextInt() ));
                break;                                          
            case 4 : 
                System.out.println("Nodes = "+ bst.NoOfNodes());
                break;     
            case 5 :  
                System.out.println("Empty status = "+ bst.isEmpty());
                break;            
            default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }

            System.out.print("\nPost order : ");
            bst.postorder();
            System.out.print("\nPre order : ");
            bst.preorder();
            System.out.print("\nIn order : ");
            bst.inorder();
 
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');    
        
       System.out.println("\nDo you want to continue from start (Type y or n) \n");
          ch1 = scan.next().charAt(0);
          
           } while (ch1 == 'Y'|| ch1 == 'y');    
           
                   
    }
 }

 

