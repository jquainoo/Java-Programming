/*
 * Write a program that asks the user for the zone and the ticket type, and displays the train fare.
If the zone is 2 or smaller and the ticket type is "adult," the fare is 3.
If the zone is 2 or smaller and the ticket type is "child," the fare is 1.50.
If the zone is 3 and the ticket type is "adult," the fare is 4.
If the zone is 3 or 4 and the ticket type is "child," the fare is 3.
If the zone is 4 and the ticket type is "adult," the fare is 6.
If the zone is greater than 4 or less than 1, or if the ticket type is neither "adult" not "child", 
then display an error message.
 * @author leonjoel
 *
 */
package cuny.lehman.cmp326;
public class TrainFare{
	
	public static String ticketRate(int zone, String ticketType) throws Exception{
		if(zone <= 2 && ticketType.charAt(0) == 'a' || ticketType.charAt(0) == 'A')
			return "Fare is $3.";
		else if(zone < 2 && ticketType.charAt(0) == 'c' || ticketType.charAt(0) == 'C')
			return "Fare is $1.50";
		else if(zone == 3 && ticketType.charAt(0) == 'a' || ticketType.charAt(0) == 'A')
			return "Fare is $4";
		else if(zone == 3 || zone == 4 && ticketType.charAt(0) == 'c' || ticketType.charAt(0) == 'C')
			return "Fare is $3";
		else if(zone == 4 && ticketType.charAt(0) == 'a' || ticketType.charAt(0) == 'A')
			return "Fare is $6";
		else
			return "ticket not found";
	}

	public static void main(String[] args) throws Exception{
		java.util.Scanner input = new java.util.Scanner(System.in);
		int zone; String tType;
		System.out.print("Enter a number for the zone: ");
		zone = input.nextInt();
		System.out.print("Enter ticket type (adult & child): ");
		tType = input.next();
		System.out.println();
		System.out.println(ticketRate(zone, tType));
		input.close();
	}

}
