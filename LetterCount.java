import java.util.Scanner;
/**
 * Demonstrate the relationship between arrays and strings
 *
 * @author Keira M
 * @version 11/3/21
 */
public class LetterCount
{
    public static void main(String[] args) {
        final int NUMCHARS = 26;   // Num of letters in alphabet
        
        // Initialising scanner class
        Scanner scan = new Scanner(System.in);
        
        // declaring arrays
        int[] upper = new int[NUMCHARS];
        int[] lower = new int[NUMCHARS];
        
        char current;    // current character being processed
        int other = 0;   // counter for non-alphabetics
        
        // get user input
        System.out.println("Enter a sentence: ");
        String line = scan.nextLine();
        
        // Count number of each letter ocurence
        for (int ch = 0; ch < line.length(); ch++) {
            current = line.charAt(ch);
            if (current >= 'A' && current <= 'Z') {
                upper[current-'A']++;
            }
        }
        
    }
}
