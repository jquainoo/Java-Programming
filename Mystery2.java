/*
 * In a new class, implement the following psuedocode method mystery. Call it several times from the main() method to see what it does.

     	function mystery( num ) {
     		if num<2 {
         		print num
         		return
     		}
     		mystery(num/2)
     		print num % 2
     	}
 * @author leonjoel
 */
package cuny.lehman.cmp326;
public class Mystery2 {
	
	public static void mystery2(int num){
		if(num < 2){
			System.out.println(num);
			return;
		}
		else
			mystery2 (num / 2);
		System.out.println(num % 2);
		
	}

	public static void main(String[] args) {
		System.out.println("mystery2(4):"); 
		mystery2(4);
		System.out.println("mystery2(20):"); 
		mystery2(20);
		System.out.println("mystery2(100):");
		mystery2(100);
	}

}
