import java.awt.Color;

/*
 * Every Java program contains one or more classes (e.g., TurtleDemo).
 * In general, every source file (e.g., TurtleDemo.java) contains one class (TurtleDemo).
 * 
 * The source file name must match the class name.
 * 
 * By convention, class names start with an uppercase letter.
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
        /*
         * A statement contains identifiers.
         * 
         * Identifiers may be any combination of:
         *      letters
         *      digits (but not the first character)
         *      underscores (_)
         *      dollar signs ($)  -- rare
         *      
         *      These are valid identifiers:
         */
        int y, x2, X_Y, total$;
        
        // this is a single-line comment in Java (like # in python)
        // this is not a valid identifier
        
        //int 2y;
        
        // identifiers are case-sensitive (case matters)
        
        // These are different identifiers:
        Turtle squirt, SQUIRT, sQuiRT;
        
        // These are not:
        //Turtle leo, leo;
        
        /*
         * By convention, constants are all uppercase.
         *  Use an underscore to separate words.
         */
        int SPEED_OF_LIGHT = 300000000; // m/s
        
        /*
         * By convention, most other identifiers start with a lowercase letter.
         *      Subsequent words start with an uppercase (CamalCase)
         */
        World pacificOcean;
        
        
        World ocean = new World();
        Turtle crush = new Turtle(ocean);
        crush.setPenColor(Color.ORANGE);
        crush.penDown();
        crush.forward(50);
    }
}
