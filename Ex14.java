
/**
 * Class Ex14 here.
 *
 * @author Assaf Bergerbest
 * @version 1
 */
public class Ex14
{
    /**
     * Constructor for objects of class Ex14
     */
    public Ex14()
    {
    
    }

    /**
     * All methods
     * @param
     * @return
     */
    private static int findMax(int a[])
    {
        int maximum = a[0];
        for (int i = 1; i<a.length; i++ )
        {
            if (a[i]>maximum)
            {
                maximum = a[i];
            }
        }
        return maximum;
    }
    
    private static int findIndex(int[] array, int value)
    {
        for(int i = 0; i<array.length;i++)
            if(array[i] == value)
                return i;
        return -1;
    }
    
    private static boolean contains(int[] array, int key)
    {
        for (int i : array){
            if (i==key){
                return true;
            }
        }
        return false;
    }
    
    
    public static int findMinDiff(int[] a, int x, int y)
    {
        int indexOfX = 0;
        int indexOfY = 0;
        
        if (contains(a,x)==true)
        {   
            indexOfX = findIndex(a,x);
        }
        else
        {
            indexOfX = Integer.MAX_VALUE;
        }
        if (contains(a,y)==true)
        {            
            indexOfY = findIndex(a,y);  
        }
        else
        {
            indexOfY = Integer.MAX_VALUE;
        }
        if(indexOfX>indexOfY)
        {
            return indexOfX-indexOfY;
        }
        else if (indexOfX==indexOfY)
        {
            return Integer.MAX_VALUE;
        }
        else
        {
            return indexOfY-indexOfX;
        }
    }
    
    public static boolean search (int [][] mat, int num)
    {
    return true;
    }

    public static  boolean  equalSplit (int[] arr)
    {
    int arrayLen = arr.length;
    int isEven = arrayLen %  2;
    }
    
    
    
    
    
}