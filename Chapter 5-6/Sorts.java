//********************************************************************
//  Sorts.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the selection sort and insertion sort algorithms,
//  as well as a generic object sort.
//********************************************************************

public class Sorts
   {
   //-----------------------------------------------------------------
   //  Sorts the specified array of integers using the selection
   //  sort algorithm.
   //-----------------------------------------------------------------
   public static void selectionSort (int[] numbers)
   {
      int min, temp;

      for (int index = 0; index < numbers.length-1; index++)
      {
         min = index;
         for (int scan = index+1; scan < numbers.length; scan++)
            if (numbers[scan] < numbers[min])
               min = scan;

         // Swap the values
         temp = numbers[min];
         numbers[min] = numbers[index];
         numbers[index] = temp;
      }
   }

   //-----------------------------------------------------------------
   //  Sorts the specified array of integers using the insertion
   //  sort algorithm.
   //-----------------------------------------------------------------
   public static void insertionSort (int[] numbers)
   {
      for (int index = 1; index < numbers.length; index++)
      {
         int key = numbers[index];
         int position = index;

         // shift larger values to the right
         while (position > 0 && numbers[position-1] > key)
         {
            numbers[position] = numbers[position-1];
            position--;
         }
            
         numbers[position] = key;
      }
   }

   //-----------------------------------------------------------------
   //  Sorts the specified array of objects using the insertion
   //  sort algorithm.
   //-----------------------------------------------------------------

   
   public static void insertionSort (Comparable [] objs, int count)
   {
      for (int index = 1; index < count; index++)
      {
         Comparable key = objs[index];
         int position = index;

         // shift larger values to the right
         while (position > 0 && objs[position-1].compareTo(key) > 0)
         {
            objs[position] = objs[position-1];
            position--;
         }
            
         objs[position] = key;
      }
    }
   }