import java.util.Random;

public class BubbleSortTiming 
{
  
  public static void main(String[] args) 
  { 
     final int ARRAY_SIZE = 200;
     long start;
     long end;
     long difference;
    
     int [] array = new int [ARRAY_SIZE];
     array = InitializeArray (array); // The array is now filled
     
       //System.out.print("Unsorted: ");
       //PrintArray (array);
     
     start = System.currentTimeMillis(); // Starts the timer
     array = SortArray (array); // Will now sort the array using Bubble Sort
     end = System.currentTimeMillis(); // Stops when the array is sorted
     
     //System.out.print("Sorted: ");
     //PrintArray (array);
       
     difference = end - start;
     
     System.out.println("Time started at: " + start);
     System.out.println("Time ended at: " + end);
     System.out.print("The time it took is: " + difference);
  }
  
  public static int [] InitializeArray(int[] array) 
    {
      Random random = new Random();
      final int MAX_INT = 100;
      
      for (int i = 0; i <= array.length - 1; i++)
      {
        array [i] = random.nextInt(MAX_INT) + 1; // Fills the array with random numbers up to the number 100
      }
      
      return array;
    }
  
  public static int [] SortArray (int [] array) // Sorts array
  {
    int temporaryVar;
    
     for (int i = 0; i < array.length - 1; i++)
     {
       for (int j = 1; j < array.length - i; j++)
       {
         if (array [j - 1] > array [j])
          {
            temporaryVar = array [j - 1];
            array [j - 1] = array [j];
            array [j] = temporaryVar;
          }
       } 
     } 
     return array;
  }
  
  public static void PrintArray(int[] array)
  {
    for(int i = 0; i < array.length; i++)
    {
      System.out.print(array[i] + " ");
    }
    System.out.println("");
  }
 
}


