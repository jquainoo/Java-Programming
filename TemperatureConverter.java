/*
 * Write a Java program in the Eclipse IDE that reads a Celsius degree in double from the console,
 *  then converts it to Fahrenheit and displays the result. The formula for the conversion is as follows:
 * @author leonjoel
 *
 */
package cuny.lehman.cmp326;
public class TemperatureConverter {

	public static void main(String[] args) {
		System.out.println("This program cnverts temperature in celcius to fahrenheit");
		double celcius;
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter temperature in degree celcius: ");
		celcius = input.nextDouble();
		System.out.println("Temperature is " + (9.0/5) * celcius + 32 +" fahrenheit.");
		input.close();

	}

}
