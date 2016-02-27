package cuny.lehman.cmp326;
public class Divideby {

	public static void main(String[] args) {
		int a = 7; 
		int b = 0;
		try{
			int sum = a / b;
			System.out.println(sum);
		}
		catch(ArithmeticException e){
			System.out.println("Cannot divide by zero");
		
		}
		finally{
			System.out.println(a + b);
		}
		

	}

}
