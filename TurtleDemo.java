import java.awt.Color;

/*
 * Every Java program contains one or more classes (e.g., TurtleDemo).
 * 
 * In general, every source file (e.g., TurtleDemo.java) contains one class (e.g., TurtleDemo)
 * 
 * The source file name must match the class name.
 * 
 * By convention, class names starts with an uppercase letter.
 * 
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
    public static void main(String[] args)
    {
        World ocean = new World();
        Turtle crush = new Turtle(ocean);
        crush.setPenColor(Color.ORANGE);
        crush.penDown();
        crush.forward(50);
        
        /*
         * A method contains statements.
         * 
         * Statements may invoke other method (e.g., forward)
         * 
         * In general, methods are ivoked on objects (e.g., crush).
         * 
         * When invoking a method, arguments are passed in parentheses (e.g., 50).
         */
        crush.forward(100);
        
        /*
         * A statement contains identifiers.
         * 
         * Identifiers may have any condination of:
         *      letters
         *      numbers (but not as the first character)
         *      underscores (___)
         *      dollar signs ($)  -- rare
         *      
         *  These are valid identifiers:
         */
        int y, x2, X_Y, total$;  // examples of variable identifiers
        
        // this is not a valid identifier
        //int 2y;
        
        // single line comment is a // instead of like python, where it is #
        
        /*
         * Identifers are case sensitive (case matters)
         * 
         * These are different:
         */
        Turtle squirt, SQUIRT, SquIRt;
        
        /*
         * By convention, constant are all uppercase.  Use an underscore for new words.
         */
        int SPEED_OF_LIGHT = 300000000;  // m/s
        
        /*
         * By convention, most other identifiers start with a lowercase letter.
         *      Subsequent words start with an uppercase character (CamalCase)
         */
        World pacificOcean;
        
        /*
         * This is a compile itme error. (this code doesn't compile)
         * 
         * These are often called syntax errors.
         */
        //crush.foward(50);
        //System.out.println("Hello, world.")
        
        /*
         * This is a run-time error.  The code compiles
         *  and runs, but generates an exception.  In most cases the program crashes.
         */
        //crush.forward(1/0);
        
        /*
         * This is also a run-time error.  (This code compiles and runs,
         *      but it doesn't produce the expected output.)
         *      
         *      More specifically, this is a logical error.
         *      
         *      e.g., The turtle turns left instead of right.
         */
        crush.turn(-90);
        crush.forward(100);
        
        /*
         * algorithm - A series of steps we can follow.  Must be: 
         *      - unambiguous
         *      - executable
         *      - terminating
         *      
         * pseudocode  - An informal representation of an algorithm that may use English and/or symbols.
         *      Useful for designing algorithms before writing code.
         *      
         */
        
        
        
        
        
        
        
        
        
        
    }
}
