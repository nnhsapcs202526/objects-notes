import java.awt.Color;
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
        
        /*
         * The new operator used to construct objects (create, instantantiate).
         * 
         * The class of the object we are constructing is specified immediately after the new operator.
         * 
         * If we need more information passed into the class, we use an argument. (e.g., ocean)
         */
        
        Turtle crush = new Turtle(ocean);
        
        /*
         * Variable store values to be used later.
         *      Variables have a type (e.g., int, Turtle, etc.)
         *                     a name (e.g., crush, number1, etc.)
         *                     and a value (e.g., 20, 2.2, ???)
         *                   
         */
        int width;   // declaring a variable
        width = 20;  // assigning a value to the variable
        
        int xPosition = 50; // both declaring and assigning to a variable
        
        /*
         * Java has several primiitve data types:
         *      - boolean holds a true or false value
         *      - int holds an integer number (whole number)
         *      - double holds a real number (floating point, decimals)
         *      - char hold a single character
         */
        
        // boolean
        boolean isSummer = true;
        
        // here is a double
        double salesTaxRate = 0.0775;
        
        // here is a char
        char letter = 'c';  // single quotes!
        
        
        /*
         * When invoking methods, we use the dot operator (i.e., '.')
         *      to invoke a method on an object.
         *      
         * Some methods take no arguments, but we still need parentheses.  (e.g., penUp)
         * 
         * Some methods take one or more arguments. (e.g., forward)
         *      Multiple arguemnts are comma separated.
         * 
         * Mutator methods modify the state of the object (i.e., the values of the attributes)
         *      e.g., forward modifies the positon of the turtle, setPenColor changes the pen color of the turtle
         * 
         */
        
        crush.forward(100);
        crush.penUp();
        crush.forward(100);
        crush.setPenColor(Color.RED);
        crush.penDown();
        crush.turn(90);
        crush.forward(200);
        
        /*
         * Acccessor methods return the value of an attribute of the object.
         *      The state of the object doesn't change.
         *      
         *  getPenWidth is an example
         */
        width = crush.getPenWidth();
        System.out.println("Crush has a pen width of: " + width);
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
