import java.util.*;
public class Final1
{
	
 protected Node start ;
    protected Node end ;
    public int size ;
 
    public int g;
    public Final1()
    {
        start = null;
  
        end = null;
        size = 0;
         g=1;
    }
    public void singly()
        {
        
           start= new Node(0);
             g=0;  
          }
    
    public boolean Empty()
    {
   return size==0;
    }

    
    public int getSize()
    {
        return size;
    }
   public void insert(int val , int pos) 
    {
   int flag=1;
        Node nptr = new Node(val,null);                
        Node ptr = start;
 size++ ;

        
    if(start == null)
        {       
     flag=0;
 nptr.setNext(start);
            start = nptr;
            nptr.setNext(start);
            end = start;            
        }      

      if(flag ==1){
 if(pos==size){
nptr.setNext(start);
            end.setNext(nptr);
            end = nptr;            
        }
pos = pos - 1 ;

      if(pos==0)
             {

      nptr.setNext(start);
                end.setNext(nptr);
            start = nptr; 
              }
      
    

else{
       for (int i = 1; i < size - 1; i++) 
        {
            if (i == pos) 
            {
                Node tmp = ptr.getNext() ;
                ptr.setNext( nptr );
                nptr.setNext(tmp);
                break;
            }
            ptr = ptr.getNext();
        }}}
       
    }
public void deleteC(int i1)
    {    
        if (size == 1 && i1 == 1)
        {
            start = null;
            end = null;
            size = 0;
            return ;
        }        
        if (i1 == 1) 
        {
            start = start.getNext();
            end.setNext(start);
            size--; 
            return ;
        }
        if (i1 == size) 
        {
            Node s = start;
            Node t = start;
            while (s != end)
            {
                t = s;
                s = s.getNext();
            }
            end = t;
            end.setNext(start);
            size --;
            return;
        }
        Node ptr = start;
        i1 = i1 - 1 ;
for (int i = 1; i < size - 1; i++) 
        {
            if (i == i1) 
            {
                Node tmp = ptr.getNext();
                tmp = tmp.getNext();
                ptr.setNext(tmp);
                break;
            }
            ptr = ptr.getNext();
        }
        size-- ;
    }

 public void Cdisplay()
    {
        System.out.print("\nCircular Singly Linked List = ");
        Node ptr = start;
        if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }
        if (start.getNext() == start) 
        {
            System.out.print(start.getData()+ "->  "+ptr.getData()+ "\n");
            return;
        }
        System.out.print(start.getData()+ "->  ");
        ptr = start.getNext();
        while (ptr.getNext() != start) 
        {
 System.out.print(ptr.getData()+ "->  ");
            ptr = ptr.getNext();
        }
        System.out.print(ptr.getData()+ "->  ");
        ptr = ptr.getNext();
        System.out.print(ptr.getData()+ "\n");
    }

	
	public void add(int data)
	{
                
		Node temp = new Node(data);
		Node current = start;
   


		
		while(current.getNext() != null)
		{
			current = current.getNext();
		}
		current.setNext(temp);
		size++;
	}
       
public void display()
	{ 
            
               Node current = start;
		while(current.getNext() != null)
		{
                        current = current.getNext();
			System.out.println(current.data);
                    
		}
	
	}

	
	
	public void insert1(int data, int i1)
	{
               if(i1>size+1)
                {
                System.out.println("Invalid Position ");
                   }
             else{
                   
		Node temp = new Node(data);
		Node current = start;
		
		for(int i = 1; i < i1 && current.getNext() != null; i++)
		{
			current = current.getNext();
		}
		
		temp.setNext(current.getNext());
		
		current.setNext(temp);
	         size++;
	}
	}
	public Object get(int index)
	{
                        Node current;
		if(index <= 0)
			return null;
		
                 if(g==1)
                 current=start; 
                 else
		 current = start.getNext();

		for(int i = 1; i < index; i++)
		{
			if(current.getNext() == null)
				return null;
			
			current = current.getNext();
		}
		return current.getData();
	}

	
    public int delete(int i1)
     {
        if(i1>size||i1<1)
                {
                System.out.println("Invalid Position ");
                     return -1;
                         }

           Node current = start;
		for(int i = 1; i < i1; i++)
		{
			
			current = current.getNext();
		}
		current.setNext(current.getNext().getNext());
		size--; 
		return 1;

}

	public int size()
	{
		return size;
	}
	
	
	private class Node
	{
	
		Node next;
		
		int data;
		

		
		public Node(int _data)
		{
			next = null;
			data = _data;
		}
		
		
		public Node(int _data, Node _next)
		{
			next = _next;
			data = _data;
		}
		
		
		public int getData()
		{
			return data;
		}
		
		
		public Node getNext()
		{
			return next;
		}
		
		public void setNext(Node _next)
		{
			next = _next;
		}
	}

  
