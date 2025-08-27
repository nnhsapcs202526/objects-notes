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
        crush.forward(100);
        crush.turnRight();
        crush.forward(100);
        
        /*
         * This is a compile-time error.  (This code doesn't compile)
         * 
         * These are often syntax errors.
         */
        //crush.foward(50);
        
        /*
         * This is a run-time error.  (this code compiles and runs,
         *      but generates an exception (i.e., error) In most cases, 
         *      the program crashes.
         */
        //crush.forward(1/0);
        
        /*
         * This is also a run-time error.  (THis code compiles and runs,
         *      but turns right instead of left.  It doesn't produce the expected output.
         *      I intended for the turtle to turn left.
         *      
         *      This is a logical error.
         */
        crush.turn(90);
        crush.forward(100);
        
        /*
         * algorithm - a series of steps that we can follow. Must be:
         *      - unambiguous
         *      - executable
         *      - terminating
         *      
         * pseudocode - an informal description of an algorithm, 
         *      often using the english language and/or flowcharting,
         *      instead of a programming language.
         */
        
        
    }
    
    public static void drawLine()
    {
        World ocean = new World();
        
        Turtle crush = new Turtle(ocean);
    }
    
    
}
