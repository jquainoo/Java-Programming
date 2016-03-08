package cuny.lehman.cmp326;
//import statements here
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
   This class reads numbers from a file, calculates the
   mean and standard deviation, and writes the results
   to a file.
*/

public class StatsDemo
{
   // Adds the throws clause
public static void main(String[] args) throws IOException
   {
      double sum = 0;      // The sum of the numbers
      int count = 0;       // The number of numbers added
      double mean = 0;     // The average of the numbers
      double stdDev = 0;   // The standard deviation
      String line;         // To hold a line from the file
      double difference;   // The value and mean difference
      ArrayList<Double> values = new ArrayList<>();

      // Creates an object of type Scanner
      Scanner keyboard = new Scanner (System.in);
      String filename;     // The user input file name

      // Prompts the user and read in the file name
      System.out.println("This program calculates " +
                         "statistics on a file " +
                         "containing a series of numbers");
      System.out.print("Enter the file name:  ");
      filename = keyboard.nextLine();
      keyboard.close();
      
      // Creates a FileReader object passing it the filename
      FileReader File = new FileReader(filename);
      // Create a BufferedReader object passing FileReader object
      BufferedReader readFile = new BufferedReader(File);
      // Performs a priming read to read the first line of
      // the file
      line = readFile.readLine();
      // Loops until you are at the end of the file
      while(true){
    	  line = readFile.readLine();
    	  if(line == null)
    		  break;
    	// Reads a new line from the file
    	  else{
    		  values.add(Double.parseDouble(line));
    		// Converts the line to a double value and add the
    	    // value to sum
    		 sum += Double.valueOf(line);
        	 count += 1; 
    	  }	
      }
      // Closes the input file
      readFile.close();
      // Stores the calculated mean
      System.out.println(count);
      mean = sum / count;

      // Reconnects FileReader object passing it the
      // filename
      FileReader File_read = new FileReader(filename);
      // Reconnects BufferedReader object passing
      // FileReader object
      BufferedReader read_File = new BufferedReader(File_read);
      // Reinitializes the sum of the numbers
      sum = 0;
      // Reinitializes the number of numbers added
      count = 0;
      // Performs a priming read to read the first line of
      // the file
      line = read_File.readLine();
      // Loops until you are at the end of the file
      while(true){
    	  line = read_File.readLine();
    	  if(line == null)
    		  break;
    	  else{
    		  // Converts the line into a double value and
    	      // subtract the mean
    		  difference = (Double.valueOf(line) - mean);
    	      // Adds the square of the difference to the sum
    		  sum += Math.pow(difference, 2);
    		// Increments the counter
    		  count += 1;  
    	  }	 
    	// Reads a new line from the file
      }
      // Closes the input file
      read_File.close();
      // Stores the calculated standard deviation
      stdDev = Math.sqrt(sum / count - 1);

      // Creates a FileWriter object using "Results.txt"
      FileWriter write = new FileWriter("Result.txt");
      // Creates a PrintWriter object passing the
      // FileWriter object
      PrintWriter output = new PrintWriter(write);
      // Prints the results to the output file
      output.printf("Mean of %s = %.3f.\n\n", values.toString(), mean);
      output.printf("Standard Deviation of %s  = %.3f.",values.toString(), stdDev);
      // Closes the output file
      output.close();
   }
}