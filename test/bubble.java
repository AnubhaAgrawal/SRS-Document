import java.util.*;//Scanner;
 
class bubble {
  public static void main(String []args) {
    int n, c, d, swap;
    Scanner in = new Scanner(System.in);
 
    System.out.println("Input number of integers to sort");
    n = in.nextInt();
 
    int array[] = new int[n];
  Random t = new Random();
 
    System.out.println("Enter " + n + " integers");
 
    for (c = 0; c < n; c++) {
  array[c] =t.nextInt(100);
     // array[c] = in.nextInt();
 }
System.out.println("Random Numbers Is:\n");
  for (c = 0; c < n; c++) {
  System.out.println(array[c]);
 }


    for (c = 0; c < ( n - 1 ); c++) {
      for (d = 0; d < n - c - 1; d++) {
        if (array[d] > array[d+1])
        {
          swap       = array[d];
          array[d]   = array[d+1];
          array[d+1] = swap;
        }
      }
    }
 
    System.out.println("Sorted list of numbers");
 
    for (c = 0; c < n; c++) 
      System.out.println(array[c]);
  }
}
