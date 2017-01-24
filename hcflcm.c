#include<stdio.h>
main()
{
int a,b,lc,hcf,d,f;
printf("enter two integer\n");
scanf("%d%d",&a,&b);
d=a;
f=b;
if(a==0)
printf("hcf and lcm both are equal to %d",b);
while(b!=0)
{
if(a>b)
a=a-b;
else
b=b-a;
}
printf("hcf is %d",a);
lc=d*f/a;
printf("lcm is %d",lc);
}
