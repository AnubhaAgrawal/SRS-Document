import java.util.Random;
import java.util.Arrays;

public class binary {

    public static void main(String[] args) {

        //System.nanoTime() will give me the current time (it's like looking at the clock)
        //I'll save the current time right (immediately) before I start the thing I want to time
        long start = System.nanoTime();

        long elapsed = System.nanoTime() - start;
        Random value = new Random();
        int size = 2000;
        int max = 5000;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = value.nextInt();
        }
        Arrays.sort(array);
        for (int i = 100; i < 2000; i+=100) {
            start = System.nanoTime();
            for ( int j = 0; j < 2000; j++){
                Search.binarySearch(array, value.nextInt());
            }
        }
        elapsed = System.nanoTime() - start;
        System.out.println("Total time elapsed is: "+ elapsed);
    }
}
