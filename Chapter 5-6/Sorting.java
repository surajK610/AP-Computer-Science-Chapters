
public class Sorting
{
  /**
   * @param An array of Comparable Objects
   * @return nothing
   */
  
  public static void selection(Comparable [] objs)
  {
      int min;
      Comparable temp;
      
      for(int index = 0; index < objs.length; index ++)
      {
          temp = objs[index];
          min = index;
          
          for(int scan = index +1; scan < objs.length; scan ++)
          {
            if(objs[min].compareTo(objs[scan]) > 0)
              min = scan;
            }
         
          objs[index] = objs[min];
          objs[min] = temp;
        }
    }
    
  /**
   * @param An array of Comparable Objects
   * @return nothing
   */
  public static void insertion(Comparable [] objs)
  {
      Comparable inserted;
      int position;
      for(int index = 1; index < objs.length; index ++)
      {
          inserted = objs[index];
          position = index;
          while(position > 0 && inserted.compareTo(objs[position -1]) < 0)
          {
              objs[position] = objs[position - 1];
              position --;
            }
            
          objs[position] = inserted;
        }
    }
}
