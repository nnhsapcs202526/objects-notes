
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
         *      Surround a string with doble quotes, just like in Python.
         * Unlike Python:
         *      - single quotes are reserved for the char primitive type
         *      - no triple-quoted strings
         *      - no f-strings
         *      - Strings can be concatenated with other types of things (e.g., int) and type conversion occurs
         */
        
        String river = new String("Mississippi");
        System.out.println(river);
        
        /*
         * Since Strings are so common, a shortcut way to construct them is provided called a String literal.
         *      Same as we did in Python.
         */
        String river2 = "Nile";
        System.out.println(river2);
        
        /*
         *  Search for "javadoc String" to find the official String documentation.
         */
        river.replace("i", "x");
        System.out.println(river);
        
        /*
         * Challenge:  Fix String to actually replace 'i' with 'x'.
         * 
         * The replace method returns a reference to a new String object.
         *      It does not change the String object on which it was called.
         *      The String class has no mutator methods; it is not possible to change a string once it's created.
         *      
         *      Strings are immutable.
         */
        String riverX = river.replace("i", "x");
        System.out.println(river + " is the old string and " + riverX + " is the newly returned string.");
        
        
    }
    
    
    
    
    
    
    
}
