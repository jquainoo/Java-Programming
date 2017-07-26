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
public class TrainFare{
	
	public static String ticketRate(int zone, String ticketType) throws Exception{
		char character = Character.toLowerCase(ticketType.charAt(0));
		switch(character){
		case 'a':
			switch(zone){
			case 2:
				return "Fare is $3";
			case 3:
				return "Fare is $4";
			case 4: 
				return "Fare is $6";
			default:
				return "ticket not found";
			}
		
		case 'c':
			switch(zone){
			case 1:
				return "Fare is $1.50";
			case 3:
				return "Fare is $3";
			case 4:
				return "Fare is $3";
			default:
				return "ticket not found";
			}
			
		}
		return "ticket out of range";
	}

	public static void main(String[] args) throws Exception{
		java.util.Scanner input = new java.util.Scanner(System.in);
		int zone; String tType;
		System.out.print("Enter a number for the zone: ");
		zone = input.nextInt();
		System.out.print("Enter ticket type (adult & child): ");
		tType = input.next();
		System.out.println(ticketRate(zone, tType));
		input.close();
	}

}
