
/**
 * Chapter 2 Notes.
 *
 * @author mrcallaghan
 * @version 27aug2025
 */
public class Chapter2
{
    // we must write programs inside of methods; below is a compile-time error
    //System.out.println("Hello, world!");
    
    public static void drawLine()
    {
        /*
         * Objects are entities in a program.
         *      they have attributes
         *      they are manipulated by ivoking methods
         *      
         * Below, 'ocean' and 'crush' are variables referencing objects.
         * 
         * Classes describe a collection of objects.  (like a template for objects)
         *      All objects of a class have the same bahaviors (methods)
         *      and they have the same attributes (characteristics)
         *      (but they may have differing values for those attributes)
         *      
         *  World and Turtle are classes.
         */
        World ocean = new World();
        
        Turtle crush = new Turtle(ocean);
    }
}
