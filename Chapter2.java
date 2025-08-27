
/**
 * Chapter 2 Notes
 *
 * @author mrcallaghan
 * @version 27aug2025
 */
public class Chapter2
{
    public static void drawLine()
    {
        /*
         * Objects are entities in a program.
         *      Objects have attributes.
         *      Objects a manipulated by methods.
         *      
         * In the following lines, 'ocean' and 'crush' are variable that reference objects.
         * 
         * Classes describe a collection of objects.  (like a template or blueprint)
         *  All objects of a class have the same behavior(methods) and the same types of attributes
         *      (but may have differing value for those attributes)
         *      
         * World and Turtle are classes (and are capitalized).
         */
        World ocean = new World();
        
        /*
         * We use the 'new' operator to construct an object (i.e., create, instantiate).
         * 
         * The class of the object is specified immediately after the new operator (e.g., Turtle).
         * 
         * If we need to pass additional info into the class, arguments may be specifed in parentheses (e.g., ocean).
         */
        
        Turtle crush = new Turtle(ocean);
    }
}
