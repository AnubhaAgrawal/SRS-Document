#include<iostream>
#include<cstdlib>
#include <bits/stdc++.h>
//#include<ctime>
using namespace std;
 int comp,n;
int main()
{
    int search(int [],int,int);
    int rec(int [],int,int,int);
    int n,i,a[100],e,res,swap,flag,c,d,b;
  
  
while(1){
comp=0;
 cout<<"How Many Elements:";
    cin>>n;
cout<<"\nPress-1 For User Inputs\nPress-2 For Random Inputs\nPress-3 For Exit\n";
cin>>b;
switch(b){
case 2:
    cout<<"\nElements of Array in Random order\n";
    //srand(0);
    //srand(time(NULL));
    for(i=0;i<n;++i)
    {
  a[i]=random()%1000;
       
    }
break;

case  1:
cout<<"\nElements the element of Array by user\n";
    for(i=0;i<n;++i)
    {
 cin>>a[i];
    }
break;
case 3:
exit(0);
}

for(i=0;i<n;++i)
    {
 cout<<a[i]<<endl;
    }
cout<<"\n sorted list:\n";
 sort(a, a+n);
/*
    for (c = 0; c < ( n - 1 ); c++) {
 flag=0;
      for (d = 0; d < n - c - 1; d++) {

        if (a[d] > a[d+1])
        {
          flag=1;
          swap       = a[d];
          a[d]   = a[d+1];
          a[d+1] = swap;
       }
      }
    if(flag==0)
     break;
    }  */
int first =0,last=n-1;
for(i=0;i<n;++i)
    {
 cout<<a[i]<<endl;
    }
    cout<<"\nEnter element to search:";
    cin>>e;
 int c;
cout<<"\npress 1-for Iterative Solution\nPress 2-for Recursive Solution";
cin>>c;
switch(c)
{
case 1:
    res=search(a,n,e);
    break;
case 2:
   res=rec(a,e,first,last);
    break;
}
     cout<<"No. of comp is \n";
cout<<comp;  
    if(res!=-1)
        cout<<"\nElement found at position\n "<<res+1<<endl;
    else
        cout<<"\nElement is not found....!!!\n";
 
    
}
} 
int search(int a[],int n,int e)
{
    int f,l,m;
  
    f=0;
    l=n-1;
    
    while(f<=l)
    {  
        comp++;
        
        m=(f+l)/2;
        if(e==a[m])
            return(m);
        else
            if(e>a[m])
                f=m+1;
            else
                l=m-1;
    }
  
 
    return -1;
}




int rec( int a[], int x,int low, int high )
    {
            
        if( low > high )
            return -1;
         
        int mid = ( low + high ) / 2;
        comp++;
        if( a[ mid ]<x)
            return rec( a, x, mid + 1, high );
        else if( a[ mid ] > x )
            return rec( a, x, low, mid - 1 );
        else
            return mid;
    }

