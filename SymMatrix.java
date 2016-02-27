/*Write a static method which takes a 2-dimensional array of type int, which represents a matrix, as its argument, 
 * and returns true if the matrix is symmetric and false otherwise. A matrix is symmetric if the entry at row i and 
 * column j is the same as the entry at row j and column i for each i and j. The diagonal entries (i.e. entries with 
 * the same row and column) can be any number. Test your method by calling it in the main(..) method with at least 
 * three different input arrays. Name this class SymMatrix.
 * @author leonjoel
 */
package cuny.lehman.cmp326;
public class SymMatrix {
	
	public static boolean isASymmetricalMatrix(int[][] matrix){
		boolean isSym = false;
		for(int row = 0; row < matrix.length; row++){
			for(int col = 0; col < matrix[row].length; col++){
				if(matrix[row][col] == matrix[col][row])
					isSym = true;
				else
					isSym = false;
			}
		}
		return isSym;
	}
	
	public static void Matrix(){
		int[][] matrix = {{1,2},{6,7}};
		for(int row = 0; row < matrix.length; row++){
			for(int col = 0; col < matrix[row].length; col++){
				System.out.print(matrix[col][row] + " ");
			
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Matrix();
	}
}
