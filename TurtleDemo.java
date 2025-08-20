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
        
        
        
        
        
    }
}
