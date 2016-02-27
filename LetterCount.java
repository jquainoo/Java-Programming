/*
 * Write a program that asks the user for the name of a input file, an output file, and a letter. Write each line of the
 *  input file to the output file, followed by the number of times that the letter appears in that line.
Name this class LetterCount
 @leonjoel
 */
package cuny.lehman.cmp326;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LetterCount {
	
	public static void readFile(String inputFile, String outputFile, char ch){
		java.io.File file = new java.io.File(inputFile);
		java.util.ArrayList<String> list = new java.util.ArrayList<>();
		
		try(
				Scanner read = new Scanner(file);
				PrintWriter writer = new PrintWriter(outputFile, "UTF-8");
				)
		{
			while(read.hasNextLine()){
				String line = "";
				line = read.nextLine();
				list.add(line);
			}
			
			for(int i = 0; i < list.size(); i++){
				int count = 0;
				for(int m = 0; m < list.get(i).length(); m++){
					if(list.get(i).charAt(m) == Character.toLowerCase(ch) || list.get(i).charAt(m) == Character.toUpperCase(ch))
						count++;
				}
				writer.println(list.get(i) + "   Count of '" +ch+ "' = "+ count);
			}
		}
		catch(java.io.FileNotFoundException  ex){
			System.out.println(ex.getMessage());
		}
		catch (IOException ex){
			System.out.println(ex.getMessage());
		}
	}

	public static void main(String[] args) throws Exception{
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter name of input file. eg.'file.txt': ");
		String inputFile = input.nextLine();
		System.out.print("Enter name of output file. eg.'file.txt': ");
		String outputFile = input.nextLine();
		System.out.println("Enter a character you want to count: ");
		char character = input.nextLine().charAt(0);
		readFile(inputFile, outputFile, character);
		input.close();
	}

}
