#include<iostream>

using namespace std;
class stack
{
 public:
  char s[20];
  int top;
  stack()
  {
    top=-1;
  }
 void push(char symbol)
  {
    if(overflow())
    {
      cout<<"\nStack overflow:\n";
    }
    else
    {
      top=top+1;
      s[top]=symbol;
     }
   }
   char pop()
   {
     if(empty())
       return(0);        
     else
       return(s[top--]);
   }
   int empty()
   {
     if(top==-1)
       return(1);
     else
       return(0);
   }
   int overflow()
   {
     if(top==19)
       return(1);
     else
       return(0);
   }

int prec(char symbol)
  {
    switch(symbol)
    {
      case '^': return(5);
      case '/': return(4);          
      case '*': return(3);          
      case '+': return(2);          
      case '-': return(1);          
      case '(': return(0);          
      default: return(-1);
    }
  }

void postTOinfix()
{
char infix[20];
  char postfix[20];
int i1=0,i2=0;
cout<<"\nEnter an infix expression:";
      cin>>infix;
 int l,precedence,p;
      char entry1,entry2,m=' ',n='\0';
      p=0;
        int k=0;
int f=0;
int y=0;
int q=0;
int b=0;
int c=0;
int d=0;
int h=0;
int i;
int l1=0;
   
for(i=0;infix[i]!='\0';i++)
      {
if(infix[i]=='+'||infix[i]=='-'||infix[i]=='*'||infix[i]=='/'||infix[i]=='^')
{h++;
}
if(infix[i]=='('||infix[i]==')'||infix[i]=='{'||infix[i]=='}'||infix[i]=='['||infix[i]==']')
{l1++;
}

}
if(i-h-l1<=h)
{
             
      f=1;
k=1;
      cout<<"\n Expression is invalid ";
}


      for(int i=0;infix[i]!='\0';i++)
      {
    entry1=infix[i];
    if(!m || !n)
    {

      switch(entry1)
      {
        case '(':
         b++;
          y=1;
            q=1;
          push(entry1);
          break;
       case '[':
         c++;
          y=1;
            q=1;
          push(entry1);
          break;
      case '{':
         d++;
          y=1;
            q=1;
          push(entry1);
          break;
        case ')':
           b++;
          y=1;
         
    while((empty()||q==0)&&f==0)  
       {           
      f=1;
k=1;
      cout<<"\n Expression is invalid ";
        break;
     }
        if(f==0)
{
          while((entry2=pop())!='(')
          postfix[p++]=entry2;}
          break;
         case '}':
           d++;
          y=1;
         
    while((empty()||q==0)&&f==0)  
       {           
      f=1;
     k=1;
      cout<<"\n Expression is invalid ";
        break;
     }
        if(f==0)
{
          while((entry2=pop())!='{')
          postfix[p++]=entry2;}
          break;
        case ']':
           c++;
          y=1;
         
    while((empty()||q==0)&&f==0)  
       {           
      f=1;
k=1;
      cout<<"\n Expression is invalid ";
        break;
     }
        if(f==0)
{
          while((entry2=pop())!='[')
          postfix[p++]=entry2;}
          break;
        case '+':
        case '-':
        case '*':
        case '/':
        case '^':
          if(!empty())
          {
        precedence=prec(entry1);
        entry2=pop();
        while(precedence<=prec(entry2))
        {
           postfix[p++]=entry2;
           if(!empty())
              entry2=pop();
           else
              break;
        }
        if(precedence>prec(entry2))
           push(entry2);
          }
          push(entry1);
          break;
        default:
          postfix[p++]=entry1;
          break;
      }
      }
    }
if(y==1){
if(k==0)
{
if(b%2!=0||d%2!=0||c%2!=0)
{
    while(!empty())  
       {          
      f=1;
      cout<<"\n Expression is invalid";
        break;
     }
}}
}
if(k==0)
{
   if(f==0)
{
while(!empty())  
       {             
       postfix[p++]=pop();
}
    postfix[p]='\0';
    cout<<"\nThe postfix expression is: "<<postfix<<endl;
}
}
}

};

int main()
{

char choice='y';
 while(choice=='y')
{

 
      stack s;
     s.postTOinfix();
cout<<"\n\nDo you want to continue ? (y/n): ";
   cin>>choice;

}
}
