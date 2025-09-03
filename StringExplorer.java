
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
         *  Surrounded by a double quotes, just ike Python.
         *  Unlike in Python:
         *      - single quotes are reserverd for char primitive type
         *      - no triple-quoted string or f-string
         */
        String river = new String("Mississippi");
        System.out.println(river);
        
        /*
         * Since Strings are so common, a shortcut way to construct them is provided.  This is called a String literal.
         *      This is the same as in Python.
         */
        String river2 = "Nile";
        System.out.println(river2);
        
        /*
         * Concatenation joins two or more Strings together using the '+'.  No spaces get added!
         *      Unlike in Python, Strings can be concatenated with other type of things (i.e., ints),
         *      in which case type conversion occurs.
         */
        
        String river3 = river + " and " + river2 + 7;
        System.out.println(river3);
        
        /*
         * Challenge: Search for "javadoc String" on Google to find official Oracle String documentation.  
         *  Look at the replace method and fix my bug below.
         */
        river.replace("i", "x");
        System.out.println(river);
        
        /*
         * The replace method returns a referenece to a new String object.
         *  It does not change the original string on which it was called.
         *  The String class has no mutator methods.  It is not possible to change a String after it's created.
         *  
         *  String are immutable.
         */
        String riverX = river.replace("i", "x");
        System.out.println(river);
        System.out.println(riverX);
        
        
    }
}
