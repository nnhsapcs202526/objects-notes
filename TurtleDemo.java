import java.awt.Color;

/*
 * Every Java program contains one or more classes (e.g., TurtleDemo).
 * 
 * In general, every source file (e.g., TurtleDemo.java) contains one class (e.g., TurtleDemo).
 * 
 * The source file name must match the class name.
 * 
 * By convention, class names start with an upipercase letter.
 */

public class TurtleDemo
{
    /*
     * A class contains methods.
     * 
     * Most Java programs contain a class with a main method.
     * 
     * The main method is executed when the program starts.
     */
    public static void main()
    {
        World ocean = new World();
        Turtle crush = new Turtle(ocean);
        crush.setPenColor(Color.ORANGE);
        crush.penDown();
        crush.forward(50);
        
        /*
         * A method contains statements.
         * 
         * Statements may invoke other methods (e.g., forward).
         * 
         * In general, methods are invoked on objects (e.g., crush).
         * 
         * When invoking a method, arguments may be passed in parentheses (e.g., 50).
         * 
         */
        crush.forward(100);
        crush.turnLeft();
        crush.forward(100);
        
        // this is a single-line comment (like a # in python)
        
        /*
         * A statement contain identifiers.
         * 
         * Identifiers may have any conbination of:
         *      letters
         *      numbers (as long as it's not the first character)
         *      underscores ( _ _ )
         *      dollar sign ($)  -- rare
         *      
         *  These are valid identifiers:
         */
        
        int x, y2, X_Y, total$;
        
        int x2 = 5;
        
        // this is not a valid identifier
        //int 2y;
        
        /*
         * Also, identifiers are case sensitive (case matter).
         * 
         * These are different:
         */
        Turtle squirt, SQUIRT, SqUIRt;
        
        // not OK because two identifers cannot have the same name and case structure
        //Turtle leo, leo;
        
        /*
         * This is a compile time error.
         * 
         * The code doesn't compile.  Often called syntax errors.
         * 
         */
        //crush.forwad(50);
        //crush.forward(100)
        
        /*
         * This is a run-time error.  (This code compiles, runs,
         *      but generates an exception.  In most cases the program crashes.)
         */
        //crush.forward(1/0);
        
        
        /*
         * This is also a run-time error.  (This code compiles and runs, but
         *      it doesn't produce the expected results.)
         *      
         *      This is a logical error.
         *      
         *  The turtle turns left instead of right (I intend to turn right).
         */
        crush.turn(-90);
        crush.forward(100);
        
        
    }
}









