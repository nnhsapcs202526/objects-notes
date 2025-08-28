
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
        
        /*
         *  Varibales store values to be used later in program.
         *          Variables have a type (e.g., int or Turtle)
         *                         a name (e.g., width or crush)
         *                         a value (e.g., 20 or a Turtle object reference)
         */
        int width;  // declare a variable with a type and name
        width = 20; // assign a value to a variable
        int xPosition = 50;  // both declare and assign in one line
        
        /*
         * Java has several type of primitive data types:
         *      - boolean holds a true or false
         *      - int holds an integer (whole number)
         *      - double holds a real number (floating point or decimals)
         *      - char holds a single character
         */
        
        // boolean
        boolean isSummer = true;
        
        // double
        double salesTaxRate = 0.0775;
        
        // char
        char letter = 'c';
        char question = '?';
        
        /*
         * When invoking methods, we use the dot operator (e.g., '.') to invoke a method on an object.
         * 
         * Some methods take no arguemnts, but we still need parentheses. (e.g., penDown)
         * 
         * Some methods take one or more arguments (e.g., forward).  Multiple arguments are separated by commas.
         * 
         * Mutator methods modify the state of the object (i.e., values of the attributes).
         *      e.g., forward, turnLeft, setPostion
         */
        crush.forward(100);
        crush.penUp();
        crush.turn(90);
        crush.forward(100);
        crush.penDown();
        crush.forward(100);
        crush.turnLeft();
        
        /*
         * Accessor methods return the value of an attribute of the object.
         *      The state of the object doesn't change.
         *      
         *      e.g., getPenWidth, getXPos
         */
        
        int penWidth = crush.getPenWidth();
        
        
        System.out.println("The current pen width of crush is: " + penWidth);
        
        System.out.println("The current pen width of crush is: " + penWidth);
        
        System.out.print("The current pen width of crush is: " + penWidth);
        
        System.out.print("The current pen width of crush is: " + penWidth);
        
        
        
        
        
        
        
        
    }
}