public static void main(String args[]) {
int d,da,po,d1,d2,d3,c,c1;
int ch;
Scanner in = new Scanner(System.in);
Final1 s = new Final1();
do{
 System.out.println("1.If You want to work on Circular linked list Press 1\n 2.If You want to work on Simple linked list Press 2");
c = in.nextInt();

switch(c)
{
case 1:
s.start=null;
System.out.println("\nHow many elements u want to insert in \n");
int m=in.nextInt() ;

for(int i=1;i<=m;i++)
{
System.out.println("Enter integer element to insert");
                int num = in.nextInt() ;
s.insert(num, i);
}
 do
        {


            System.out.println("\nCircular Singly Linked List Operations\n");
           System.out.println("1. Get the element of circular linked list");
            System.out.println("2. to Display");
            System.out.println("3. insert at any  position");
            System.out.println("4. delete at position");
            System.out.println("5. check empty");
            System.out.println("6. get size");            
            int choice = in.nextInt();  
 switch (choice)
            {
          case 1:
            //s.g==1;
           System.out.println("Enter position from which u want to show an element: ");
          int d5=in.nextInt();
           System.out.println("Element of linked list is: ");
           System.out.println(s.get(d5));
            break;                        
            case 2 : 
                System.out.println("The list is:");
                s.Cdisplay();                    
                break;                       
            case 3 : 
                System.out.println("Enter integer element to insert");
                int num = in.nextInt() ;
                System.out.println("Enter position");
                int pos = in.nextInt() ;
                if (pos < 1 || pos > s.getSize()+1 )
                    System.out.println("Invalid position\n");
                else
                    s.insert(num, pos);
                break;                                        
            case 4 : 
                System.out.println("Enter position");
                int p = in.nextInt() ;
                if (p < 1 || p > s.getSize() )
                    System.out.println("Invalid position\n");
                else
                    s.deleteC(p);
                break;
          case 5 : 
                System.out.println("Empty status = "+ s.Empty());
                break;        
          case 6 : 
                System.out.println("Size = "+ s.getSize() +" \n");
                break;                         
             default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
            /*  Display List  */
            
            System.out.println("\nDo you want to continue (Type 1 ) \n");
            ch = in.nextInt();            
        } while (ch == 1);                    
    
break;

case 2:

s.singly();
System.out.println("enter the size in a list :");
d = in.nextInt();



for(int i=0;i<d;i++)
{ 
System.out.println("enter node ");
s.add(in.nextInt());
}




int d4,d5,d6;
System.out.println("Linked List is:\n");
s.display();
           do
{
           System.out.println("Press1. insert the data at a given position");
  
            System.out.println("Press2. to get the element at a specified position");
            System.out.println("Press3. delete the element at given position");
            System.out.println("Press4. To get size of final linked list");
            System.out.println("Press5. To display the linked list");
           System.out.println("Press6. check empty ");
            
            d4 = in.nextInt();  
  switch(d4)
{
case 1:   
System.out.println("Enter the data and a position in which u want to insert:\n");
da = in.nextInt();
po = in.nextInt();
s.insert1(da,po);
break;

case 2:

System.out.println("Enter position from which u want to show an element: ");
d5=in.nextInt();
System.out.println("Element of linked list is: ");
System.out.println(s.get(d5));
break;

case 3:
System.out.println("Enter the position in which u want to delete:\n");
s.delete(in.nextInt());
break;

case 4:
System.out.println("Size of Linked List is ");
System.out.println(s.size());
break;
case 5:
System.out.println("Linked List is ");
s.display();

break;
 case 6 : 
                System.out.println("Empty status = "+ s.Empty());
                break;  
}
System.out.println("\nDo you want to continue (if yes press1) \n");
       d6 = in.nextInt();            
        } while (d6 == 1); 
}

System.out.println("\nDo you want to continue from the begin (if yes press1) \n");
       c1 = in.nextInt();            
        } while (c1 == 1); 

}}
