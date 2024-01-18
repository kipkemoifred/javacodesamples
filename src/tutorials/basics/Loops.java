package tutorials.basics;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Loops {
    // Create a logger
    private static final Logger logger = Logger.getLogger(Loops.class.getName());

    public static void main(String[] args) {

        int nums[]={1,2,3,4,5};
        for(int i:nums){
            System.out.println(i);
        }

        //mda
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]); // Outputs 7

        // Log messages at different levels
        logger.info("This is an informational message.");
        logger.warning("This is a warning message.");
        logger.log(Level.SEVERE, "This is a severe message with an exception.", new Exception("Example Exception"));

    }


}
