import java.util.*;//Scanner;
 
class bubble {
  public static void main(String []args) {
    int n, c, d, swap,flag,comp=0,press;
    Scanner in = new Scanner(System.in);

    
 
 while(true){
    System.out.println("Input number of integers to sort");
    n = in.nextInt();
 
int array[] = new int[n];
 
 Random t = new Random();
    System.out.println("Enter " + n + " integers");
 
System.out.println("Press-1 For User Inputs\nPress-2 For Random Inputs\nPress-3 For Exit");
press = in.nextInt();

 switch(press)
{
case 1:
System.out.println("\n-------------------\n");
  for (c = 0; c < n; c++) {
  array[c] =in.nextInt();
 }
System.out.println("User Inputs Numbers Is:\n");
  for (c = 0; c < n; c++) {
  System.out.println(array[c]);

 }
break;
 case 2:
System.out.println("\n-------------------\n");
    for (c = 0; c < n; c++) {
  array[c] =t.nextInt(100);
 }
System.out.println("Random Numbers Is:\n");
  for (c = 0; c < n; c++) {
  System.out.println(array[c]);
 }
break;
case 3:
System.out.println("\n-------------------\n");
  System.exit(0);
}




    for (c = 0; c < ( n - 1 ); c++) {
 flag=0;
      for (d = 0; d < n - c - 1; d++) {
   comp++;
        if (array[d] > array[d+1])
        {
          flag=1;
          swap       = array[d];
          array[d]   = array[d+1];
          array[d+1] = swap;
       }
      }
    if(flag==0)
     break;
    }
System.out.println("no. of comparision is:\n");
 System.out.println(comp);
    System.out.println("Sorted list of numbers");
 
    for (c = 0; c < n; c++) 
      System.out.println(array[c]);
  }
}}
//while(1);
