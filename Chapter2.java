import java.awt.Color;
/**
 * Chapter2 live-coding notes.
 *
 * @author mrcallaghan
 * @version 28aug2025
 */
public class Chapter2
{

    public static void drawLine()
    {
        /*
         * Objects are entities in a program.
         *      Objects have attributes.
         *      Object are manipulated by methods.
         *      
         * In the following lines, 'ocean' and 'crush' are variables referencing objects.
         * 
         * Classes describe a collection of objects.  (A template for creating objects)
         *      All objects of a class have the same behaviors (methods).
         *      and they have the same types of attributes (but may have different values for thos attributes).
         *      
         * 'World' and 'Turtle' are classes.
         */
        World ocean = new World();
        
        /*
         * We use the new operator to construct an object (i.e., create, instantiate).
         * 
         * The class of the object we are creating comes right after the new operator (e.g., Turtle).
         * 
         * If we need to pass additional information to the class constructor, we may pass arguments inside
         *      the parrentheses (e.g., ocean).
         */
        
        Turtle crush = new Turtle(ocean);
        
        
        /*
         * Variables store values to used later.
         * 
         *      Variables have a type (e.g., int, Turtle)
         *          a name (e.g., width, crush)
         *          a value (e.g., 20, 2.2, ???)
         */
        int width;      // declaring a variable
        width = 20;     // assigning a value to a variable
        int xPosition = 50;     // declaring and assigning in one line
        
        System.out.println("width variable stores the value " + width);
        
        /*
         * Java has several primitive data types:
         *  - boolean holds a value of true or false
         *  - int holds an integer number
         *  - double hold a real number (floating point, decimal)
         *  - char holds a single character
         */
         // here is boolean
         boolean isSummer = true;
         
         // here is a double
         double salesTaxRate = 0.0775;
         
         // here is a char
         char letter = 'c';
         
         /*
          * When invoking methods, we use the dot operator (i.e., '.')
          *     to invoke a method on an object.
          *     
          *     Some methods take no arguments, but we still need the parentheses (e.g., penDown).
          *     
          *     Some methods take one or more arguments (e.g., forward).
          *         Multiple arguments are separated by commas.
          *         
          *     Mutator methods modify the state of an object. (i.e., the values of the attributes change).
          *         e.g., forward, penDown, setPenColor
          */
         crush.penDown();
         crush.forward(100);
         crush.setPenColor(Color.RED);
         crush.forward(100);
         
         /*
          * Accessor methods return the value of an attribute of the object.
          *     The state of the object does not chage.
          *     
          *     getPenWidth() is an example of an accessor.
          */
         
         int penWidth = crush.getPenWidth();
         System.out.println("The current pen width is: " + penWidth);
         
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
