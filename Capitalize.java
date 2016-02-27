/*
 * Write a method that takes in a String, and returns that same String, but with all the consonants in lower 
 * case and all the vowels in upper case. For example, the String "apple" would be returned as "ApplE", 
 * the String "a frog" would be returns as "A frOg", and the String "Toronto" would be returned as "tOrOntO".
 * Call this method with at least three different inputs in the main method to test it.
 * @author leonjoel
 */
package cuny.lehman.cmp326;
public class Capitalize {
	
	public static String CapitalizeVowel(String word){
		String vowel = "aeiou", newWord = ""; char character;
		for(int i = 0; i < word.length(); i++){
			character = word.charAt(i);
			for(int x = 0; x < vowel.length(); x++){
			if(character == vowel.charAt(x))
				character = Character.toUpperCase(character);
			}
			newWord += character;
		}
		return newWord;
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = input.nextLine().toLowerCase();
		System.out.println(CapitalizeVowel(word));
		input.close();
	}
}
