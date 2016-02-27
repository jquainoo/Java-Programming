/*Write a static method which takes an array of ints as its argument, and reverses the order of the elements in the array. 
 * That is, the first and last elements are switched, the second and second last elements are switched, etc. For example, 
 * this method should change the array [1, 2, 3, 4] to the array [4, 3, 2, 1]. Test your method by calling it in the main(..)
 *  method with at least three different input arrays.
 * @author leonjoel
 */
package cuny.lehman.cmp326;
public class ReverseArray {
	
	public static int[] reverseArray(int[] inArray){
		int[] outArray = new int[inArray.length];
		int i = 0; int j = inArray.length-1;
		while(i < inArray.length){
			outArray[i] = inArray[j];
			i++; j--;
		}
		return outArray;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,56,73,45};
		System.out.println(java.util.Arrays.toString(ReverseArray.reverseArray(arr)));
	}

}
