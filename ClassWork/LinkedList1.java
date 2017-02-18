import java.util.*;

class node
{
Scanner in = new Scanner(System.in);
  
private int a;
private node *next;
public node start = null;
public node createnode(){
int d;
System.out.println("enter node  :");
d = in.nextInt();
 node temp;
temp=new node();
temp.a=d;
temp.next= null;
return(temp);
}
public void display( node t)
{
System.out.println("etrye\n\n");
while(t!=null)
{
System.out.println(t.a);
t=t.next;
}
}

public void getdata()
{int d;
node start=null;
 node t,k=start;
System.out.println("enter the no. of node in a list :");
d = in.nextInt();
for(int i=0;i<d;i++)
{ 
if(i==0){
start=createnode();
t=start;
k=start;
}
else
{
t=createnode();
}
k.next=t;
k=t;
}
while(k!=null)
{
System.out.println(k.a);
k=k.next;
}
}
//public void insert( node *t);
//public int search( node *temp);
//public void delete1( node *);
//public void reverse();
//void operator-();
}

/*void node::operator-()
{
node *u=start;
while(u!=NULL){
u->a=-u->a;
u=u->next;
}
}*/
/*void node::reverse()
{
node *prev=NULL;
node *current= start;
node *n;
while(current!=NULL)
{
n=current->next;
current->next=prev;
prev=current;
current=n;
}
start=prev;
}
*/


/*void node::delete1( node *h)
{
int s;
System.out.println("enter the node u want to delete ");
s = in.nextInt();
if(h->a==s){
start=h->next;
h->next=NULL;

}
while(h->next!=NULL)
{
if(h->next->a==s)
{
if(h->next->next==NULL)
{h->next=NULL;
break;}
h->next=h->next->next;

}

h=h->next;
}
}

void node:: insert(node *t)
{ node *s;
int h;
System.out.println("enter the node u want to the position  ");
h = in.nextInt();
struct node *temp;
temp=createnode(); 
for(int i=1;i<h-1;i++)
t=t->next;

s=t->next;
t->next=temp;
temp->next=s;
}
int node :: search( node *temp)
{
int s;

System.out.println("enter the node u want to search\n ");
s = in.nextInt();;
if(temp==NULL)
return 0;
if(temp->a==s)
return 1;
while(temp->next!=NULL)
{
if(temp->next->a==s)
{
//temp->next=temp->next->next;
return(1);
}
temp=temp->next;}
return(0);
}
*/




public class LinkedList extends node {

  
   public static void main(String args[]) {
     
      LinkedList s = new LinkedList();
      int k;
   // node start;
s.getdata();
//s.display(start);
//-s;
/*k=s.search(start);
if(k==1)
System.out.println("search is found\n");
else
System.out.println("search is not found\n");

*/
//s.delete1(start);
//s.display(start);
//s.insert(start);
//s.display(start);
//s.reverse();
//System.out.println("reverse of list is-\n");
//s.display(start);
//-s;
//s.display(start);
   }
}





