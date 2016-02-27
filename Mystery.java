/* In a new class, implement the following pseudocode method mystery. Call it several times from the main() method to see what it does.

     	function mystery(num) {
     		if num <= 0 then
     			return 1
     		return 3*mystery(num -1)
     	}
 * @author leonjoel
 */
package cuny.lehman.cmp326;
public class Mystery {
	
	public static int mystery(int num){
		if(num <= 0)
			return 1;
		else
			return 3 * mystery(num - 1);
	}

	public static void main(String[] args) {
		System.out.println(mystery(3));
		System.out.println(mystery(5));
	}
}
