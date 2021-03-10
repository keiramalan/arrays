
/**
 * Demonstrate basic array decleration and use
 *
 * @author Keira M
 * @version 11/3/21
 */
public class BasicArray
{
    /*
     * Creates an array, fills it with various inteeger values
     * modifies one value, then prints them out
     */
    public static void main(String[] args) {
        // declaring constants
        final int LIMIT = 15, MULTIPLE = 10;
        
        // declaring array
        int[] list = new int[LIMIT];
        
        // Initialise array values
        for (int index = 0; index < LIMIT; index ++) {
            list[index] = index * MULTIPLE;
        }
        
        list[5] = 999;
        
        // print array values
        for (int value: list){
            System.out.print(value + "   ");
        }
    }
}
