import java.util.Random;

/**
 * Write a description of class DieSimulator here.
 *
 * @author mrcallaghan
 * @version 09sep2025
 */
public class DieSimulator
{
    public static void main()
    {
        // create Random object
        Random generator = new Random();
        
        // generate random integer between 0 and 5
        int roll = generator.nextInt(6);
        int roll2 = generator.nextInt(1,7);
        
        // increment the range
        //roll = roll + 1;
        roll += 1;
        
        System.out.println(roll);
    }
}
