
/**
 * Exploring the String class and its methods.
 *
 * @author mrcallaghan
 * @version 02sep2025
 */
public class StringExplorer
{
    public static void main(String[] args)
    {
        /*
         * Strings are objects that represent a sequence of characters.
         * 
         *      Surrounded by a double quotes, similar to Python.
         *      Unlike Python:
         *          - single quotes are reserved for chars
         *          - no triple-quoted strings or f-strings
         */
        String river = new String("Mississippi");
        System.out.println(river);
        
        /*
         * Since String are so common, a shortcut way to make them called a String literal.
         *      This is the same as Pyhton.
         */
        String river2 = "Nile";
        System.out.println(river2);
        
        /*
         * Concatenation joins Strings and other types together using '+'.  No spaces get added!
         *      Strings can be concatentated with other types, unlike Pyhton (e.g., ints) and
         *      type conversion occurs.
         */
        String river3 = river + " and " + river2 + 7;
        System.out.println(river3);
        
        /*
         * Challenge: Search for 'javadoc String' and find the official String documentation.
         * 
         *  Fix the lines below so it works as intended.
         */
        river.replace("i", "x");
        System.out.println(river);
        
        
        /*
         * The replace method returns a refernece to a new String object.
         *      It does NOT change the String object on which it is called.
         *      The String class has NO mutator methods.  It is not possible to change a String object.
         *      
         *      Strings are immutable.
         */
        String riverX = river.replace("i", "x");
        System.out.println(river);
        System.out.println(riverX);
        
        
        
        
    }
}
