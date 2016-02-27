package cuny.lehman.cmp326;
public class TicketNotFoundException extends Exception{
	private static final long serialVersionUID = 1L;
	int ticket;

	public TicketNotFoundException(int ticket){
		super();
	}
	
	public String getMessage(){
		return "Invalid ticket category";
	}
	

}
