/*Write a static method which takes an array of ints as its argument, and reverses the order of the elements in the array. 
 * That is, the first and last elements are switched, the second and second last elements are switched, etc. For example, 
 * this method should change the array [1, 2, 3, 4] to the array [4, 3, 2, 1]. Test your method by calling it in the main(..)
 *  method with at least three different input arrays.
 * @author leonjoel
 */
package cuny.lehman.cmp326;
public class ReverseArray {
	
	public class ReverseArray<T> {

	public static <T>  T[] reverseArray(T[] inArray){
		int low = 0; int high = inArray.length-1;
		while(low < high){
			T temp = inArray[low];
			inArray[low] = inArray[high];
			inArray[high] = temp;
			low++; high--;
		}
		return inArray;
	}

	public static void main(String[] args) {
		Integer[] array1 = {1,2,3,4,5,6,7,8,56,73,45};
		String[] array2 = {"Kofi", "Kwame","Yaw"};
		Double[] array3 = {13.2,567.35,56.0, 90.34, 206.6};
		System.out.println(java.util.Arrays.toString(ReverseArray.reverseArray(array2)));
		System.out.println(java.util.Arrays.toString(ReverseArray.reverseArray(array1)));
		System.out.println(java.util.Arrays.toString(ReverseArray.reverseArray(array3)));
	}

}
