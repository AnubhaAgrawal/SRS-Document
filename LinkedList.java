import java.util.*;
public class LinkedList
{
	private Node head;
	private int listCount;
	
	public LinkedList()
	{
		head = new Node(null);
		listCount = 0;
	}
	
	public void add(Object data)
	{
		Node temp = new Node(data);
		Node current = head;
		
		while(current.getNext() != null)
		{
			current = current.getNext();
		}
		// the last node's "next" reference set to our new node
		current.setNext(temp);
		listCount++;// increment the number of elements variable
	}
       

public void display()
	{ 
               Node current = head;
		while(current.getNext() != null)
		{
                        current = current.getNext();
			System.out.println(current.data);
                    
		}
	
	}

	
	
	public void insert(Object data, int index)
	// post: inserts the specified element at the specified position in this list.
	{
		Node temp = new Node(data);
		Node current = head;
		// crawl to the requested index or the last element in the list,
		// whichever comes first
		for(int i = 1; i < index && current.getNext() != null; i++)
		{
			current = current.getNext();
		}
		// set the new node's next-node reference to this node's next-node reference
		temp.setNext(current.getNext());
		// now set this node's next-node reference to the new node
		current.setNext(temp);
		listCount++;// increment the number of elements variable
	}
	
	public Object get(int index)
	// post: returns the element at the specified position in this list.
	{
		// index must be 1 or higher
		if(index <= 0)
			return null;
		
		Node current = head.getNext();
		for(int i = 1; i < index; i++)
		{
			if(current.getNext() == null)
				return null;
			
			current = current.getNext();
		}
		return current.getData();
	}
	
	public boolean remove(int index)
	// post: removes the element at the specified position in this list.
	{
		// if the index is out of range, exit
		if(index < 1 || index > size())
			return false;
		
		Node current = head;
		for(int i = 1; i < index; i++)
		{
			if(current.getNext() == null)
				return false;
			
			current = current.getNext();
		}
		current.setNext(current.getNext().getNext());
		listCount--; // decrement the number of elements variable
		return true;
	}
	
	public int size()
	// post: returns the number of elements in this list.
	{
		return listCount;
	}
	
	
	private class Node
	{
		// reference to the next node in the chain,
		// or null if there isn't one.
		Node next;
		// data carried by this node.
		// could be of any type you need.
		Object data;
		

		// Node constructor
		public Node(Object _data)
		{
			next = null;
			data = _data;
		}
		
		// another Node constructor if we want to
		// specify the node to point to.
		public Node(Object _data, Node _next)
		{
			next = _next;
			data = _data;
		}
		
		// these methods should be self-explanatory
		public Object getData()
		{
			return data;
		}
		
		public void setData(Object _data)
		{
			data = _data;
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
int d,da,po;
Scanner in = new Scanner(System.in);
System.out.println("enter the no. of node in a list :");
d = in.nextInt();

LinkedList s = new LinkedList();

for(int i=0;i<d;i++)
{ 
System.out.println("enter node ");
s.add(in.nextInt());
}
System.out.println("Linked List is:\n");
s.display();

System.out.println("Enter the data and a position in which u want to insert:\n");
da = in.nextInt();
po = in.nextInt();
s.insert(da,po);
System.out.println("After Insertion: ");
s.display();


System.out.println("Enter the position in which u want to delete:\n");
s.remove(in.nextInt());
System.out.println("After Deletion: ");
s.display();


}
}
