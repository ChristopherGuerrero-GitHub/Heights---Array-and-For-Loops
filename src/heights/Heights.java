
package heights;
import java.util.Scanner;

/**
 *
 * @author Christopher
 */
public class Heights {

    public static void main(String[] args) {

        /*
         This program uses an Array to insert primitive data with a for loop with 
         the user and then for loop thru the array to print the data and find the
         average value.
        
         This program asks the user for the heights of each student in the 
         classroom. Then finds the height of the tallest student, and the average
         height of all students.
        */
        
        Scanner in = new Scanner(System.in);
        int numStudents;
        double [] heights;
        
        System.out.println("How many students do you have? ");
        numStudents = in.nextInt();
        
        heights = new double [numStudents];
        
        //Gather input from the user the height of each student and store
        //in height array.
        for(int i = 0; i < numStudents; i++){
            
            System.out.println("Enter the height: ");
            heights[i] = in.nextDouble();
                        
        }
        
        double maxHeight = heights[0];
        
        //Determine the largest height value within the array of heights
        for(int i = 0; i < heights.length; i++){
            
            if (maxHeight < heights[i])
                maxHeight = heights[i];
                
        }
        
        double total =0;
        //Accumulate the total values of all the heights in the array.
        for(int i = 0; i < heights.length; i++){
            
            total += heights[i];
        }
        
        //print out the results if tallest value and the average height value.
        System.out.println("The tallest student is: " + maxHeight + " inches");
        System.out.println("The average height of all the students is: "
                + (total/numStudents) + " inches");
        
    }
    
}
