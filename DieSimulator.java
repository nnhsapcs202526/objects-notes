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
        // create a Random object
        Random generator = new Random();
        
        // generates number between 0 - 5, exclusive of argument value
        int roll = generator.nextInt(6);
        
        // update the roll to 1 - 6
        roll = roll + 1;
        
        System.out.println(roll);
        
        
        
    }
}
