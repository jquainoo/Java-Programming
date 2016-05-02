package cuny.lehman.cmp326;
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
   
public static void main(String[] args) throws IOException
   {
      double sum = 0;      // The sum of the numbers
      int count = 0;       // The number of numbers added
      double mean = 0;     // The average of the numbers
      double stdDev = 0;   // The standard deviation
      String line;         // To hold a line from the file
      double difference;   // The value and mean difference
      ArrayList<Double> values = new ArrayList<>();

      Scanner keyboard = new Scanner (System.in);
      String filename;  

      System.out.println("This program calculates " +
                         "statistics on a file " +
                         "containing a series of numbers");
      System.out.print("Enter the file name:  ");
      filename = keyboard.nextLine();
      keyboard.close();
      
      FileReader File = new FileReader(filename);
      BufferedReader readFile = new BufferedReader(File);
      line = readFile.readLine();
      while(true){
    	  line = readFile.readLine();
    	  if(line == null)
    		  break;
    	  else{
    		  values.add(Double.parseDouble(line));
    		 sum += Double.valueOf(line);
        	 count += 1; 
    	  }	
      }
      readFile.close();
      System.out.println(count);
      mean = sum / count;
      
      FileReader File_read = new FileReader(filename);
      BufferedReader read_File = new BufferedReader(File_read);
      sum = 0; count = 0;
      line = read_File.readLine();
      while(true){
    	  line = read_File.readLine();
    	  if(line == null)
    		  break;
    	  else{
    		  difference = (Double.valueOf(line) - mean);
    		  sum += Math.pow(difference, 2);
    		  count += 1;  
    	  }
      }
      read_File.close();
      stdDev = Math.sqrt(sum / count - 1);
      
      FileWriter write = new FileWriter("Result.txt");
      PrintWriter output = new PrintWriter(write);
      output.printf("Mean of %s = %.3f.\n\n", values.toString(), mean);
      output.printf("Standard Deviation of %s  = %.3f.",values.toString(), stdDev);
      output.close();
   }
}
