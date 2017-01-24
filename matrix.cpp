#include<iostream>
#include<stdlib.h>
using namespace std;

class matrix
{
int a[4][4],b[4][4],i,j,x,y,c[4][4];
public:
void getvalues();
void displaysum();
void displayproduct();
//void traversal();
void smallelement();
void spiralPrint();
void transpose();
void zigagElements ();
void add();
void snake();
matrix operator+(matrix);
};
void matrix::getvalues()
{
cout<<"Enter the size of the row and column ";
cin>>x>>y;
if(x!=y)
{
cout<<"The size of the row and column should be equal";
exit(0);
}
cout<<"Enter values for the matrix A\n";
for(i=0;i<x;i++){
for(j=0;j<x;j++){
cin>>a[i][j];}}
cout<<"Enter the values for matrix b\n";
for(i=0;i<x;i++){
for(j=0;j<x;j++){
cin>>b[i][j];
}}

cout<<"first matrix is :\n";
for(i=0;i<x;i++){
for(j=0;j<x;j++){
cout<<"\t";
cout<<a[i][j];}
cout<<"\n";}
cout<<"second matrix is :\n";
for(i=0;i<x;i++){
for(j=0;j<x;j++){
cout<<"\t";
cout<<b[i][j];}
cout<<"\n";}

}


/*matrix matrix:: operator+(matrix c)
{ matrix temp;
//int c[10][10];
for(i=0;i<x;i++){
for(j=0;j<x;j++){
cout<<"\t";
temp.c[i][j]=a[i][j]+c.b[i][j];
//cout<<temp.c[i][j];
}
cout<<"\n";

}
return(temp);
}*/
void matrix::displaysum()
{
int c[10][10];

cout<<"The sum of matrix A and B is\n";
for(i=0;i<x;i++){
for(j=0;j<x;j++){
cout<<"\t";
c[i][j]=a[i][j]+b[i][j];
cout<<c[i][j];
}
cout<<"\n";
}}

void matrix::snake()
{
for(i=0;i<x;i++){
if(i%2==0)
{j=0;
while(j<x){
cout<<"\t";
cout<<a[i][j];
j++;}
}
else{
j=x-1;
while(j>=0){
cout<<"\t";
cout<<a[i][j];
j--;}
}
}}
void matrix::transpose()
{
for(i=0;i<x;i++){
for(j=0;j<x;j++){
cout<<"\t";
cout<<b[j][i];}
cout<<"\n";}
}



void matrix::displayproduct()
{
int c[10][10];
cout<<"The product of matrix A and B is\n";
for(i=0;i<x;i++){
for(j=0;j<x;j++){
int sum=0;
for(int k=0;k<x;k++){
cout<<"\t";
sum=sum+a[i][k]*b[k][j];
}
cout<<"\t";
c[i][j]=sum;
cout<<c[i][j];}
cout<<"\n";
}}

void matrix::spiralPrint()
{  
	int i,j,k,l,n;
	
    for(i=x-1, j=0; i>0; i--, j++)
    {
        //print top row
        for(k=j; k<i; k++) 
		cout<< a[j][k];
        //print last column
        for(k=j; k<i; k++) 
		cout<< a[k][i];
        //print last row
        for(k=i; k>j; k--) 
		cout<< a[i][k];
        //print first column
        for(k=i; k>j; k--)
		 cout<< a[k][j];
 
    }
    //if odd size matrix print the middle value
     int middle = (x-1)/2;
     if (x% 2 == 1) 
	 cout<< a[middle][middle];
cout<<endl;

}

void matrix::add()
{
int sum=0;
for(i=0;i<x;i++){
for(j=0;j<x;j++){
sum=sum+a[i][j];
}}
cout<<"\n"<<sum<<endl;
}

void matrix::zigagElements ()
{
  int i = 0, j = 0;
 
  while (i < x)
    {
      cout<<endl;
      cout<<a[i][j];
      if (i == x - 1)
    {
      i = j + 1;
      j = x - 1;
    }
      else if (j == 0)
    {
      j = i + 1;

i = 0;
    }
 
      else
    {
      j--;
      i++;
    }
 
    }
 
  cout<<endl;
}
void matrix::smallelement()
{
int small=a[0][0];
for(i=0;i<x;i++){
for(j=0;j<x;j++){
if(small>a[i][j])
{
small=a[i][j];
}
}}
cout<<"\nsmall element is\n"<<small<<endl;

}

int main()
{
matrix m,n,k;
m.getvalues();
m.displaysum();
m.displayproduct();
m.transpose();
m.smallelement();
m.add();
cout<<"SNAKE PATTERN\n";
m.snake();

m.zigagElements ();
m.spiralPrint();
//k=m+n;
//k.displaysum();

}
